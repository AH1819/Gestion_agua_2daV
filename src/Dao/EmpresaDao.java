package Dao;

import Conexion.ConexionBD;
import Entity.Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class EmpresaDao {

    private static ResultSet Resultado;
    private final ConexionBD conexion = ConexionBD.getInstance();
    
    public void EmpresaData() {
        String sql = "select * from empresa";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                Empresa ct = new Empresa();
                ct.setRazon_social(Resultado.getString("razon_social"));
                ct.setEslogan_mov(Resultado.getString("eslogan_mov"));
                ct.setSa(Resultado.getString("sa"));
                ct.setRFC(Resultado.getString("rfc"));
                ct.setEstado(Resultado.getString("estado"));
                ct.setMunicipio(Resultado.getString("municipio"));
                ct.setPie(Resultado.getString("pie"));
                ct.setTerminos_y_condiciones(Resultado.getString("terminos"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
