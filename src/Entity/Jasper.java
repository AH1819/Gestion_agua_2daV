package Entity;

import Conexion.ConexionBD;
import static Vista.Contrato_Vista.esperareimprimir;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Jasper {

    private final ConexionBD conexion = ConexionBD.getInstance();

    public void generar_contraro() {
        Contrato_generado cg = new Contrato_generado();
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        LocalDate localDate = cg.getCreacion_contrato().toLocalDate();
        int yearc = localDate.getYear();
        int diac = localDate.getDayOfMonth();
        int monthc = localDate.getMonthValue();
        Map parametros = new HashMap<String, String>();
        parametros.put("Contrato", cg.getFolio_contrato());
        parametros.put("Texto legal", cg.getInformativo());
        parametros.put("Fecha_act", dia + " de " + meses[month - 1] + " del " + year);
        parametros.put("Fecha", diac + " de " + meses[monthc - 1] + " de " + yearc);
        System.out.println("generando");
        try {

            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/Contrato.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, parametros, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            System.out.println("generando");
            
            esperareimprimir.setVisible(false);

            jv.setVisible(true);

        } catch (JRException e) {
            System.out.println(e);
        }
    }

    public void Generar_Reporte() {
        try {
            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/ReporteDeudas.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, null, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
