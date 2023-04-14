package Dao;

import Conexion.ConexionBD;
import Entity.DetTipoconsumoTarifa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TarifaDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    public boolean Insertar_Tarifa(int consec, int id_c,double tarifa){
        boolean status = false;

        String sql = "insert into det_tipoConsumo_tarifa (consec,id_consumo,tarifa) values (?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, consec);
            comando.setInt(2, id_c);
            comando.setDouble(3, tarifa);
            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(CatalogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public List<DetTipoconsumoTarifa> Tarifas(int id) {
        List<DetTipoconsumoTarifa> tari = new ArrayList<>();

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
            Logger.getLogger(TarifaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tari;
    }

    public List<DetTipoconsumoTarifa> Mostrar_Tarifas() {
        List<DetTipoconsumoTarifa> tari = new ArrayList<>();

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
                DetTipoconsumoTarifa dt = new DetTipoconsumoTarifa(Resultado.getInt("consec"),
                        Resultado.getInt("id_consumo"),
                        Resultado.getString("tipo_consumo"),
                        Resultado.getDouble("tarifa"));
                tari.add(dt);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(TarifaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tari;
    }
}
