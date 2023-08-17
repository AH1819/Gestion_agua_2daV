package Vista;

import Controlador.Catalogo_Controller;
import Modelo.Cat_Consumo;
import Modelo.Datos_Existentes;
import Modelo.DetTipoconsumoTarifa;
import javax.swing.JOptionPane;

public class Catalogo_extra_tarifa extends javax.swing.JPanel {

    Datos_Existentes DE;
    Catalogo_Controller CC;
    Catalogos_Vista interfaz;
    int anteriorConsumo = 0;
    int actualConsumo = 0, insertConsumo = 0;
    int id = 0;
    double tarifa_up = 0;

    public Catalogo_extra_tarifa(Catalogos_Vista interfaz) {
        initComponents();
        cargandoA.setVisible(false);
        cargandoG.setVisible(false);
        DE = new Datos_Existentes();
        CC = new Catalogo_Controller();
        this.interfaz = interfaz;
        CargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        Tipo_consumo_update = new javax.swing.JComboBox<>();
        Tarifa_update = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Consecutivo_insert = new javax.swing.JComboBox<>();
        Tipo_consumo_insert = new javax.swing.JComboBox<>();
        Tarifa_insert = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Consumo_search = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cargandoA = new javax.swing.JLabel();
        cargandoG = new javax.swing.JLabel();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Modificar una tarifa:");

        Tipo_consumo_update.setEnabled(false);
        Tipo_consumo_update.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Tipo_consumo_updateItemStateChanged(evt);
            }
        });
        Tipo_consumo_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_consumo_updateActionPerformed(evt);
            }
        });

        Tarifa_update.setEnabled(false);
        Tarifa_update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tarifa_updateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tarifa_updateKeyTyped(evt);
            }
        });

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

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(null);
        Buscar.setEnabled(false);
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Agregar una tarifa:");

        Consecutivo_insert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Consecutivo_insert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Consecutivo_insertItemStateChanged(evt);
            }
        });
        Consecutivo_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consecutivo_insertActionPerformed(evt);
            }
        });

        Tipo_consumo_insert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Tipo_consumo_insertItemStateChanged(evt);
            }
        });
        Tipo_consumo_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_consumo_insertActionPerformed(evt);
            }
        });

        Tarifa_insert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tarifa_insertKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tarifa_insertKeyTyped(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.setEnabled(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Consecutivo:");

        Consumo_search.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Consumo_searchItemStateChanged(evt);
            }
        });

        jLabel5.setText("Tipo de consumo:");

        jLabel6.setText("Tarifa:");

        jLabel7.setText("Consecutivo:");

        jLabel8.setText("Tipo de consumo:");

        jLabel9.setText("Tarifa:");

        jLabel10.setText("Tipo de consumo:");

        cargandoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        cargandoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargandoG))
                            .addComponent(Consecutivo_insert, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tipo_consumo_insert, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tarifa_insert)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Consumo_search, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Tipo_consumo_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Tarifa_update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cargandoA)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Consecutivo_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tarifa_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(1, 1, 1)
                                .addComponent(Tipo_consumo_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargandoG)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Consumo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tipo_consumo_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tarifa_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargandoA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (!ValidarTarifaInsert(Integer.parseInt(Consecutivo_insert.getSelectedItem().toString()), insertConsumo)) {
            GuardarTarifa();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        if (!Tarifa_update.getText().isEmpty()) {
            ModificarTarifa();
        } else {

        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void Tarifa_insertKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tarifa_insertKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_Tarifa_insertKeyTyped

    private void Tarifa_updateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tarifa_updateKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_Tarifa_updateKeyTyped

    private void Tipo_consumo_updateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Tipo_consumo_updateItemStateChanged
        Actualizar.setEnabled(anteriorConsumo != actualConsumo || !Tarifa_update.getText().equals(String.valueOf(tarifa_up)));
    }//GEN-LAST:event_Tipo_consumo_updateItemStateChanged

    private void Tipo_consumo_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_consumo_updateActionPerformed
        for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
            if (consumo.getTipo_consumo().equals(Tipo_consumo_update.getSelectedItem())) {
                actualConsumo = consumo.getId_consumo();
            }
        }
    }//GEN-LAST:event_Tipo_consumo_updateActionPerformed

    private void Tipo_consumo_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_consumo_insertActionPerformed
        for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
            if (consumo.getTipo_consumo().equals(Tipo_consumo_insert.getSelectedItem())) {
                insertConsumo = consumo.getId_consumo();
            }
        }
    }//GEN-LAST:event_Tipo_consumo_insertActionPerformed

    private void Consecutivo_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consecutivo_insertActionPerformed

    }//GEN-LAST:event_Consecutivo_insertActionPerformed

    private void Consecutivo_insertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Consecutivo_insertItemStateChanged
        Guardar.setEnabled(Consecutivo_insert.getSelectedIndex() > 0 && Tipo_consumo_insert.getSelectedIndex() > 0 && !Tarifa_insert.getText().isEmpty());
    }//GEN-LAST:event_Consecutivo_insertItemStateChanged

    private void Tipo_consumo_insertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Tipo_consumo_insertItemStateChanged
        Guardar.setEnabled(Consecutivo_insert.getSelectedIndex() > 0 && Tipo_consumo_insert.getSelectedIndex() > 0 && !Tarifa_insert.getText().isEmpty());
    }//GEN-LAST:event_Tipo_consumo_insertItemStateChanged

    private void Tarifa_insertKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tarifa_insertKeyReleased
        Guardar.setEnabled(Consecutivo_insert.getSelectedIndex() > 0 && Tipo_consumo_insert.getSelectedIndex() > 0 && !Tarifa_insert.getText().isEmpty());
    }//GEN-LAST:event_Tarifa_insertKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        Buscar.setEnabled(!buscar.getText().isEmpty() && Consumo_search.getSelectedIndex() > 0);
    }//GEN-LAST:event_buscarKeyReleased

    private void Consumo_searchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Consumo_searchItemStateChanged
        Buscar.setEnabled(!buscar.getText().isEmpty() && Consumo_search.getSelectedIndex() > 0);
    }//GEN-LAST:event_Consumo_searchItemStateChanged

    private void Tarifa_updateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tarifa_updateKeyReleased
        Actualizar.setEnabled(anteriorConsumo != actualConsumo || !Tarifa_update.getText().equals(String.valueOf(tarifa_up)));
    }//GEN-LAST:event_Tarifa_updateKeyReleased

    private void CargarCombo() {
        if (DE.getConsumos_Guardados() != null) {
            Tipo_consumo_insert.addItem("Selecciona una opcion");
            Consumo_search.addItem("Selecciona una opcion");
            for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
                Tipo_consumo_insert.addItem(consumo.getTipo_consumo());
                Tipo_consumo_update.addItem(consumo.getTipo_consumo());
                Consumo_search.addItem(consumo.getTipo_consumo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Catalogo Consumo Vacio", "Error", JOptionPane.ERROR_MESSAGE);
            //Guardar.setVisible(false);
            //jButton2.setEnabled(false);
            //jButton1.setEnabled(false);
        }
    }

    private void Default() {
        Consecutivo_insert.setSelectedIndex(0);
        insertConsumo = 0;
        Tarifa_insert.setText("");
        buscar.setText("");
        anteriorConsumo = 0;
        actualConsumo = 0;
        Tarifa_update.setText("");
        cargandoA.setVisible(false);
        cargandoG.setVisible(false);
        interfaz.DataController(5);
    }

    private boolean ValidarTarifaInsert(int consec, int id_consumo) {
        for (DetTipoconsumoTarifa tarifas : DE.getTarifas_Guardadas()) {
            if (tarifas.getConsec() == consec && tarifas.getId_consumo() == id_consumo) {
                JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo N° y Consumo", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    private void GuardarTarifa() {
        cargandoG.setVisible(true);
        CC.setOpcion(5);
        DetTipoconsumoTarifa tari = new DetTipoconsumoTarifa();
        tari.setConsec(Integer.parseInt(Consecutivo_insert.getSelectedItem().toString()));
        tari.setId_consumo(insertConsumo);
        tari.setTarifa(Double.parseDouble(Tarifa_insert.getText()));
        CC.setTarifa(tari);
        if (CC.Create() != 0) {
            JOptionPane.showMessageDialog(null, "Tarifa registrada con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            Default();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la Tarifa", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean ValidarTarifaUpdate(int consec, int id_consumo, int consumo) {
        for (DetTipoconsumoTarifa tarifas : DE.getTarifas_Guardadas()) {
            if (tarifas.getConsec() == consec && tarifas.getId_consumo() == id_consumo) {
                if (id_consumo == consumo) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private void ModificarTarifa() {
        if (actualConsumo == 0) {
            actualConsumo = anteriorConsumo;
        }

        if (ValidarTarifaUpdate(id, actualConsumo, anteriorConsumo)) {
            CC.setOpcion(4);
            DetTipoconsumoTarifa tari = new DetTipoconsumoTarifa();
            tari.setConsec(id);
            tari.setId_consumo(anteriorConsumo);
            tari.setConsumo_act(actualConsumo);
            tari.setTarifa(Double.parseDouble(Tarifa_update.getText()));
            CC.setTarifa(tari);
            if (CC.Update()) {
                JOptionPane.showMessageDialog(null, "Tarifa actualizada con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                Default();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la Tarifa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe un registro con el mismo N° y Consumo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Buscar() {
        boolean status = false;
        for (DetTipoconsumoTarifa tarifa : DE.getTarifas_Guardadas()) {
            if (tarifa.getConsec() == Integer.parseInt(buscar.getText()) && tarifa.getTipo_consumo().equals(Consumo_search.getSelectedItem())) {
                Tipo_consumo_update.setSelectedItem(tarifa.getTipo_consumo());
                Tarifa_update.setText(tarifa.getTarifa().toString());
                tarifa_up = tarifa.getTarifa();
                id = tarifa.getConsec();
                anteriorConsumo = tarifa.getId_consumo();
                status = true;
            }
        }
        if (!status) {
            JOptionPane.showMessageDialog(null, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Tipo_consumo_update.setEnabled(status);
        Tarifa_update.setEnabled(status);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> Consecutivo_insert;
    private javax.swing.JComboBox<String> Consumo_search;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Tarifa_insert;
    private javax.swing.JTextField Tarifa_update;
    private javax.swing.JComboBox<String> Tipo_consumo_insert;
    private javax.swing.JComboBox<String> Tipo_consumo_update;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel cargandoA;
    private javax.swing.JLabel cargandoG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
