package Dao;

import Conexion.ConexionBD;
import Modelo.Cat_Consumo;
import Modelo.Cat_descuento;
import Modelo.Cat_pago;
import Modelo.Cat_periodo;
import Modelo.DetTipoconsumoTarifa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatalogosDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    ///////////////////////////////////////Consumo
    public int Insertar_Consumo(String tipo) {

        String sql = "insert into cat_consumo (tipo_consumo) values (?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean Actualizar_Consumo(int id, String tipo) {

        boolean status = false;

        String sql = "update cat_consumo set tipo_consumo = ? where id_consumo = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.setInt(2, id);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public ArrayList<Cat_Consumo> GetConsumo() {
        ArrayList<Cat_Consumo> CC = new ArrayList<>();

        String sql = "select * from cat_consumo order by id_consumo";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_Consumo cc = new Cat_Consumo();
                cc.setId_consumo(Resultado.getInt("id_consumo"));
                cc.setTipo_consumo(Resultado.getString("tipo_consumo"));
                CC.add(cc);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return CC;
    }

    ///////////////////////////////////////Periodo
    public int Insertar_Periodo(String tipo, int mes) {

        String sql = "insert into cat_periodo (tipo_periodo,meses) values (?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.setInt(2, mes);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean Actualizar_Periodo(int id, String tipo, int mes) {
        boolean status = false;

        String sql = "update cat_periodo set tipo_periodo = ?, meses = ? where id_periodo = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo);
            comando.setInt(2, mes);
            comando.setInt(3, id);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public ArrayList<Cat_periodo> GetPeriodo() {
        ArrayList<Cat_periodo> CP = new ArrayList<>();

        String sql = "select * from cat_periodo order by meses asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_periodo cp = new Cat_periodo();
                cp.setId_periodo(Resultado.getInt("id_periodo"));
                cp.setTipo_periodo(Resultado.getString("tipo_periodo"));
                cp.setMeses(Resultado.getInt("meses"));
                CP.add(cp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return CP;
    }

    //////////////////////////////////////Tipo de pago
    public ArrayList<Cat_pago> Tipo_pago() {
        ArrayList<Cat_pago> CP = new ArrayList<>();

        String sql = "select * from cat_pago order by id_tipo_pago";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_pago cp = new Cat_pago();
                cp.setId_tipo_pago(Resultado.getInt("id_tipo_pago"));
                cp.setTipo_pago(Resultado.getString("tipo_pago"));
                CP.add(cp);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return CP;
    }

    public int InsertarPago(String tipo_pago) {

        String sql = "insert into cat_pago (tipo_pago) values (?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo_pago);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean ActualizarTipo_Pago(int id, String tipo_pago) {

        String sql = "update cat_pago set tipo_pago= ? where id_tipo_pago = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, tipo_pago);
            comando.setInt(2, id);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    ////////////////////////////Tarifas

    public int Insertar_Tarifa(int consec, int consumo, double tarifa) {
        String sql = "insert into det_tipoconsumo_tarifa values (?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, consec);
            comando.setInt(2, consumo);
            comando.setDouble(3, tarifa);
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean Actualizar_Tarifa(int consec, int cons, int consumo, double tarifa) {
        boolean status = false;
        String sql = "update det_tipoconsumo_tarifa set id_consumo = ?, tarifa = ? where consec = ? and id_consumo = ?";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, consumo);
            comando.setDouble(2, tarifa);
            comando.setInt(3, consec);
            comando.setInt(4, cons);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public ArrayList<DetTipoconsumoTarifa> Mostrar_Tarifas() {
        ArrayList<DetTipoconsumoTarifa> tari = new ArrayList<>();

        String sql = "select dt.consec,ct.tipo_consumo,ct.id_consumo,dt.tarifa "
                + "from det_tipoconsumo_tarifa dt "
                + "inner join cat_consumo ct "
                + "on ct.id_consumo = dt.id_consumo "
                + "order by ct.id_consumo asc";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                DetTipoconsumoTarifa dt = new DetTipoconsumoTarifa();
                dt.setConsec(Resultado.getInt("consec"));
                dt.setId_consumo(Resultado.getInt("id_consumo"));
                dt.setTipo_consumo(Resultado.getString("tipo_consumo"));
                dt.setTarifa(Resultado.getDouble("tarifa"));
                tari.add(dt);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return tari;
    }

    public ArrayList<DetTipoconsumoTarifa> Tarifas(int id) {
        ArrayList<DetTipoconsumoTarifa> tari = new ArrayList<>();

        String sql = "select * from det_tipoconsumo_tarifa where id_consumo = ? order by id_consumo";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                DetTipoconsumoTarifa dt = new DetTipoconsumoTarifa();
                dt.setConsec(Resultado.getInt("consec"));
                dt.setId_consumo(Resultado.getInt("id_consumo"));
                dt.setTarifa(Resultado.getDouble("tarifa"));
                tari.add(dt);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tari;
    }

    ///////////////////////////////Descuentos
    public int InsertarDescuento(Cat_descuento cat) {

        String sql = "insert into cat_descuento (fecha_inc,fecha_fin,descripcion,porcentaje) values(?,?,?,?)";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            comando.setDate(1, cat.getFecha_inc());
            comando.setDate(2, cat.getFecha_fin());
            comando.setString(3, cat.getDescripcion());
            comando.setDouble(4, cat.getPorcentaje());

            comando.executeUpdate();
            conexion.conectar().close();
            comando.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public boolean ActualizarDescuento(Cat_descuento cat) {
        boolean status = false;

        String sql = "update cat_descuento set fecha_inc = ?, fecha_fin = ?, descripcion = ?, porcentaje = ? where id_desc = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setDate(1, cat.getFecha_inc());
            comando.setDate(2, cat.getFecha_fin());
            comando.setString(3, cat.getDescripcion());
            comando.setDouble(4, cat.getPorcentaje());
            comando.setInt(5, cat.getId_desc());

            comando.executeUpdate();
            status = true;
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
            status = false;
        }

        return status;
    }

    public List<Cat_descuento> MostrarDescuentos(int id) {
        List<Cat_descuento> CD = new ArrayList<>();

        String sql = "select cat.porcentaje from lectura_pago lp inner join cat_descuento cat "
                + "on lp.id_desc = cat.id_desc inner join contrato ct "
                + "on ct.folio_contrato = lp.folio_contrato "
                + "where ct.folio_contrato = ? "
                + "order by id_lect_pago";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_descuento cd = new Cat_descuento();
                cd.setPorcentaje(Resultado.getDouble("porcentaje"));
                CD.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;

    }

    public ArrayList<Cat_descuento> ObtenerDescuentos(String opcion) {
        ArrayList<Cat_descuento> CD = new ArrayList<>();
        String sql = "select * from cat_descuento order by " + opcion;
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cat_descuento cd = new Cat_descuento();
                cd.setId_desc(Resultado.getInt("id_desc"));
                cd.setFecha_inc(Resultado.getDate("fecha_inc"));
                cd.setFecha_fin(Resultado.getDate("fecha_fin"));
                cd.setDescripcion(Resultado.getString("descripcion"));
                cd.setPorcentaje(Resultado.getDouble("porcentaje"));
                cd.setStatus(Resultado.getString("status"));
                CD.add(cd);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }

    public int EliminarDescuento(int id) {
        int ret = 0;

        String sql = "delete from cat_descuento where id_m = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            ret = comando.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ret;
    }
}
