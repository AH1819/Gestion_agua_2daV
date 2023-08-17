package Dao;

import Conexion.ConexionBD;
import Modelo.Ticket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicketDao {

    private static ResultSet Resultado;
    private ConexionBD conexion = ConexionBD.getInstance();

    public int InsertarTicket(Ticket ticket) {
        int id = 0;
        String sql = "insert into ticket (id_lect_pago,consec) values (?,?)";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setInt(1, ticket.getIdLectPago());
            comando.setInt(2, ticket.getCns());
            comando.executeUpdate();
            Resultado = comando.getGeneratedKeys();
            if (Resultado.next()) {
                id = Resultado.getInt(1);
            }
            conexion.conectar().close();
            comando.close();
            return id;
        } catch (SQLException e) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, e);
            return -1;
        }
    }
}
