package Modelo;

import Conexion.ConexionBD;
import java.awt.Component;
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
import java.awt.print.PrinterJob;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class Jasper {

    private final ConexionBD conexion = ConexionBD.getInstance();

    public void generar_contraro(Component espera) {
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
        parametros.put("Fecha", diac + " de " + meses[monthc - 1] + " del " + yearc);
        System.out.println("generando");
        try {

            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/Contrato.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, parametros, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            espera.setVisible(false);

            jv.setVisible(true);

            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea imprimir el complemento?", "Complemento", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
            if (arreglo[opcionp].equals("Si")) {
                new Thread() {
                    @Override
                    public void run() {
                        PDFTerms();
                    }
                }.start();
            }

        } catch (JRException e) {
            System.out.println(e);
        }
    }

    public void Generar_Reporte(String total) {
        Map parametros = new HashMap<String, String>();
        parametros.put("total", total);
        try {
            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/ReporteDeudas.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, parametros, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ReportePorMes(int mes) {
        Map parametros = new HashMap<String, String>();
        parametros.put("Mes", mes);
        try {
            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/ReportePorMes.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, parametros, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ReportePorAño(int año) {
        Map parametros = new HashMap<String, String>();
        parametros.put("Año", año);
        try {
            JasperReport js = (JasperReport) JRLoader.loadObject(Jasper.class.getResource("/Plantillas/ReportePorAño.jasper"));

            JasperPrint cargar = JasperFillManager.fillReport(js, parametros, conexion.conectar());

            JasperExportManager.exportReportToPdf(cargar);

            JasperViewer jv = new JasperViewer(cargar, false);

            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Jasper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void PDFTerms() {
        try {
            String ruta = "";
            Empresa emp = new Empresa();

            if (!emp.getRutaterminos().equals("") && !emp.getRutaterminos().equals("xxx") && !emp.getRutaterminos().isEmpty()) {
                ruta = emp.getRutaterminos();
            } else {
                URL pdf = Jasper.class.getClassLoader().getResource("Recursos/terminos y condiciones.pdf");
                if (pdf != null) {
                    ruta = URLDecoder.decode(pdf.getPath(), "UTF-8");
                }
            }
            File file = new File(ruta);
            PDDocument document = PDFParser.load(file);

            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPageable(new PDFPageable(document));

            if (job.printDialog()) {
                job.print();
            }

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
