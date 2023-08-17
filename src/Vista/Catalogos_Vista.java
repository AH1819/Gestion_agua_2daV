package Vista;

import Controlador.Catalogo_Controller;
import Modelo.CeldaRender;
import Modelo.Cat_Consumo;
import Modelo.Cat_pago;
import Modelo.Cat_periodo;
import Modelo.Datos_Existentes;
import Modelo.DetTipoconsumoTarifa;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Catalogos_Vista extends javax.swing.JPanel {

    Catalogo_Controller CC;
    Datos_Existentes DE;
    DefaultTableModel modelo;
    String[][] head = {
        {"N°", "Tipo de Consumo"},
        {"N°", "Tipo de Periodo"},
        {"N°", "Tipo de Consumo", "Tipo de Tarifa"},
        {"N°", "Tipo de Pago"}};
    Catalogo_extra_consumo cec;

    public Catalogos_Vista() {
        initComponents();
        modelo = (DefaultTableModel) Catalogos_Table.getModel();
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        DataController(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Catalogos_Table = new javax.swing.JTable();
        Seleccion = new javax.swing.JComboBox<>();
        Contenedor = new javax.swing.JPanel();

        Catalogos_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Catalogos_Table);

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumo", "Periodo", "Tarifa", "Tipo de pago" }));
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        Contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Seleccion, 0, 161, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        ((JLabel)Seleccion.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionActionPerformed
        switch (Seleccion.getSelectedIndex()) {
            case 0:
                DataController(2);
                break;
            case 1:
                DataController(3);
                break;
            case 2:
                DataController(5);
                break;
            case 3:
                DataController(4);
                break;
        }
    }//GEN-LAST:event_SeleccionActionPerformed
    public void Paneles(Component h) {

        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    public void DataController(int opcion) {
        CC.setOpcion(opcion);
        switch (opcion) {
            case 2:
                DE.setConsumos_Guardados((ArrayList<Cat_Consumo>) CC.Read());
                DataTable(head, 0);
                break;
            case 3:
                DE.setPeriodos_Guardados((ArrayList<Cat_periodo>) CC.Read());
                DataTable(head, 1);
                break;
            case 4:
                DE.setTipos_Guardados((ArrayList<Cat_pago>) CC.Read());
                DataTable(head, 3);
                break;
            case 5:
                DE.setTarifas_Guardadas((ArrayList<DetTipoconsumoTarifa>) CC.Read());
                DataTable(head, 2);
                break;
        }
    }

    private void DataTable(String[][] head, int index) {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        for (String item : head[index]) {
            modelo.addColumn(item);
        }

        switch (index) {
            case 0:
                if (DE.getConsumos_Guardados() != null) {
                    for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
                        Object[] fila = {consumo.getId_consumo(), consumo.getTipo_consumo()};
                        modelo.addRow(fila);
                    }
                    cec = new Catalogo_extra_consumo(this);
                    Paneles(cec);
                } else {
                    Catalogos_Table.setEnabled(false);
                    Contenedor.removeAll();
                }
                break;
            case 1:
                if (DE.getPeriodos_Guardados() != null) {
                    for (Cat_periodo periodo : DE.getPeriodos_Guardados()) {
                        Object[] fila = {periodo.getId_periodo(), periodo.getTipo_periodo()};
                        modelo.addRow(fila);
                    }
                    Catalogo_extra_periodo cep = new Catalogo_extra_periodo(this);
                    Paneles(cep);
                } else {
                    Catalogos_Table.setEnabled(false);
                    Contenedor.removeAll();
                }
                break;
            case 2:
                if (DE.getTarifas_Guardadas() != null) {
                    for (DetTipoconsumoTarifa tarifas : DE.getTarifas_Guardadas()) {
                        Object[] fila = {tarifas.getConsec(), tarifas.getTipo_consumo(), tarifas.getTarifa()};
                        modelo.addRow(fila);
                    }
                    Catalogo_extra_tarifa cet = new Catalogo_extra_tarifa(this);
                    Paneles(cet);
                } else {
                    Catalogos_Table.setEnabled(false);
                    Contenedor.removeAll();
                }
                break;
            case 3:
                if (DE.getTipos_Guardados() != null) {
                    for (Cat_pago tipos : DE.getTipos_Guardados()) {
                        Object[] fila = {tipos.getId_tipo_pago(), tipos.getTipo_pago()};
                        modelo.addRow(fila);
                    }
                    Catalogo_extra_pago cep = new Catalogo_extra_pago(this);
                    Paneles(cep);
                } else {
                    Catalogos_Table.setEnabled(false);
                    Contenedor.removeAll();
                }
                break;
        }
        Catalogos_Table.setModel(modelo);
        Render(Catalogos_Table, this);
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
    public javax.swing.JTable Catalogos_Table;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JComboBox<String> Seleccion;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
