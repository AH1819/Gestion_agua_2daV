package Dao;

import Conexion.ConexionBD;
import Modelo.Contrato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Setter;

public class ContratoDao {

    private static ResultSet Resultado;
    private final ConexionBD conexion = ConexionBD.getInstance();
    private PreparedStatement comando = null;
    @Setter
    Contrato contrato;

    public int InsertarContrato() {
        int ret = 0;

        String sql = "insert into contrato (municipio,residencia,nombre_calle,calle_referencia,observaciones,numero_mzn,numero_lt,consec,id_consumo,id_periodo,folio_cte,status) values (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, contrato.getMunicipio());
            comando.setString(2, contrato.getResidencia());
            comando.setString(3, contrato.getNombreCalle());
            comando.setString(4, contrato.getCalleReferencia());
            comando.setString(5, contrato.getObservaciones());
            comando.setInt(6, contrato.getNumeroMzn());
            comando.setInt(7, contrato.getNumeroLt());
            comando.setInt(8, contrato.getConsec());
            comando.setInt(9, contrato.getId_consumo());
            comando.setInt(10, contrato.getId_periodo());
            comando.setInt(11, contrato.getFolio_cte());
            comando.setString(12, contrato.getStatus());

            comando.executeUpdate();

            Resultado = comando.getGeneratedKeys();

            if (Resultado.next()) {
                ret = Resultado.getInt(1);
            }

            conexion.conectar().close();
            comando.close();

            return ret;
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public boolean ActualizarContrato() {
        boolean ret;

        String sql
                = "update contrato set municipio = ? , "
                + "residencia = ?, "
                + "nombre_calle = ?, "
                + "calle_referencia = ?,"
                + "observaciones = ?, "
                + "numero_mzn = ?, "
                + "numero_lt = ?, "
                + "consec = ?, "
                + "id_consumo = ?, "
                + "id_periodo = ? "
                + "where folio_contrato = ?";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, contrato.getMunicipio());
            comando.setString(2, contrato.getResidencia());
            comando.setString(3, contrato.getNombreCalle());
            comando.setString(4, contrato.getCalleReferencia());
            comando.setString(5, contrato.getObservaciones());
            comando.setInt(6, contrato.getNumeroMzn());
            comando.setInt(7, contrato.getNumeroLt());
            comando.setInt(8, contrato.getConsec());
            comando.setInt(9, contrato.getId_consumo());
            comando.setInt(10, contrato.getId_periodo());
            comando.setInt(11, contrato.getFolioContrato());

            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();

            ret = true;

        } catch (SQLException ex) {
            System.out.println(ex);
            ret = false;
        }
        return ret;
    }

    public ArrayList<Contrato> MostrarContratos(int opcion) {
        ArrayList<Contrato> CT = new ArrayList<>();
        String opcionTipo = "";
        switch (opcion) {
            case 0:
                opcionTipo = " ";
                break;
            case 1:
                opcionTipo = "where ct.status = 'activo'";
                break;
            case 2:
                opcionTipo = "where ct.status = 'inactivo'";
                break;
        }
        String sql = "select ct.folio_contrato,cl.nombre,ct.municipio,"
                + "ct.residencia,ct.nombre_calle,ct.calle_referencia,"
                + "ct.numero_mzn,ct.numero_lt,ct.consec,cc.tipo_consumo,"
                + "cp.tipo_periodo,ct.deuda,ct.folio_cte,ct.status "
                + "from contrato ct "
                + "inner join cat_consumo cc "
                + "on cc.id_consumo = ct.id_consumo "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "inner join cat_periodo cp "
                + "on cp.id_periodo = ct.id_periodo "
                + opcionTipo
                + "order by folio_contrato";

        try {

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Contrato ct = new Contrato();
                ct.setFolioContrato(Integer.parseInt(Resultado.getString("folio_contrato")));
                ct.setNombre(Resultado.getString("nombre"));
                ct.setMunicipio(Resultado.getString("municipio"));
                ct.setResidencia(Resultado.getString("residencia"));
                ct.setNombreCalle(Resultado.getString("nombre_calle"));
                ct.setCalleReferencia(Resultado.getString("calle_referencia"));
                ct.setNumeroMzn(Resultado.getInt("numero_mzn"));
                ct.setNumeroLt(Resultado.getInt("numero_lt"));
                ct.setConsec(Resultado.getInt("consec"));
                ct.setTipo_consumo(Resultado.getString("tipo_consumo"));
                ct.setTipo_periodo(Resultado.getString("tipo_periodo"));
                ct.setFolio_cte(Resultado.getInt("folio_cte"));
                ct.setStatus(Resultado.getString("status"));
                ct.setDeuda(Resultado.getDouble("deuda"));
                CT.add(ct);
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CT;
    }

    public boolean DarDeBajaContrato(int folio) {
        boolean ret;
        String status = "inactivo";
        String sql = "update contrato set status = ? where folio_contrato = ?";

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            comando.executeUpdate();

            ret = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
            ret = false;
        }
        return ret;
    }

    public boolean DarDeAltaContrato(int folio) {
        boolean ret;
        String status = "activo";
        String sql = "update contrato set status = ? where folio_contrato = ?";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, status);
            comando.setInt(2, folio);

            comando.executeUpdate();

            ret = true;

        } catch (SQLException ex) {

            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());

            ret = false;

        }
        return ret;
    }

    public Contrato SearchContratos_c(int folio) {
        contrato = new Contrato();

        String sql = "select * from contrato where folio_contrato = ?";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            if (Resultado.next()) {
                contrato.setFolioContrato(Integer.parseInt(Resultado.getString("folio_contrato")));
                contrato.setMunicipio(Resultado.getString("municipio"));
                contrato.setResidencia(Resultado.getString("residencia"));
                contrato.setNombreCalle(Resultado.getString("nombre_calle"));
                contrato.setCalleReferencia(Resultado.getString("calle_referencia"));
                contrato.setObservaciones(Resultado.getString("observaciones"));
                contrato.setNumeroMzn(Resultado.getInt("numero_mzn"));
                contrato.setNumeroLt(Resultado.getInt("numero_lt"));
                contrato.setConsec(Resultado.getInt("consec"));
                contrato.setId_consumo(Resultado.getInt("id_consumo"));
                contrato.setId_periodo(Resultado.getInt("id_periodo"));
                contrato.setFolio_cte(Resultado.getInt("folio_cte"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contrato;
    }

    public List<Contrato> ContratosC(int folio) {
        List<Contrato> SCT = new ArrayList<>();

        String sql = "select cliente.nombre,cliente.apellido_p,cliente.apellido_m,contrato.folio_contrato,contrato.municipio,contrato.residencia,"
                + "contrato.numero_mzn,contrato.numero_lt,contrato.deuda,contrato.status "
                + "from contrato "
                + "inner join cliente "
                + "on cliente.folio_cte = contrato.folio_cte "
                + "where cliente.folio_cte =?"
                + "order by contrato.status ASC";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Contrato ct = new Contrato();
                ct.setFolioContrato(Integer.parseInt(Resultado.getString("folio_contrato")));
                ct.setMunicipio(Resultado.getString("municipio"));
                ct.setResidencia(Resultado.getString("residencia"));
                ct.setNumeroMzn(Resultado.getInt("numero_mzn"));
                ct.setNumeroLt(Resultado.getInt("numero_lt"));
                ct.setDeuda(Resultado.getDouble("deuda"));
                ct.setStatus(Resultado.getString("status"));
                ct.setNombre(Resultado.getString("nombre") + " " + Resultado.getString("apellido_p") + " " + Resultado.getString("apellido_m"));
                SCT.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SCT;
    }

    public List<Contrato> SearchExisencia(int folio) {
        List<Contrato> SCT = new ArrayList<>();

        String sql = "select * from contrato where folio_cte = ?";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Contrato ct = new Contrato();
                ct.setFolioContrato(Integer.parseInt(Resultado.getString("folio_contrato")));
                SCT.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SCT;
    }

    public Contrato GenerarContrato(int folio) {
        contrato = new Contrato();
        String sql = "select cliente.folio_cte,cliente.nombre,cliente.apellido_p,cliente.apellido_m,contrato.folio_contrato,contrato.municipio,contrato.residencia,"
                + "contrato.nombre_calle,contrato.numero_mzn,contrato.numero_lt,contrato.fecha_creacion "
                + "from contrato "
                + "inner join cliente "
                + "on cliente.folio_cte = contrato.folio_cte "
                + "where contrato.folio_contrato =? "
                + "order by contrato.status ASC";

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            if (Resultado.next()) {

                contrato.setFolioContrato(Integer.parseInt(Resultado.getString("folio_contrato")));
                contrato.setFolio_cte(Resultado.getInt("folio_cte"));
                contrato.setMunicipio(Resultado.getString("municipio"));
                contrato.setResidencia(Resultado.getString("residencia"));
                contrato.setNombreCalle(Resultado.getString("nombre_calle"));
                contrato.setNumeroMzn(Resultado.getInt("numero_mzn"));
                contrato.setNumeroLt(Resultado.getInt("numero_lt"));
                contrato.setCreacion_contrato(Resultado.getDate("fecha_creacion"));
                contrato.setNombre(Resultado.getString("nombre") + " " + Resultado.getString("apellido_p") + " " + Resultado.getString("apellido_m"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contrato;
    }
}
