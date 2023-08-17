package Vista;

import Controlador.DetAbono_Controller;
import Modelo.DetAbono;
import Modelo.MiRenderer;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class AbonosView extends javax.swing.JPanel {

    ArrayList<DetAbono> DetAbono;
    DetAbono_Controller dac = new DetAbono_Controller();
    DefaultTableModel model;
    Servicio_Responsive sp;

    public AbonosView(int folio, Servicio_Responsive sp) {
        initComponents();
        model = (DefaultTableModel) Mostrar.getModel();
        this.sp = sp;
        CargarDatos(folio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Fecha", "Abono", "Saldo", "Importe", "Tipo de pago", "Descuento(%)", "Pagado"
            }
        ));
        jScrollPane1.setViewportView(Mostrar);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Abonos");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Paneles(sp);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void Paneles(Component h) {
        
        h.setLocation(0, 0);
        
        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }
    
    private void CargarDatos(int folio) {
        DetAbono = dac.Read(folio);
        if (DetAbono.size() > 0) {
            DataTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron abonos registrados", "Abono", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void DataTabla() {
        model.setRowCount(0);
        for (DetAbono detAbono : DetAbono) {
            Object[] fila = {
                detAbono.getConsec(),
                detAbono.getFechaHora(),
                detAbono.getAbono(),
                detAbono.getSaldo(),
                detAbono.getImporte(),
                detAbono.getTipo_pago(),
                detAbono.getPorcentaje(),
                detAbono.getPagado()};
            model.addRow(fila);
        }
        setCellRender(Mostrar);
    }

    public void setCellRender(JTable table) {

        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new MiRenderer());
        }
        table.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
