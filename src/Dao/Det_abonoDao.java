package Dao;

import Conexion.ConexionBD;
import Modelo.DetAbono;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Det_abonoDao {
    
    private static ResultSet Resultado;
    
    private ConexionBD conexion = ConexionBD.getInstance();
    
    public int InsertarDetAbono(DetAbono detabono) {
        int ret = 0;
        
        String sql = "insert into det_abono(abono,id_lect_pago,id_tipo_pago,id_desc,ticket_ventanilla,pagado) values (?,?,?,?,?,?)";
        PreparedStatement comando = null;
        
        try {
            
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setDouble(1, detabono.getAbono());
            comando.setInt(2, detabono.getId_lectura_pago());
            comando.setInt(3, detabono.getId_tipo_pago());
            comando.setInt(4, detabono.getId_desc());
            comando.setString(5, detabono.getFolio_ventanilla());
            comando.setDouble(6, detabono.getPagado());
            System.out.println(comando);
            comando.executeUpdate();
            
            Resultado = comando.getGeneratedKeys();
            
            if (Resultado.next()) {
                ret = Resultado.getInt(1);
            }
            
            conexion.conectar().close();
            comando.close();
            
            return ret;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            return -1;
        }
    }
    
    public ArrayList<DetAbono> GetAbonos(int folio) {
        ArrayList<DetAbono> lista = new ArrayList<>();
        
        String sql = "select da.consec, da.fecha_hora, da.abono, da.saldo, "
                + "lp.importe, cp.tipo_pago, cd.porcentaje, da.pagado "
                + "from lectura_pago lp "
                + "inner join det_abono da "
                + "on da.id_lect_pago = lp.id_lect_pago "
                + "inner join cat_pago cp "
                + "on cp.id_tipo_pago = da.id_tipo_pago "
                + "inner join cat_descuento cd "
                + "on cd.id_desc = da.id_desc "
                + "where lp.folio_contrato = ?";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, folio);
            Resultado = comando.executeQuery();
            
            while (Resultado.next()) {
                DetAbono list = new DetAbono();
                list.setConsec(Resultado.getInt("consec"));
                list.setFechaHora(Resultado.getDate("fecha_hora"));
                list.setAbono(Resultado.getDouble("abono"));
                list.setSaldo(Resultado.getDouble("saldo"));
                list.setImporte(Resultado.getDouble("importe"));
                list.setTipo_pago(Resultado.getString("tipo_pago"));
                list.setPorcentaje(Resultado.getDouble("porcentaje"));
                list.setPagado(Resultado.getDouble("pagado"));
                lista.add(list);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Det_abonoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
