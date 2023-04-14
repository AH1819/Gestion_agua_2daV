package Conexion;

import Entity.ErrorsAndSuccessesBD;
import Entity.Logeo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    Logeo lg = new Logeo();
    ErrorsAndSuccessesBD eae = new ErrorsAndSuccessesBD();
    private String driver = "org.postgresql.Driver";
    private String Cadenacon;

    public ConexionBD() {
    }

    public static ConexionBD getInstance() {
        return ConexionHolder.INSTANCE;
    }

    private static class ConexionHolder {
        private static final ConexionBD INSTANCE = new ConexionBD();
    }

    public Connection conectar() {
        
        Connection con = null;
        Cadenacon = "jdbc:postgresql://" + lg.getIp() + ":" + lg.getPuerto() + "/" + lg.getBase() + "";
        
        try {
            
            con = DriverManager.getConnection(Cadenacon, lg.getUsuario(), lg.getPassword());
            eae.setExitoConexion(true);
            
        } catch (SQLException ex) {
            eae.setErrorconexion(""+ex.getMessage());
            eae.setExitoConexion(false);
        }
        return con;
    }
}