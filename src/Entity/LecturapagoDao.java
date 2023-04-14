package Entity;

import Conexion.ConexionBD;
import Dao.Cat_descuentoDao;
import Dao.ContratoDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturapagoDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    public List<LecturaPago> Mes_adeudo(int id) {
        List<LecturaPago> CD = new ArrayList<>();

        String sql = "select lp.id_lect_pago,lp.fecha_hora,ct.mes,lp.adeudo "
                + "from lectura_pago lp "
                + "inner join cat_mes ct "
                + "on ct.id_m = lp.id_m "
                + "where lp.folio_contrato = ? "
                + "and lp.status = 'En Proceso' "
                + "order by lp.fecha_hora asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                LecturaPago cd = new LecturaPago();
                cd.setIdLectPago(Resultado.getInt("id_lect_pago"));
                cd.setFechaHora(Resultado.getDate("fecha_hora"));
                cd.setAdeudo(Resultado.getDouble("adeudo"));
                cd.setMes(Resultado.getString("mes"));
                CD.add(cd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public List<LecturaPago> Meses_adeudo(int id) {
        List<LecturaPago> CD = new ArrayList<>();

        String sql = "select lp.id_lect_pago,lp.fecha_hora,ct.mes,lp.adeudo "
                + "from lectura_pago lp "
                + "inner join cat_mes ct "
                + "on ct.id_m = lp.id_m "
                + "where lp.folio_contrato = ? "
                + "and lp.status = 'En Proceso' "
                + "order by lp.fecha_hora asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                LecturaPago cd = new LecturaPago();
                cd.setIdLectPago(Resultado.getInt("id_lect_pago"));
                cd.setFechaHora(Resultado.getDate("fecha_hora"));
                cd.setAdeudo(Resultado.getDouble("adeudo"));
                cd.setMes(Resultado.getString("mes"));
                CD.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public List<LecturaPago> MostrarLecturas() {
        List<LecturaPago> CD = new ArrayList<>();

        String sql = "select ct.folio_contrato, lp.consumo,cl.nombre, ct.folio_cte, lp.id_lect_pago,lp.fecha_hora,cp.meses,cp.tipo_periodo,"
                + "(age(date'now()',date(lp.fecha_hora))) as tiempo_transcurrido "
                + "from contrato ct "
                + "inner join lectura_pago lp "
                + "on lp.folio_contrato = ct.folio_contrato "
                + "inner join cat_periodo cp "
                + "on cp.id_periodo = ct.id_periodo "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte order by id_lect_pago asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                LecturaPago cd = new LecturaPago();
                cd.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cd.setConsumo(Resultado.getDouble("consumo"));
                cd.setFolio_cliente(Resultado.getInt("folio_cte"));
                cd.setNombre_cliente(Resultado.getString("nombre"));
                cd.setIdLectPago(Resultado.getInt("id_lect_pago"));
                cd.setFechaHora(Resultado.getDate("fecha_hora"));
                cd.setMes(Resultado.getString("meses"));
                cd.setTipo_periodo(Resultado.getString("tipo_periodo"));
                cd.setTiempo_transcurrido(Resultado.getString("tiempo_transcurrido"));
                CD.add(cd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public List<LecturaPago> BuscarLecturas(int folio) {
        List<LecturaPago> CD = new ArrayList<>();

        String sql = "select * from lectura_pago where folio_contrato = ? order by fecha_hora desc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                LecturaPago cd = new LecturaPago();
                cd.setFolio_contrato(Resultado.getInt("folio_contrato"));
                cd.setLecturaIni(Resultado.getDouble("lectura_ini"));
                cd.setLecturaFin(Resultado.getDouble("lectura_fin"));
                cd.setConsumo(Resultado.getDouble("consumo"));
                CD.add(cd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(LecturapagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CD;
    }

    public int InsertarLecturapago(LecturaPago lecturapago) {
        int ret = 0;
        String sql = "insert into lectura_pago(lectura_ini,lectura_fin,consumo,folio_contrato,id_m)values(?,?,?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setDouble(1, lecturapago.getLecturaIni());
            comando.setDouble(2, lecturapago.getLecturaFin());
            comando.setDouble(3, lecturapago.getConsumo());
            comando.setInt(4, lecturapago.getFolio_contrato());
            comando.setInt(5, lecturapago.getId_m());

            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            ret = 1;
        } catch (SQLException e) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
            ret = -1;
        }
        return ret;
    }

    public int InsertarLecturapagoFijo(float lecturapago, int folio, int mes) {
        int ret = 0;
        String sql = "insert into lectura_pago(importe,folio_contrato,id_m)values(?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setFloat(1, lecturapago);
            comando.setInt(2, folio);
            comando.setInt(3, mes);

            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            ret = 1;
        } catch (SQLException e) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
            ret = -1;
        }
        return ret;
    }

    public int InsertarLecturapagoFijo(float lecturapago, int folio, int mes, boolean fijo) {
        int ret = 0;
        String sql = "insert into lectura_pago(importe,folio_contrato,id_m, costo_fijo)values(?,?,?,?)";
        System.out.println("insercción " + lecturapago + "  " + "  " + folio + "  " + mes + "  " + fijo);
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setFloat(1, lecturapago);
            comando.setInt(2, folio);
            comando.setInt(3, mes);
            comando.setBoolean(4, fijo);

            comando.executeUpdate();

            System.out.println("sentencia " + comando);

            conexion.conectar().close();
            comando.close();
            ret = 1;
        } catch (SQLException e) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
            ret = -1;
        }
        return ret;
    }

}
