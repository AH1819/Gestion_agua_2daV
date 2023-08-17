package Dao;

import Conexion.ConexionBD;
import Modelo.Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lombok.Setter;

/**
 *
 * @author Hitler
 */
public class EmpresaDao {

    private static ResultSet Resultado;
    private final ConexionBD conexion = ConexionBD.getInstance();
    @Setter
    Empresa ct;

    public boolean EmpresaData() {
        boolean status;
        ct = new Empresa();
        String sql = "select * from empresa";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            if (Resultado.next()) {
                ct.setRazon_social(Resultado.getString("razon_social"));
                ct.setEslogan_mov(Resultado.getString("eslogan_mov"));
                ct.setRFC(Resultado.getString("rfc"));
                ct.setEstado(Resultado.getString("estado"));
                ct.setMunicipio(Resultado.getString("municipio"));
                ct.setPie(Resultado.getString("pie"));
                ct.setTerminos_y_condiciones(Resultado.getString("terminos"));
                ct.setRutaterminos(Resultado.getString("rutaterminos"));
            }
            status = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No existe la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            status = false;
        }
        return status;
    }

    public boolean ActualizarDatos() {

        String sql = "update empresa set"
                + " razon_social=?, eslogan_mov=?, pie=?, terminos=?, rfc=?, municipio=?, estado=?, rutaterminos = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, ct.getRazon_social());
            comando.setString(2, ct.getEslogan_mov());
            comando.setString(3, ct.getPie());
            comando.setString(4, ct.getTerminos_y_condiciones());
            comando.setString(5, ct.getRFC());
            comando.setString(6, ct.getMunicipio());
            comando.setString(7, ct.getEstado());
            comando.setString(8, ct.getRutaterminos());
            comando.executeUpdate();

            conexion.conectar().close();
            comando.close();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe la tabla", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
