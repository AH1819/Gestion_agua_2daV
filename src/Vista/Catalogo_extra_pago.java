package Vista;

import Controlador.Catalogo_Controller;
import Modelo.Cat_pago;
import Modelo.Datos_Existentes;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class Catalogo_extra_pago extends javax.swing.JPanel {

    Catalogos_Vista CV;
    Datos_Existentes DE;
    Catalogo_Controller CC;
    int id = 0;

    public Catalogo_extra_pago(Catalogos_Vista CV) {
        initComponents();
        CC = new Catalogo_Controller();
        DE = new Datos_Existentes();
        CargandoG.setVisible(false);
        CargandoA.setVisible(false);
        this.CV = CV;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tipo_Guardar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        CargandoG = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tipo_Actualizar = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        CargandoA = new javax.swing.JLabel();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Agregar tipo de pago:");

        jLabel2.setText("Modificar tipo de pago:");

        Tipo_Guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tipo_GuardarKeyReleased(evt);
            }
        });

        jLabel3.setText("Tipo de pago:");

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/guardar.png"))); // NOI18N
        Guardar.setText("Guardar");
        Guardar.setToolTipText("");
        Guardar.setBorder(null);
        Guardar.setEnabled(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
                GuardarActionPerformed1(evt);
            }
        });

        CargandoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        jLabel4.setText("id a buscar:");

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
        Buscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de pago:");

        Tipo_Actualizar.setEnabled(false);
        Tipo_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_ActualizarActionPerformed(evt);
            }
        });
        Tipo_Actualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tipo_ActualizarKeyReleased(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(18, 90, 173));
        Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.setBorder(null);
        Actualizar.setEnabled(false);
        Actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        CargandoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tipo_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CargandoG)))
                        .addGap(169, 169, 169)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Tipo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CargandoA)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(Tipo_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CargandoG)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                        .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tipo_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(CargandoA)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tipo_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_ActualizarActionPerformed

    }//GEN-LAST:event_Tipo_ActualizarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (!ValidarTipo(Tipo_Guardar.getText())) {
            GuardarTipo();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        if (!ValidarTipo(Tipo_Actualizar.getText())) {
            Modificar();
        }
    }//GEN-LAST:event_ActualizarActionPerformed

    private void GuardarActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed1

    }//GEN-LAST:event_GuardarActionPerformed1

    private void Tipo_GuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_GuardarKeyReleased
        Guardar.setEnabled(!Tipo_Guardar.getText().isEmpty());
    }//GEN-LAST:event_Tipo_GuardarKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        Buscar.setEnabled(!buscar.getText().isEmpty());
    }//GEN-LAST:event_buscarKeyReleased

    private void Tipo_ActualizarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_ActualizarKeyReleased
        Actualizar.setEnabled(!Tipo_Actualizar.getText().isEmpty());
    }//GEN-LAST:event_Tipo_ActualizarKeyReleased

    private boolean ValidarTipo(String tipo) {
        for (Cat_pago tipos : DE.getTipos_Guardados()) {
            if (tipos.getTipo_pago().toLowerCase().trim().equals(tipo.toLowerCase().trim())) {
                JOptionPane.showMessageDialog(null, "El tipo de pago ya esta registrado", "Error", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    private void Default(JLabel cargar) {
        cargar.setVisible(false);
        Actualizar.setEnabled(false);
        Buscar.setEnabled(false);
        Guardar.setEnabled(false);
        Tipo_Actualizar.setEnabled(false);
    }

    private void GuardarTipo() {
        CargandoG.setVisible(true);
        CC.setOpcion(4);
        Cat_pago cp = new Cat_pago();
        cp.setTipo_pago(Tipo_Guardar.getText());
        CC.setPago(cp);

        if (CC.Create() != 0) {
            JOptionPane.showMessageDialog(null, "Tipo de Consumo registrado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            Tipo_Guardar.setText("");
            CV.DataController(4);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Tipo de consumo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default(CargandoG);
    }

    private void Modificar() {
        CargandoA.setVisible(true);
        CC.setOpcion(5);
        Cat_pago cp = new Cat_pago();
        cp.setId_tipo_pago(id);
        cp.setTipo_pago(Tipo_Actualizar.getText());
        CC.setPago(cp);

        if (CC.Update()) {
            JOptionPane.showMessageDialog(null, "Tipo de pago actualizado con exito", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            Tipo_Actualizar.setText("");
            CV.DataController(4);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el Tipo de pago", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Default(CargandoA);
    }

    private void Buscar() {
        boolean status = false;
        for (Cat_pago pago : DE.getTipos_Guardados()) {
            if (pago.getId_tipo_pago().toString().equals(buscar.getText())) {
                Tipo_Actualizar.setText(pago.getTipo_pago());
                id = pago.getId_tipo_pago();
                status = true;
            }
        }
        if (!status) {
            JOptionPane.showMessageDialog(null, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
            Tipo_Actualizar.setText("");
        }
        Tipo_Actualizar.setEnabled(status);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel CargandoA;
    private javax.swing.JLabel CargandoG;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Tipo_Actualizar;
    private javax.swing.JTextField Tipo_Guardar;
    private javax.swing.JTextField buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
