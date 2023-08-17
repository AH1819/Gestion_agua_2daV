package Dao;

import Conexion.ConexionBD;
import Modelo.LecturaPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LecturapagoDao {

    private static ResultSet Resultado;
    private final ConexionBD conexion = ConexionBD.getInstance();
    LecturaPago lectura;
    ArrayList<LecturaPago> CD;

    public LecturaPago Mes_adeudo(int id) {
        lectura = new LecturaPago();
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
                lectura.setIdLectPago(Resultado.getInt("id_lect_pago"));
                lectura.setFechaHora(Resultado.getDate("fecha_hora"));
                lectura.setAdeudo(Resultado.getDouble("adeudo"));
                lectura.setMes(Resultado.getString("mes"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LecturapagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lectura;
    }

    public ArrayList<LecturaPago> Meses_adeudo(int id) {
        CD = new ArrayList<>();

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
                lectura = new LecturaPago();
                lectura.setIdLectPago(Resultado.getInt("id_lect_pago"));
                lectura.setFechaHora(Resultado.getDate("fecha_hora"));
                lectura.setAdeudo(Resultado.getDouble("adeudo"));
                lectura.setMes(Resultado.getString("mes"));
                CD.add(lectura);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LecturapagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public ArrayList<LecturaPago> MostrarLecturas() {
        CD = new ArrayList<>();

        String sql = "select distinct on (ct.folio_contrato) ct.folio_contrato, lp.consumo,(cl.nombre ||' '||cl.apellido_p||' '||cl.apellido_m) as nombre, ct.folio_cte, lp.id_lect_pago,lp.fecha_hora,cp.meses,cp.tipo_periodo,"
                + "date_part('year', age(CURRENT_DATE, fecha_hora)) * 12 + date_part('month', age(CURRENT_DATE, fecha_hora)) as tiempo_transcurrido, lp.status,lp.lectura_ini,lp.lectura_fin "
                + "from contrato ct "
                + "inner join lectura_pago lp "
                + "on lp.folio_contrato = ct.folio_contrato "
                + "inner join cat_periodo cp "
                + "on cp.id_periodo = ct.id_periodo "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "ORDER BY ct.folio_contrato,lp.fecha_hora DESC";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                lectura = new LecturaPago();
                lectura.setFolio_contrato(Resultado.getInt("folio_contrato"));
                lectura.setConsumo(Resultado.getDouble("consumo"));
                lectura.setFolio_cliente(Resultado.getInt("folio_cte"));
                lectura.setNombre_cliente(Resultado.getString("nombre"));
                lectura.setIdLectPago(Resultado.getInt("id_lect_pago"));
                lectura.setFechaHora(Resultado.getDate("fecha_hora"));
                lectura.setMes(Resultado.getString("meses"));
                lectura.setTipo_periodo(Resultado.getString("tipo_periodo"));
                lectura.setTiempo_transcurrido(Resultado.getString("tiempo_transcurrido"));
                lectura.setStatus(Resultado.getString("status"));
                lectura.setLecturaIni(Resultado.getDouble("lectura_ini"));
                lectura.setLecturaFin(Resultado.getDouble("lectura_fin"));
                CD.add(lectura);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LecturapagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public List<LecturaPago> BuscarLecturas(int folio) {
        CD = new ArrayList<>();

        String sql = "select * from lectura_pago where folio_contrato = ? order by fecha_hora desc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                lectura = new LecturaPago();
                lectura.setFolio_contrato(Resultado.getInt("folio_contrato"));
                lectura.setLecturaIni(Resultado.getDouble("lectura_ini"));
                lectura.setLecturaFin(Resultado.getDouble("lectura_fin"));
                lectura.setConsumo(Resultado.getDouble("consumo"));
                CD.add(lectura);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LecturapagoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public int InsertarLecturapago(LecturaPago lecturapago) {
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
            return 1;
        } catch (SQLException e) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }

    public int InsertarLecturapagoFijo(Double lecturapago, int folio, int mes) {
        int ret = 0;
        String sql = "insert into lectura_pago(importe,folio_contrato,id_m)values(?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setDouble(1, lecturapago);
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

    public int InsertarLecturapagoFijo(Double lecturapago, int folio, int mes, boolean fijo) {
        int ret = 0;
        String sql = "insert into lectura_pago(importe,folio_contrato,id_m, costo_fijo)values(?,?,?,?)";
        System.out.println("insercción " + lecturapago + "  " + "  " + folio + "  " + mes + "  " + fijo);
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setDouble(1, lecturapago);
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
