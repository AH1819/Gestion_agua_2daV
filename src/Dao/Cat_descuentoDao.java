package Dao;

import Conexion.ConexionBD;
import Entity.Cat_descuento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cat_descuentoDao {
    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();
    
    public int InsertarDescuento(Cat_descuento cat){
        int ret = 0;
        
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
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        
        return ret;
    }
    
    public int ActualizarDescuento(Cat_descuento cat){
        int ret = 0;
        
        String sql = "update cat_descuento set fecha_inc = ?, fecha_fin = ?, descripcion = ?, porcentaje = ? where id_desc = ?";
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
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
        
        return ret;
    }
    
    public List<Cat_descuento> MostrarDescuentos(int id){
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
            
            while(Resultado.next()){
                Cat_descuento cd = new Cat_descuento();
                cd.setPorcentaje(Resultado.getDouble("porcentaje"));
                CD.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
        
    }
    
    public List<Cat_descuento> ObtenerDescuentos(){
        List<Cat_descuento> CD = new ArrayList<>();
        String sql = "select * from cat_descuento order by porcentaje asc";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            
            while(Resultado.next()){
                Cat_descuento cd = new Cat_descuento();
                cd.setId_desc(Resultado.getInt("id_desc"));
                cd.setFecha_inc(Resultado.getDate("fecha_inc"));
                cd.setFecha_fin(Resultado.getDate("fecha_fin"));
                cd.setDescripcion(Resultado.getString("descripcion"));
                cd.setPorcentaje(Resultado.getDouble("porcentaje"));
                CD.add(cd);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }
    
    public int EliminarDescuento(int id){
        int ret= 0;
        
        String sql = "delete from cat_descuento where id_m = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            ret = comando.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
