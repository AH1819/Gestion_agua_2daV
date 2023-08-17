package Vista;

import Controlador.Catalogo_Controller;
import Modelo.CeldaRender;
import Modelo.Cat_descuento;
import Modelo.Datos_Existentes;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Descuentos_Vista extends javax.swing.JPanel {

    DefaultTableModel modelo;
    Catalogo_Controller CC;
    Datos_Existentes DE;
    int id = 0;

    public Descuentos_Vista() {
        initComponents();
        Cargando.setVisible(false);
        CargandoG.setVisible(false);
        modelo = (DefaultTableModel) Descuentos.getModel();
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        DataController("Activo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        Descuentos = new javax.swing.JTable();
        Activo_inactivo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        busqueda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        descripcion_update = new javax.swing.JTextField();
        fecha_fin_update = new com.toedter.calendar.JDateChooser();
        fecha_ini_update = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        porcentaje_update = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Porcentaje_insert = new javax.swing.JTextField();
        Descripcion_desc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fech_ini = new com.toedter.calendar.JDateChooser();
        fech_fin = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Cargando = new javax.swing.JLabel();
        CargandoG = new javax.swing.JLabel();

        Descuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Fecha inicio", "Fecha fin", "Descripcion", "Porcentaje", "Status"
            }
        ));
        jScrollPane3.setViewportView(Descuentos);

        Activo_inactivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activos", "Inactivos" }));
        Activo_inactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Activo_inactivoActionPerformed(evt);
            }
        });

        jLabel12.setText("Actualizar un descuento:");

        busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaActionPerformed(evt);
            }
        });

        jLabel13.setText("Id:");

        Search.setBackground(new java.awt.Color(18, 90, 173));
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Buscar.png"))); // NOI18N
        Search.setText("Buscar");
        Search.setBorder(null);
        Search.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha de inicio:");

        jLabel15.setText("Fecha de fin:");

        jLabel16.setText("Descripcion:");

        jLabel17.setLabelFor(porcentaje_update);
        jLabel17.setText("Porcentaje:");

        Actualizar.setBackground(new java.awt.Color(18, 90, 173));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(null);
        Actualizar.setEnabled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel10.setText("Porcentaje:");

        jLabel11.setText("Descripcion:");

        jLabel9.setText("Fecha de fin:");

        jLabel8.setText("Fecha de inicio:");

        jLabel7.setText("Agregar un descuento:");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        CargandoG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CargandoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(Activo_inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fech_ini, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fech_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Descripcion_desc, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Porcentaje_insert)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CargandoG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(porcentaje_update, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha_ini_update, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecha_fin_update, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(descripcion_update))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(Activo_inactivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fech_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fech_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Descripcion_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Guardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(Porcentaje_insert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(CargandoG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha_ini_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_fin_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcion_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(porcentaje_update, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                            .addComponent(Cargando)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Activo_inactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Activo_inactivoActionPerformed
        if (Activo_inactivo.getSelectedItem().equals("Activos")) {
            DataTable("Activo");
        } else {
            DataTable("Inactivo");
        }
    }//GEN-LAST:event_Activo_inactivoActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        boolean status = false;
        if (!busqueda.getText().isEmpty()) {
            busqueda.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            for (Cat_descuento Descuento : DE.getDescuentos_Guardados()) {
                if (Descuento.getId_desc() == Integer.parseInt(busqueda.getText().trim())) {
                    id = Descuento.getId_desc();
                    fecha_ini_update.setDate(Descuento.getFecha_inc());
                    fecha_fin_update.setDate(Descuento.getFecha_fin());
                    descripcion_update.setText(Descuento.getDescripcion());
                    porcentaje_update.setText(Descuento.getPorcentaje().toString());
                    status = true;
                }
            }
            if (!status) {
                id = 0;
                fecha_ini_update.setDate(null);
                fecha_fin_update.setDate(null);
                descripcion_update.setText("");
                porcentaje_update.setText("");
                JOptionPane.showMessageDialog(this, "No se encontro ningun registro", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
            Actualizar.setEnabled(status);
        } else {
            busqueda.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            busqueda.requestFocus();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Cargando.setVisible(true);
        if (fecha_ini_update.getDate() != null) {
            porcentaje_update.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            if (fecha_fin_update.getDate() != null) {
                if (regresarDate(fecha_ini_update).compareTo(regresarDate(fecha_fin_update)) < 0) {
                    porcentaje_update.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                    if (!descripcion_update.getText().isEmpty()) {
                        porcentaje_update.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        if (!porcentaje_update.getText().isEmpty()) {
                            porcentaje_update.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                            ModificarDescuento();
                        } else {
                            porcentaje_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                            porcentaje_update.requestFocus();
                        }
                    } else {
                        descripcion_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                        descripcion_update.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha de fin debe ser posterior a la fecha de inicio", "AVISO", JOptionPane.WARNING_MESSAGE);

                    fecha_ini_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    fecha_fin_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    fecha_fin_update.requestFocus();
                }
            } else {
                fecha_fin_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                fecha_fin_update.requestFocus();
            }
        } else {
            fecha_ini_update.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            fecha_ini_update.requestFocus();
        }
        Cargando.setVisible(false);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        CargandoG.setVisible(true);
        if (fech_ini.getDate() != null) {
            fech_ini.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            if (fech_fin.getDate() != null) {
                fech_fin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                if (regresarDate(fech_ini).compareTo(regresarDate(fech_fin)) < 0) {
                    if (!Descripcion_desc.getText().isEmpty()) {
                        Descripcion_desc.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        if (!Porcentaje_insert.getText().isEmpty()) {
                            Porcentaje_insert.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                            GuardarDescuento();
                        } else {
                            Porcentaje_insert.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                            Porcentaje_insert.requestFocus();
                        }
                    } else {
                        Descripcion_desc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                        Descripcion_desc.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha de fin debe ser posterior a la fecha de inicio", "AVISO", JOptionPane.WARNING_MESSAGE);

                    fech_ini.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    fech_fin.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    fech_fin.requestFocus();
                }
            } else {
                fech_fin.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                fech_fin.requestFocus();
            }
        } else {
            fech_ini.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            fech_ini.requestFocus();
        }
        CargandoG.setVisible(false);
    }//GEN-LAST:event_GuardarActionPerformed

    private void busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaActionPerformed

    }//GEN-LAST:event_busquedaActionPerformed

    private void DataController(String opcion) {
        CC.setOpcion(1);
        CC.setOpcionS("id_desc asc");
        DE.setDescuentos_Guardados((ArrayList<Cat_descuento>) CC.Read());
        DataTable(opcion);
    }

    private void DataTable(String opcion) {

        modelo.setRowCount(0);

        if (DE.getDescuentos_Guardados() != null) {

            switch (opcion) {
                case "Activo":
                case "Inactivo":

                    for (Cat_descuento descuentos : DE.getDescuentos_Guardados()) {
                        if (descuentos.getStatus().equals(opcion)) {
                            Object[] fila = {
                                descuentos.getId_desc(),
                                descuentos.getFecha_inc(),
                                descuentos.getFecha_fin(),
                                descuentos.getDescripcion(),
                                descuentos.getPorcentaje(),
                                descuentos.getStatus()
                            };
                            modelo.addRow(fila);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay registros", "Aviso", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }

                    break;
            }
        }
        Descuentos.setModel(modelo);
        Render(Descuentos, this);
    }

    private void GuardarDescuento() {
        java.sql.Date fecha_inicio = regresarDate(fech_ini);
        java.sql.Date fecha_final = regresarDate(fech_fin);

        Cat_descuento cdd = new Cat_descuento();
        cdd.setFecha_inc(fecha_inicio);
        cdd.setFecha_fin(fecha_final);
        cdd.setDescripcion(Descripcion_desc.getText());
        cdd.setPorcentaje(Double.parseDouble(Porcentaje_insert.getText()));
        CC.setOpcion(1);
        CC.setDescuento(cdd);

        if (CC.Create() != 0) {
            JOptionPane.showMessageDialog(null, "El descuento se registro con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            DataController("Activo");
            fech_ini.setCalendar(null);
            fech_fin.setCalendar(null);
            Descripcion_desc.setText("");
            Porcentaje_insert.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar el descuento", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void ModificarDescuento() {
        java.sql.Date fecha_inicio = regresarDate(fecha_ini_update);
        java.sql.Date fecha_final = regresarDate(fecha_fin_update);

        Cat_descuento cdd = new Cat_descuento();
        cdd.setId_desc(id);
        cdd.setFecha_inc(fecha_inicio);
        cdd.setFecha_fin(fecha_final);
        cdd.setDescripcion(descripcion_update.getText());
        cdd.setPorcentaje(Double.parseDouble(porcentaje_update.getText().trim()));

        CC.setDescuento(cdd);
        CC.setOpcion(1);

        if (CC.Update()) {
            JOptionPane.showMessageDialog(null, "El descuento se actualizo con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            DataController("Activo");
            busqueda.setText("");
            fecha_ini_update.setCalendar(null);
            fecha_fin_update.setCalendar(null);
            descripcion_update.setText("");
            porcentaje_update.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el descuento", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private java.sql.Date regresarDate(JDateChooser fecha) {
        Date date = fecha.getDate();

        long d = date.getTime();
        java.sql.Date fecha_result = new java.sql.Date(d);

        return fecha_result;
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
    private javax.swing.JComboBox<String> Activo_inactivo;
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JLabel CargandoG;
    private javax.swing.JTextField Descripcion_desc;
    private javax.swing.JTable Descuentos;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Porcentaje_insert;
    private javax.swing.JButton Search;
    private javax.swing.JTextField busqueda;
    private javax.swing.JTextField descripcion_update;
    private com.toedter.calendar.JDateChooser fech_fin;
    private com.toedter.calendar.JDateChooser fech_ini;
    private com.toedter.calendar.JDateChooser fecha_fin_update;
    private com.toedter.calendar.JDateChooser fecha_ini_update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField porcentaje_update;
    // End of variables declaration//GEN-END:variables
}
