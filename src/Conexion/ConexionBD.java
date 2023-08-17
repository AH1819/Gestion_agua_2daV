package Conexion;

import Modelo.ErrorsAndSuccessesBD;
import Modelo.Logeo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private Logeo lg = new Logeo();
    private ErrorsAndSuccessesBD eae = new ErrorsAndSuccessesBD();
    private String driver = "org.postgresql.Driver";
    private String Cadenacon;

    private ConexionBD() {
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
            eae.setConexion(true);

        } catch (SQLException ex) {
            eae.setConexion(false);
            if (ex.getMessage().contains("la autentificaci")) {
                eae.setCadenaErrorBD("Usuario o Contraseña incorrecta.");
            } else if (ex.getMessage().contains("no existe la base de datos")) {
                eae.setCadenaErrorBD("La base de datos no existe.");
            } else {
                eae.setCadenaErrorBD("Error al conectar a la base de datos: " + ex.getMessage());
            }
        }
        return con;
    }
}
