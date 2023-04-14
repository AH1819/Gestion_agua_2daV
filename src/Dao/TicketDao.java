package Dao;

import Conexion.ConexionBD;
import Entity.Ticket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

    public List<Ticket> MaxTicket() {
        List<Ticket> CD = new ArrayList<>();
        String sql = "select MAX(id_ticket) as maxTicket from ticket";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Ticket tk = new Ticket();
                tk.setIdticket(Resultado.getInt("maxTicket"));
                CD.add(tk);
            }
            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {
            Logger.getLogger(Cat_descuentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CD;
    }
    
}
