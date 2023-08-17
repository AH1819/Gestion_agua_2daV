package Dao;

import Conexion.ConexionBD;
import Modelo.Reportes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportesDao {

    private static ResultSet Resultado;
    private final ConexionBD conexion = ConexionBD.getInstance();
    Reportes report;
    ArrayList<Reportes> CT;

    public ArrayList<Reportes> Reporte_adeudos() {
        CT = new ArrayList<>();

        String sql = "select contrato.folio_contrato,(cliente.nombre||' '||cliente.apellido_p||' '||cliente.apellido_m) AS nombre_cliente,"
                + "lectura_pago.fecha_hora,lectura_pago.adeudo,cat_mes.mes,contrato.deuda "
                + "from cliente "
                + "inner join contrato "
                + "on cliente.folio_cte = contrato.folio_cte "
                + "inner join lectura_pago "
                + "on contrato.folio_contrato = lectura_pago.folio_contrato "
                + "inner join cat_mes "
                + "on lectura_pago.id_m = cat_mes.id_m where lectura_pago.adeudo <> 0.0 "
                + "order by contrato.folio_contrato";

        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);

            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                report = new Reportes();
                report.setId(Resultado.getInt("folio_contrato"));
                report.setNombre(Resultado.getString("nombre_cliente"));
                report.setMeses_adeudo(Resultado.getString("mes"));
                report.setCantidad(Resultado.getDouble("adeudo"));
                report.setTotal_deuda(Resultado.getDouble("deuda"));
                CT.add(report);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CT;
    }

    public ArrayList<Reportes> Contratoxmes(int Mes) {
        CT = new ArrayList<>();
        int mes = Mes;
        String sql = "select ct.folio_contrato,(cl.nombre||' '||cl.apellido_p||' '||cl.apellido_m) as nombre_cliente,ct.fecha_creacion "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "where extract(month from (fecha_creacion)) = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, mes);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                report = new Reportes();
                report.setId(Resultado.getInt("folio_contrato"));
                report.setNombre(Resultado.getString("nombre_cliente"));
                report.setFecha_creacion(Resultado.getDate("fecha_creacion"));
                CT.add(report);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CT;
    }

    public ArrayList<Reportes> Contratoxaño(int Año) {
        CT = new ArrayList<>();
        int año = Año;
        String sql = "select ct.folio_contrato,(cl.nombre||' '||cl.apellido_p||' '||cl.apellido_m) as nombre_cliente,ct.fecha_creacion "
                + "from contrato ct "
                + "inner join cliente cl "
                + "on cl.folio_cte = ct.folio_cte "
                + "where extract(year from (fecha_creacion)) = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, año);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                report = new Reportes();
                report.setId(Resultado.getInt("folio_contrato"));
                report.setNombre(Resultado.getString("nombre_cliente"));
                report.setFecha_creacion(Resultado.getDate("fecha_creacion"));
                CT.add(report);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportesDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return CT;
    }

}
