package Vista;

import Controlador.Catalogo_Controller;
import Modelo.Cat_periodo;
import Modelo.Datos_Existentes;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Catalogo_extra_periodo extends javax.swing.JPanel {

    Datos_Existentes DE;
    Catalogos_Vista interfaz;
    Catalogo_Controller CC;
    int id = 0, mes_anterior = 0;
    String mes_anteriorStr = "";

    public Catalogo_extra_periodo(Catalogos_Vista interfaz) {
        initComponents();
        cargando.setVisible(false);
        actualizando.setVisible(false);
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        this.interfaz = interfaz;
        CargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        Actualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tipo_periodo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Mes_numero = new javax.swing.JTextField();
        cargando = new javax.swing.JLabel();
        actualizando = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Modificar un tipo de periodo:");

        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarKeyTyped(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setEnabled(false);
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id a buscar:");

        Tipo.setEnabled(false);
        Tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TipoKeyReleased(evt);
            }
        });

        jLabel3.setText("Tipo de periodo:");

        jLabel4.setText("Mes(numerico):");

        Mes.setEnabled(false);
        Mes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MesItemStateChanged(evt);
            }
        });
        Mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MesKeyReleased(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(18, 90, 173));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setEnabled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        jLabel5.setText("Agregar un tipo de periodo:");

        jLabel6.setText("Tipo de periodo:");

        Tipo_periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_periodoActionPerformed(evt);
            }
        });
        Tipo_periodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tipo_periodoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tipo_periodoKeyTyped(evt);
            }
        });

        jLabel7.setText("Mes(numerico):");

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setEnabled(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Mes_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mes_numeroActionPerformed(evt);
            }
        });
        Mes_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Mes_numeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Mes_numeroKeyTyped(evt);
            }
        });

        cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        actualizando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        Delete.setBackground(new java.awt.Color(18, 90, 173));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Eliminar");
        Delete.setBorder(null);
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Tipo_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Mes_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cargando)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Actualizar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(actualizando)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mes_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tipo_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargando)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualizando)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void Mes_numeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mes_numeroKeyReleased
        Guardar.setEnabled(!Tipo_periodo.getText().isEmpty() && !Mes_numero.getText().isEmpty());
    }//GEN-LAST:event_Mes_numeroKeyReleased

    private void Mes_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Mes_numeroKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Mes_numeroKeyTyped

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_buscarKeyTyped

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Mes_numero.setForeground(Color.black);
        Tipo_periodo.setForeground(Color.black);
        if (!ValidarPeriodo()) {
            GuardarPeriodo();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        ModificarPeriodo();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void Mes_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mes_numeroActionPerformed

    }//GEN-LAST:event_Mes_numeroActionPerformed

    private void Tipo_periodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_periodoActionPerformed

    }//GEN-LAST:event_Tipo_periodoActionPerformed

    private void Tipo_periodoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_periodoKeyReleased
        Guardar.setEnabled(!Tipo_periodo.getText().isEmpty() && !Mes_numero.getText().isEmpty());
    }//GEN-LAST:event_Tipo_periodoKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        Buscar.setEnabled(!buscar.getText().isEmpty());
    }//GEN-LAST:event_buscarKeyReleased

    private void TipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoKeyReleased
        Actualizar.setEnabled(!mes_anteriorStr.toLowerCase().equals(Tipo.getText().toLowerCase())
                || mes_anterior != Integer.parseInt(Mes.getSelectedItem().toString()));
    }//GEN-LAST:event_TipoKeyReleased

    private void MesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesKeyReleased

    }//GEN-LAST:event_MesKeyReleased

    private void MesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MesItemStateChanged
        Actualizar.setEnabled(!mes_anteriorStr.toLowerCase().equals(Tipo.getText().toLowerCase())
                || mes_anterior != Integer.parseInt(Mes.getSelectedItem().toString()));
    }//GEN-LAST:event_MesItemStateChanged

    private void Tipo_periodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_periodoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Tipo_periodoKeyTyped

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
    }//GEN-LAST:event_DeleteActionPerformed

    private boolean ValidarPeriodo() {
        for (Cat_periodo Periodo : DE.getPeriodos_Guardados()) {
            if (Periodo.getTipo_periodo().toLowerCase().equals(Tipo_periodo.getText().toLowerCase())) {
                Tipo_periodo.setForeground(Color.red);
                Tipo_periodo.requestFocus();
                JOptionPane.showMessageDialog(null, "El tipo de periodo ya esta registrado", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            if (Periodo.getMeses() == Integer.parseInt(Mes_numero.getText())) {
                Mes_numero.setForeground(Color.red);
                Mes_numero.requestFocus();
                JOptionPane.showMessageDialog(null, "Numero de meses ya registrado", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    private void Default() {
        Guardar.setEnabled(false);
        actualizando.setVisible(false);
        cargando.setVisible(false);
        Buscar.setEnabled(false);
        Actualizar.setEnabled(false);
        Tipo.setEnabled(false);
        Mes.setEnabled(false);
    }

    private void GuardarPeriodo() {
        cargando.setVisible(true);
        CC.setOpcion(3);
        Cat_periodo CP = new Cat_periodo();
        CP.setTipo_periodo(Tipo_periodo.getText());
        CP.setMeses(Integer.parseInt(Mes_numero.getText()));
        CC.setPeriodo(CP);

        if (CC.Create() != 0) {
            JOptionPane.showMessageDialog(null, "Tipo de Periodo registrado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            Tipo_periodo.setText("");
            Mes_numero.setText("");
            interfaz.DataController(3);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Tipo de periodo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default();
    }

    private void ModificarPeriodo() {
        actualizando.setVisible(true);
        CC.setOpcion(3);
        Cat_periodo CP = new Cat_periodo();
        CP.setId_periodo(id);
        CP.setTipo_periodo(Tipo.getText());
        CP.setMeses(Integer.parseInt(Mes.getSelectedItem().toString()));
        CC.setPeriodo(CP);

        if (CC.Update()) {
            JOptionPane.showMessageDialog(null, "Tipo de Periodo actualizado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            buscar.setText("");
            Tipo.setText("");
            Mes.setSelectedIndex(0);
            interfaz.DataController(3);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Tipo de periodo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default();
    }

    private void CargarCombo() {
        for (Cat_periodo Periodo : DE.getPeriodos_Guardados()) {
            Mes.addItem(Periodo.getMeses().toString());
        }
    }

    private void Buscar() {
        boolean status = false;
        for (Cat_periodo periodo : DE.getPeriodos_Guardados()) {
            if (periodo.getId_periodo().toString().equals(buscar.getText())) {
                id = periodo.getId_periodo();
                Tipo.setText(periodo.getTipo_periodo());
                Mes.setSelectedItem(periodo.getMeses().toString());
                mes_anterior = periodo.getMeses();
                mes_anteriorStr = periodo.getTipo_periodo();
                status = true;
            }
        }
        if (!status) {
            JOptionPane.showMessageDialog(null, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Delete.setEnabled(status);
        Tipo.setEnabled(status);
        Mes.setEnabled(status);
        Actualizar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Guardar;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Mes_numero;
    private javax.swing.JTextField Tipo;
    private javax.swing.JTextField Tipo_periodo;
    private javax.swing.JLabel actualizando;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel cargando;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
