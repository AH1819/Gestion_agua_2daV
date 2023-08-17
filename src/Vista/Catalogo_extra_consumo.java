package Vista;

import Controlador.Catalogo_Controller;
import Modelo.Cat_Consumo;
import Modelo.Datos_Existentes;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Catalogo_extra_consumo extends javax.swing.JPanel {
    
    Datos_Existentes DE;
    Catalogo_Controller CC;
    Catalogos_Vista interfaz;
    int id = 0;
    String tipoStr = "";
    
    public Catalogo_extra_consumo(Catalogos_Vista interfaz) {
        initComponents();
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        this.interfaz = interfaz;
        cargando.setVisible(false);
        actualizando.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tipo_consumo = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tipo = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        cargando = new javax.swing.JLabel();
        actualizando = new javax.swing.JLabel();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Modificar un tipo de consumo:");

        jLabel2.setText("Agregar un tipo de consumo:");

        jLabel3.setText("Tipo de consumo:");

        Tipo_consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_consumoActionPerformed(evt);
            }
        });
        Tipo_consumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tipo_consumoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tipo_consumoKeyTyped(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(18, 90, 173));
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(null);
        guardar.setEnabled(false);
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Id a buscar:");

        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
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
        Buscar.setBorder(null);
        Buscar.setEnabled(false);
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarKeyTyped(evt);
            }
        });

        jLabel5.setText("Tipo de consumo:");

        Tipo.setEnabled(false);
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        Tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TipoKeyReleased(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(18, 90, 173));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(null);
        Actualizar.setEnabled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Actualizar.setMaximumSize(new java.awt.Dimension(106, 30));
        Actualizar.setMinimumSize(new java.awt.Dimension(106, 30));
        Actualizar.setPreferredSize(new java.awt.Dimension(106, 30));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        actualizando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Tipo_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cargando)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(actualizando, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargando)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualizando)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (!ValidarConsumo()) {
            GuardarConsumo();
        } else {
            Tipo_consumo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Tipo_consumo.requestFocus();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        ModificarConsumo();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarKeyTyped

    private void buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_buscarKeyTyped

    private void Tipo_consumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_consumoActionPerformed

    }//GEN-LAST:event_Tipo_consumoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

    }//GEN-LAST:event_buscarActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed

    }//GEN-LAST:event_TipoActionPerformed

    private void Tipo_consumoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_consumoKeyReleased
        guardar.setEnabled(!Tipo_consumo.getText().isEmpty());
    }//GEN-LAST:event_Tipo_consumoKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        Buscar.setEnabled(!buscar.getText().isEmpty());
    }//GEN-LAST:event_buscarKeyReleased

    private void TipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoKeyReleased
        Actualizar.setEnabled(!Tipo.getText().isEmpty() && !tipoStr.toLowerCase().equals(Tipo.getText().toLowerCase()));
    }//GEN-LAST:event_TipoKeyReleased

    private void Tipo_consumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_consumoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Tipo_consumoKeyTyped
    
    private boolean ValidarConsumo() {
        boolean status = false;
        for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
            if (consumo.getTipo_consumo().toLowerCase().equals(Tipo_consumo.getText().toLowerCase())) {
                JOptionPane.showMessageDialog(null, "El tipo de periodo ya esta registrado", "Error", JOptionPane.ERROR_MESSAGE);
                status = true;
            }
        }
        return status;
    }
    
    private void Default(JLabel cargar) {
        guardar.setEnabled(false);
        Buscar.setEnabled(false);
        Actualizar.setEnabled(false);
        Tipo.setEnabled(false);
        cargar.setVisible(false);
    }
    
    private void GuardarConsumo() {
        cargando.setVisible(true);
        CC.setOpcion(2);
        Cat_Consumo CtC = new Cat_Consumo();
        CtC.setTipo_consumo(Tipo_consumo.getText());
        CC.setConsumo(CtC);
        
        if (CC.Create() != 0) {
            JOptionPane.showMessageDialog(null, "Tipo de Consumo registrado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            Tipo_consumo.setText("");
            interfaz.DataController(2);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Tipo de consumo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default(cargando);
    }
    
    private void ModificarConsumo() {
        actualizando.setVisible(true);
        CC.setOpcion(2);
        Cat_Consumo CtC = new Cat_Consumo();
        CtC.setId_consumo(id);
        CtC.setTipo_consumo(Tipo.getText());
        CC.setConsumo(CtC);
        
        if (CC.Update()) {
            JOptionPane.showMessageDialog(null, "Tipo de Consumo actualizado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            buscar.setText("");
            Tipo.setText("");
            Actualizar.setEnabled(false);
            interfaz.DataController(2);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Tipo de consumo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default(actualizando);
    }
    
    private void Buscar() {
        boolean status = false;
        for (Cat_Consumo consumo : DE.getConsumos_Guardados()) {
            if (consumo.getId_consumo().toString().equals(buscar.getText())) {
                Tipo.setText(consumo.getTipo_consumo());
                id = consumo.getId_consumo();
                tipoStr = consumo.getTipo_consumo();
                status = true;
            }
        }
        if (!status) {
            JOptionPane.showMessageDialog(null, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
            Tipo.setText("");
        }
        Tipo.setEnabled(status);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Tipo;
    private javax.swing.JTextField Tipo_consumo;
    private javax.swing.JLabel actualizando;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel cargando;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
