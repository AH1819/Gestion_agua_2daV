package Dao;

import Conexion.ConexionBD;
import Entity.DetAbono;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Det_abonoDao {
    private static ResultSet Resultado;
    
    private ConexionBD conexion = ConexionBD.getInstance();
    
    public int InsertarDetAbono(DetAbono detabono){
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
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            return -1;
        }
    }

}