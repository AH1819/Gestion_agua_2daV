package Vista;

import Controlador.Catalogo_Controller;
import Modelo.CeldaRender;
import Modelo.Jasper;
import Modelo.Datos_Existentes;
import Modelo.Reportes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Reportes_Vista extends javax.swing.JPanel {

    Datos_Existentes DE;
    Catalogo_Controller CC;
    DefaultTableModel modelo;
    String[][] head = {
        {"N°", "Nombre", "Fecha de creacion"},
        {"N°", "Nombre", "Mes", "Cantidad", "Total de la deuda"}};

    public Reportes_Vista() {
        initComponents();
        imprimiendo.setVisible(false);
        Mes.setEnabled(false);
        Año.setEnabled(false);
        Total_label.setVisible(false);
        total.setVisible(false);
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        modelo = (DefaultTableModel) Reportes.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        Reportes = new javax.swing.JTable();
        Total_label = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        Imprimir = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Año = new com.toedter.calendar.JYearChooser();
        Mes = new com.toedter.calendar.JMonthChooser();
        Reportes_selected = new javax.swing.JComboBox<>();
        imprimiendo = new javax.swing.JLabel();

        Reportes.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Reportes.setRowHeight(22);
        scroll.setViewportView(Reportes);

        Total_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total_label.setText("Total:");

        Imprimir.setBackground(new java.awt.Color(18, 90, 173));
        Imprimir.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/imprimir.png"))); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.setBorder(null);
        Imprimir.setEnabled(false);
        Imprimir.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(18, 90, 173));
        Mostrar.setForeground(new java.awt.Color(255, 255, 255));
        Mostrar.setText("Mostrar");
        Mostrar.setBorder(null);
        Mostrar.setEnabled(false);
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        LocalDate now = LocalDate.now();
        int yearmax = now.getYear();
        Año.setMaximum(yearmax);
        Año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AñoMousePressed(evt);
            }
        });

        Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MesMousePressed(evt);
            }
        });

        Reportes_selected.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reportes", "Reporte de adeudos", "Reporte de contratos por mes", "Reporte de contratos por año" }));
        Reportes_selected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reportes_selectedActionPerformed(evt);
            }
        });

        imprimiendo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imprimiendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reportes_selected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Año, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(imprimiendo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Imprimir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_label, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reportes_selected, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Año, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imprimiendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Total_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed

        switch (Reportes_selected.getSelectedIndex()) {
            case 1:
                new Thread() {
                    public void run() {
                        imprimiendo.setVisible(true);
                        Jasper js = new Jasper();
                        js.Generar_Reporte(String.valueOf(total.getText()));
                        imprimiendo.setVisible(false);
                    }
                }.start();
                break;
            case 2:
                new Thread() {
                    public void run() {
                        imprimiendo.setVisible(true);
                        Jasper js = new Jasper();
                        js.ReportePorMes(Mes.getMonth() + 1);
                        imprimiendo.setVisible(false);
                    }
                }.start();
                break;
            case 3:
                new Thread() {
                    public void run() {
                        imprimiendo.setVisible(true);
                        Jasper js = new Jasper();
                        js.ReportePorAño(Año.getYear());
                        imprimiendo.setVisible(false);
                    }
                }.start();
                break;
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        switch (Reportes_selected.getSelectedIndex()) {
            case 2:
                DataController(3, Mes.getMonth() + 1);
                break;
            case 3:
                DataController(2, Año.getYear());
                break;
        }
    }//GEN-LAST:event_MostrarActionPerformed

    private void AñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñoMousePressed

    }//GEN-LAST:event_AñoMousePressed

    private void MesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MesMousePressed

    }//GEN-LAST:event_MesMousePressed

    private void Reportes_selectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reportes_selectedActionPerformed
        if (Reportes_selected.getSelectedIndex() > 0) {
            if (Reportes_selected.getSelectedIndex() == 1) {
                new Thread() {
                    @Override
                    public void run() {
                        Imprimir.setEnabled(true);
                        Mostrar.setEnabled(false);
                        DataController(1, 0);
                    }
                }.start();
            }
            if (Reportes_selected.getSelectedIndex() == 2) {
                modelo.setRowCount(0);
                modelo.setColumnCount(0);
                Mostrar.setEnabled(true);
            }
            if (Reportes_selected.getSelectedIndex() == 3) {
                modelo.setRowCount(0);
                modelo.setColumnCount(0);
                Mostrar.setEnabled(true);
            }
        } else {
            Imprimir.setEnabled(false);
        }

        if (Reportes_selected.getSelectedIndex() > 0) {
            Imprimir.setEnabled(true);
            if (Reportes_selected.getSelectedIndex() == 1) {
                Mes.setEnabled(false);
                Año.setEnabled(false);

            }
            if (Reportes_selected.getSelectedIndex() == 2) {
                Mes.setEnabled(true);
                Año.setEnabled(false);

            }
            if (Reportes_selected.getSelectedIndex() == 3) {
                Mes.setEnabled(false);
                Año.setEnabled(true);
            }
        } else {
            Imprimir.setEnabled(true);
        }
        if (Reportes_selected.getSelectedIndex() != 1) {
            Total_label.setVisible(false);
            total.setVisible(false);
        } else {
            Total_label.setVisible(true);
            total.setVisible(true);
        }
    }//GEN-LAST:event_Reportes_selectedActionPerformed
    private void DataController(int opcion, int opcion_extra) {

        CC.setOpcion(6);
        CC.setOpcion_reportes(opcion);
        CC.setOpcion_reportes_opcion(opcion_extra);
        DE.setReportes_Guardados((ArrayList<Modelo.Reportes>) CC.Read());

        switch (opcion) {
            case 1:
                DataTable(head, 1);
                break;
            case 2:
            case 3:
                DataTable(head, 0);
                break;
        }
    }

    private void DataTable(String[][] head, int index) {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);

        for (String item : head[index]) {
            modelo.addColumn(item);
        }

        if (DE.getReportes_Guardados() != null) {
            switch (index) {
                case 0:
                    for (Reportes report : DE.getReportes_Guardados()) {
                        Object[] fila = {
                            report.getId(),
                            report.getNombre(),
                            report.getFecha_creacion()};
                        modelo.addRow(fila);
                    }
                    break;
                case 1:
                    for (Reportes report : DE.getReportes_Guardados()) {
                        Object[] fila = {
                            report.getId(),
                            report.getNombre(),
                            report.getMeses_adeudo(),
                            report.getCantidad(),
                            report.getTotal_deuda()
                        };
                        modelo.addRow(fila);
                    }
                    double totaldeuda = 0;
                    for (int i = 0; i < Reportes.getRowCount(); i++) {
                        totaldeuda += Double.parseDouble(Reportes.getValueAt(i, 4).toString());
                    }
                    total.setText(String.valueOf(totaldeuda));
                    break;
            }
        }
        Reportes.setModel(modelo);
        Render(Reportes, this);
    }

    private void Render(JTable tabla, JPanel panel) {
        CeldaRender renderizar = new CeldaRender();
        Enumeration<TableColumn> en = tabla.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(renderizar);
        }
        panel.revalidate();
        panel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JYearChooser Año;
    private javax.swing.JButton Imprimir;
    private com.toedter.calendar.JMonthChooser Mes;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTable Reportes;
    private javax.swing.JComboBox<String> Reportes_selected;
    private javax.swing.JLabel Total_label;
    private javax.swing.JLabel imprimiendo;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
