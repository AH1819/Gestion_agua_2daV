package Vista;

import Dao.Cat_descuentoDao;
import Dao.CatalogosDao;
import Dao.ClienteDaoR;
import Dao.Det_abonoDao;
import Dao.LecturapagoDao;
import Dao.TicketDao;
import Entity.Cat_descuento;
import Entity.Cat_pago;
import Entity.Cliente;
import Entity.DetAbono;
import Entity.LecturaPago;
import Entity.MiRenderer;
import Entity.Ticket;
import Entity.ticket_generado;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Servicio_Responsive extends javax.swing.JPanel {
    
    int id_descuento = 0, id_TipoPago = 0, id_abono = 0, Lectura_pago;
    String Fecha_pago;
    String mes;
    String consumo;
    String folio_ventanilla = "No aplica";
    String[][] Adeudos;
    String[][] Tipo_pago;
    String[][] Descuentos;
    DefaultTableModel temp;
    
    public Servicio_Responsive() {
        initComponents();
        new Thread() {
            public void run() {
                Descuentos_pagos();
                Tipo_pago();
            }
        }.start();
        Buscar.setEnabled(false);
        referencia.setVisible(false);
        Referencia.setVisible(false);
        Cargando.setVisible(false);
        Generando.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        Busqueda = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        Cargando = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datos_Cliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        Mes_pagar = new javax.swing.JTextField();
        Mes_adeudo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Pago = new javax.swing.JTextField();
        recibido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cambio = new javax.swing.JTextField();
        D_pago = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        T_pago = new javax.swing.JComboBox<>();
        referencia = new javax.swing.JTextField();
        Referencia = new javax.swing.JLabel();
        Generando = new javax.swing.JLabel();
        Pagar = new javax.swing.JButton();
        Informacion_deudas = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de pago");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Dato a buscar:");

        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DatoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DatoMouseReleased(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DatoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DatoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });

        Busqueda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Folio contrato", "Folio cliente", "Telefono/celular" }));
        Busqueda.setToolTipText("Busqueda por distintos datos");
        Busqueda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BusquedaItemStateChanged(evt);
            }
        });
        Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BusquedaMousePressed(evt);
            }
        });
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarFocusLost(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        Datos_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Cte", "Nombre", "Domicilio", "Celular"
            }
        ));
        jScrollPane1.setViewportView(Datos_Cliente);
        if (Datos_Cliente.getColumnModel().getColumnCount() > 0) {
            Datos_Cliente.getColumnModel().getColumn(0).setPreferredWidth(10);
            Datos_Cliente.getColumnModel().getColumn(1).setPreferredWidth(100);
            Datos_Cliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            Datos_Cliente.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Deuda total:");

        Importe.setEditable(false);
        Importe.setBackground(new java.awt.Color(255, 255, 255));
        Importe.setText(" Importe acumulado");
        Importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImporteActionPerformed(evt);
            }
        });

        Mes_pagar.setEditable(false);
        Mes_pagar.setBackground(new java.awt.Color(255, 255, 255));
        Mes_pagar.setText(" Mes atrasado");

        Mes_adeudo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Mes_adeudo.setText("Mes a pagar:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad a pagar:");

        Pago.setEditable(false);
        Pago.setBackground(new java.awt.Color(255, 255, 255));
        Pago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PagoFocusLost(evt);
            }
        });
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagoMousePressed(evt);
            }
        });
        Pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PagoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PagoKeyTyped(evt);
            }
        });

        recibido.setEditable(false);
        recibido.setBackground(new java.awt.Color(255, 255, 255));
        recibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recibidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibidoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad recibida:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Cambio:");

        Cambio.setEditable(false);
        Cambio.setBackground(new java.awt.Color(255, 255, 255));
        Cambio.setText("$0");

        D_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        D_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_pagoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("Descuento:");

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("Tipo de pago:");

        T_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        T_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        T_pago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                T_pagoItemStateChanged(evt);
            }
        });
        T_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_pagoActionPerformed(evt);
            }
        });

        referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaActionPerformed(evt);
            }
        });
        referencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                referenciaKeyReleased(evt);
            }
        });

        Referencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Referencia.setText("Folio de ticket:");

        Generando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Generando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        Pagar.setBackground(new java.awt.Color(18, 90, 173));
        Pagar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Pagar.setForeground(new java.awt.Color(255, 255, 255));
        Pagar.setText("Realizar pago");
        Pagar.setEnabled(false);
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        Informacion_deudas.setEditable(false);
        Informacion_deudas.setColumns(20);
        Informacion_deudas.setLineWrap(true);
        Informacion_deudas.setRows(5);
        Informacion_deudas.setWrapStyleWord(true);
        Informacion_deudas.setAutoscrolls(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(9, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pago)
                                    .addComponent(Informacion_deudas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(Cambio)))
                                            .addComponent(Mes_adeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mes_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(Pagar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Generando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(T_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Mes_adeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Mes_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(recibido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(3, 3, 3)
                                        .addComponent(D_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(T_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(43, 43, 43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Generando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Referencia)
                                .addGap(0, 0, 0)
                                .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Informacion_deudas, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        ((JLabel)D_pago.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((JLabel)T_pago.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained

    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost

    }//GEN-LAST:event_DatoFocusLost

    private void DatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMousePressed

    }//GEN-LAST:event_DatoMousePressed

    private void DatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoMouseReleased

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void BusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaMousePressed

    }//GEN-LAST:event_BusquedaMousePressed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusLost

    }//GEN-LAST:event_BuscarFocusLost

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String seleccionado = Busqueda.getSelectedItem().toString();
        new Thread() {
            public void run() {
                switch (seleccionado) {
                    //Folio contrato, Folio cliente, Telefono/celular
                    case "Folio contrato":
                        contrato(Dato.getText().trim());
                        break;
                    case "Folio cliente":
                        cte(Dato.getText().trim());
                        break;
                    case "Telefono/celular":
                        num(Dato.getText());
                        break;
                }
            }
        }.start();
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased

    }//GEN-LAST:event_BuscarKeyReleased

    private void ImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImporteActionPerformed

    private void PagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusGained

    }//GEN-LAST:event_PagoFocusGained

    private void PagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusLost

    }//GEN-LAST:event_PagoFocusLost

    private void PagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMousePressed

    }//GEN-LAST:event_PagoMousePressed

    private void PagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagoKeyReleased
        Cambio_p();
        if (Pago.getText().isEmpty() || recibido.getText().isEmpty() || D_pago.getSelectedIndex() < 1 || T_pago.getSelectedIndex() < 1) {
            Pagar.setEnabled(false);
        } else {
            Pagar.setEnabled(true);
        }
    }//GEN-LAST:event_PagoKeyReleased

    private void PagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_PagoKeyTyped

    private void recibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recibidoKeyReleased
        Cambio_p();
        if (Pago.getText().isEmpty() || recibido.getText().isEmpty() || D_pago.getSelectedIndex() < 1 || T_pago.getSelectedIndex() < 1) {
            Pagar.setEnabled(false);
        } else {
            Pagar.setEnabled(true);
        }
    }//GEN-LAST:event_recibidoKeyReleased

    private void recibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recibidoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_recibidoKeyTyped

    private void D_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_pagoActionPerformed
        Cambio_p();
        if (Pago.getText().isEmpty() || recibido.getText().isEmpty() || D_pago.getSelectedIndex() < 1 || T_pago.getSelectedIndex() < 1) {
            Pagar.setEnabled(false);
        } else {
            Pagar.setEnabled(true);
        }
        if (D_pago.getSelectedIndex() > 0) {
            for (String[] Descuento : Descuentos) {
                if (Descuento[1].equals(D_pago.getSelectedItem())) {
                    id_descuento = Integer.parseInt(Descuento[0]);
                    System.out.println(id_descuento);
                }
            }
        } else {
            id_descuento = 0;
        }
    }//GEN-LAST:event_D_pagoActionPerformed

    private void T_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_pagoActionPerformed
        if (T_pago.getSelectedItem().equals("Ventanilla")) {
            Referencia.setVisible(true);
            referencia.setVisible(true);
            referencia.setText("");
        } else {
            Referencia.setVisible(false);
            referencia.setVisible(false);
            referencia.setText("No aplica");
        }
        //validar campos a rellenar por obligacion
        if (Pago.getText().isEmpty() || recibido.getText().isEmpty() || D_pago.getSelectedIndex() < 1 || T_pago.getSelectedIndex() < 1) {
            Pagar.setEnabled(false);
        } else {
            Pagar.setEnabled(true);
        }
        
        if (T_pago.getSelectedIndex() > 0) {
            for (String[] Tipos : Tipo_pago) {
                if (Tipos[1].equals(T_pago.getSelectedItem())) {
                    id_TipoPago = Integer.parseInt(Tipos[0]);
                    System.out.println(id_TipoPago);
                }
            }
        } else {
            id_TipoPago = 0;
        }
        
        if (referencia.getText().isEmpty()) {
            folio_ventanilla = "No aplica";
        } else {
            folio_ventanilla = referencia.getText().trim();
        }
    }//GEN-LAST:event_T_pagoActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        System.out.println("Pago a realizar: " + Pago.getText());
        System.out.println("Recibido: " + recibido.getText());
        System.out.println("Descuento: " + id_descuento);
        System.out.println("Tipo pago: " + id_TipoPago);
        System.out.println("Folio ventanilla: " + folio_ventanilla);
        System.out.println("Lectura pago: " + Lectura_pago);
        new Thread() {
            @Override
            public void run() {
                Animacion(true, false, false);
                InsertarPago();
            }
        }.start();
    }//GEN-LAST:event_PagarActionPerformed

    private void BusquedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BusquedaItemStateChanged
        ValidarBusqueda();
    }//GEN-LAST:event_BusquedaItemStateChanged

    private void DatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyPressed

    }//GEN-LAST:event_DatoKeyPressed

    private void DatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyReleased
        ValidarBusqueda();
    }//GEN-LAST:event_DatoKeyReleased

    private void referenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaActionPerformed

    private void T_pagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_T_pagoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_T_pagoItemStateChanged

    private void referenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_referenciaKeyReleased
        if (referencia.getText().isEmpty()) {
            folio_ventanilla = "No aplica";
        } else {
            folio_ventanilla = referencia.getText().trim();
        }
    }//GEN-LAST:event_referenciaKeyReleased
    
    private void Cambio_p() {
        
        if (!Pago.getText().isEmpty() && !Pago.getText().equals(" Cantidad a pagar") && !recibido.getText().isEmpty()) {
            double pagado_c = Double.parseDouble(recibido.getText().trim());
            double pago = Double.parseDouble(Pago.getText().trim());
            double descuento = 0;
            for (String[] Descuento : Descuentos) {
                if (Descuento[1].equals(D_pago.getSelectedItem())) {
                    descuento = Double.parseDouble(Descuento[1]);
                }
            }
            double descuento_pago = descuento / 100.0 * pago;
            System.out.println(descuento);
            double vali = 0;
            for (String[] Adeudo : Adeudos) {
                vali = Double.parseDouble(Adeudo[1]);
                System.out.println(Adeudo[0] + "\n" + Adeudo[1]);
            }
            if (pago <= pagado_c) {
                double cambio = (pagado_c - pago) + descuento_pago;
                Cambio.setForeground(Color.black);
                Cambio.setText("$" + String.valueOf(cambio));
                if (vali < pago) {
                    Cambio.setForeground(Color.red);
                }
            } else {
                if (pago > pagado_c) {
                    Cambio.setForeground(Color.red);
                }
                Cambio.setText("$0.0");
            }
        } else {
            Cambio.setText("$0.0");
        }
    }
    
    private void contrato(String num) {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.Pagocl_contrato(Integer.parseInt(num));
        int tam = lista.size();
        if (tam > 0) {
            
            String list[][] = new String[tam][4];
            Mes(Integer.parseInt(Dato.getText()));
            
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolio_cliente().toString();
                list[i][1] = lista.get(i).getNombre() + " "
                        + lista.get(i).getApellido_p() + " "
                        + lista.get(i).getApellido_m();
                list[i][2] = lista.get(i).getMunicipio() + ", "
                        + lista.get(i).getResidencia() + ", m: "
                        + String.valueOf(lista.get(i).getNumero_manzana())
                        + ", l: "
                        + String.valueOf(lista.get(i).getNumero_lote());
                list[i][3] = lista.get(i).getCelular();
                Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                consumo = lista.get(i).getConsumo();
                if (Importe.getText().equals("0.0")) {
                    Pagar.setEnabled(false);
                } else {
                    //Pagar.setEnabled(true);
                    Pago.setEditable(true);
                    recibido.setEditable(true);
                }
            }
            String head[] = {"N° Cte.", "Nombre", "Domicilio", "Celular"};
            Integer TamañoColumna[] = {10, 100, 100, 20};
            Jtable(Datos_Cliente, list, head, 4, TamañoColumna);
            Cargando.setVisible(false);
        } else {
            Limpiar(true);
        }
    }
    
    private void cte(String num) {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.Pagocl_cte(Integer.parseInt(num));
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                ContratosC cc = new ContratosC(Integer.parseInt(num), "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
                
            } else {
                
                String list[][] = new String[tam][4];
                for (int i = 0; i < tam; i++) {
                    list[i][0] = lista.get(i).getFolio_cliente().toString();
                    list[i][1] = lista.get(i).getNombre() + " "
                            + lista.get(i).getApellido_p() + " "
                            + lista.get(i).getApellido_m();
                    list[i][2] = lista.get(i).getMunicipio() + ", "
                            + lista.get(i).getResidencia() + ", m: "
                            + String.valueOf(lista.get(i).getNumero_manzana()) + ", l: "
                            + String.valueOf(lista.get(i).getNumero_lote());
                    list[i][3] = lista.get(i).getCelular();
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        //Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
                String head[] = {"N° Cte.", "Nombre", "Domicilio", "Celular"};
                Integer TamañoColumna[] = {10, 100, 100, 20};
                Jtable(Datos_Cliente, list, head, 4, TamañoColumna);
                Cargando.setVisible(false);
            }
        } else {
            Limpiar(true);
        }
        
    }
    
    private void num(String number) {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.Pagocl_num(number);
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio_cliente();
                }
                
                ContratosC cc = new ContratosC(fol, "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
                
            } else {
                String list[][] = new String[tam][4];
                for (int i = 0; i < tam; i++) {
                    list[i][0] = lista.get(i).getFolio_cliente().toString();
                    list[i][1] = lista.get(i).getNombre() + " "
                            + lista.get(i).getApellido_p() + " "
                            + lista.get(i).getApellido_m();
                    list[i][2] = lista.get(i).getMunicipio() + ", "
                            + lista.get(i).getResidencia() + ", m: "
                            + String.valueOf(lista.get(i).getNumero_manzana()) + ", l: "
                            + String.valueOf(lista.get(i).getNumero_lote());
                    list[i][3] = lista.get(i).getCelular();
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        //Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
                String head[] = {"N° Cte.", "Nombre", "Domicilio", "Celular"};
                Integer TamañoColumna[] = {10, 100, 100, 20};
                Jtable(Datos_Cliente, list, head, 4, TamañoColumna);
                Cargando.setVisible(false);
            }
        } else {
            numt();
        }
        
    }
    
    private void numt() {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.Pagocl_numT(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio_cliente();
                }
                
                ContratosC cc = new ContratosC(fol, "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
                
            } else {
                String list[][] = new String[tam][4];
                for (int i = 0; i < tam; i++) {
                    list[i][0] = lista.get(i).getFolio_cliente().toString();
                    list[i][1] = lista.get(i).getNombre() + " "
                            + lista.get(i).getApellido_p() + " "
                            + lista.get(i).getApellido_m();
                    list[i][2] = lista.get(i).getMunicipio() + ", "
                            + lista.get(i).getResidencia() + ", m: "
                            + String.valueOf(lista.get(i).getNumero_manzana()) + ", l: "
                            + String.valueOf(lista.get(i).getNumero_lote());
                    list[i][3] = lista.get(i).getCelular();
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        //Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
                String head[] = {"N° Cte.", "Nombre", "Domicilio", "Celular"};
                Integer TamañoColumna[] = {10, 100, 100, 20};
                Jtable(Datos_Cliente, list, head, 4, TamañoColumna);
                Cargando.setVisible(false);
            }
        } else {
            Limpiar(true);
        }
        
    }
    
    private void Limpiar(boolean mostrar) {
        recibido.setText("");
        Dato.setText("");
        Informacion_deudas.setText("");
        Mes_pagar.setText(" Mes atrasado");
        Importe.setText(" Importe a pagar");
        Pago.setText(" Cantidad a pagar");
        Cambio.setText("$0");
        Pagar.setEnabled(false);
        D_pago.setSelectedIndex(0);
        T_pago.setSelectedIndex(0);
        try {
            temp = (DefaultTableModel) Datos_Cliente.getModel();
            int a = temp.getRowCount();
            for (int i = 0; i < a; i++) {
                temp.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (mostrar) {
            JOptionPane.showMessageDialog(this, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //
    private void Mes(int id) {
        LecturapagoDao lp = new LecturapagoDao();
        List<LecturaPago> lista = lp.Mes_adeudo(id);
        int tam = lista.size();
        
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                mes = lista.get(i).getMes();
                Mes_pagar.setText(lista.get(i).getMes() + ": $" + lista.get(i).getAdeudo());
                Lectura_pago = lista.get(i).getIdLectPago();
                Fecha_pago = lista.get(i).getFechaHora().toString();
            }
            Meses_deber(id);
        } else {
            Mes_pagar.setText("No hay deuda");
        }
    }
    
    private void Meses_deber(int id) {
        LecturapagoDao lp = new LecturapagoDao();
        List<LecturaPago> lista = lp.Meses_adeudo(id);
        int tam = lista.size();
        
        if (tam > 0) {
            Adeudos = new String[tam][2];
            for (int i = 0; i < tam; i++) {
                Adeudos[i][0] = lista.get(i).getMes();
                Adeudos[i][1] = lista.get(i).getAdeudo().toString();
                Informacion_deudas.append(lista.get(i).getMes() + ":\t");
                Informacion_deudas.append(lista.get(i).getAdeudo().toString() + "\n");
            }
        } else {
            Mes_pagar.setText("No hay deudas");
        }
    }
    
    private void Descuentos_pagos() {
        Cat_descuentoDao ds = new Cat_descuentoDao();
        List<Cat_descuento> lista = ds.ObtenerDescuentos();
        int tam = lista.size();
        Descuentos = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Descuentos[i][0] = lista.get(i).getId_desc().toString();
            Descuentos[i][1] = lista.get(i).getPorcentaje().toString();
            D_pago.addItem(lista.get(i).getPorcentaje().toString());
        }
        
    }
    
    private void Tipo_pago() {
        
        CatalogosDao cs = new CatalogosDao();
        List<Cat_pago> lista = cs.Tipo_pago();
        int tam = lista.size();
        Tipo_pago = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Tipo_pago[i][0] = lista.get(i).getId_pago().toString();
            Tipo_pago[i][1] = lista.get(i).getTipo_pago();
            T_pago.addItem(lista.get(i).getTipo_pago());
        }
        
    }

    //realizar pago
    private void InsertarPago() {
        Det_abonoDao DA = new Det_abonoDao();
        
        DetAbono DAB = new DetAbono(Double.parseDouble(Pago.getText()), Lectura_pago, id_TipoPago, id_descuento, folio_ventanilla, Double.parseDouble(recibido.getText()));
        
        id_abono = DA.InsertarDetAbono(DAB);
        
        if (id_abono != -1) {
            JOptionPane.showMessageDialog(this, "Pago Realizado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            InsertarTicket(id_abono, Lectura_pago);
            //Animacion(false, true);
        } else {
            JOptionPane.showMessageDialog(this, "El pago no se pudo realizar", "Error :(", JOptionPane.ERROR_MESSAGE);
            Animacion(false, true, false);
        }
        
    }
    
    private void InsertarTicket(int id_abono, int Lectura_pago) {
        TicketDao TD = new TicketDao();
        
        Ticket Tk = new Ticket(id_abono, Lectura_pago);
        
        int id_ticket = TD.InsertarTicket(Tk);
        
        if (id_ticket == -1) {
            JOptionPane.showMessageDialog(this, "No se pudo generar el ticket", "Error :(", JOptionPane.ERROR_MESSAGE);
            Animacion(false, true, false);
        } else {
            MandarInformacion(id_ticket);
            Animacion(false, true, false);
            Limpiar(false);
        }
    }
    
    private void MandarInformacion(int ticket) {
        double descuento_pago = Double.parseDouble(D_pago.getSelectedItem().toString()) / 100.0 * Double.parseDouble(Pago.getText());
        Double cambio = (Double.parseDouble(recibido.getText()) - Double.parseDouble(Pago.getText()) + descuento_pago);
        ticket_generado tg = new ticket_generado(ticket, Integer.parseInt(Dato.getText()), mes, consumo, Double.parseDouble(Importe.getText()), T_pago.getSelectedItem().toString(), Double.parseDouble(D_pago.getSelectedItem().toString()), Double.parseDouble(Pago.getText()), cambio);
        Cliente CL = new Cliente(Integer.parseInt(Datos_Cliente.getValueAt(0, 0).toString()), Datos_Cliente.getValueAt(0, 1).toString(), Datos_Cliente.getValueAt(0, 2).toString());
        TicketVista TV = new TicketVista(CL);
        TV.setVisible(true);
    }
    
    private void Jtable(JTable x, String list[][], String Head[], int columnas, Integer tamañoC[]) {
        
        if (list.length > 0) {
            x.setModel(new javax.swing.table.DefaultTableModel(list, Head) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false
                };
                
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            for (int i = 0; i < columnas; i++) {
                x.getColumnModel().getColumn(i).setPreferredWidth(tamañoC[i]);
            }
            setCellRender(x);
        } else {
            x.setModel(new javax.swing.table.DefaultTableModel(list, Head));
        }
        
    }
    
    public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new MiRenderer());
        }
    }
    
    private void Animacion(boolean gif, boolean campos, boolean ref) {
        Cambio.setEnabled(campos);
        Dato.setEditable(campos);
        Busqueda.setEnabled(campos);
        Buscar.setEnabled(campos);
        Pago.setEditable(campos);
        Pagar.setEnabled(campos);
        D_pago.setEnabled(campos);
        T_pago.setEnabled(campos);
        recibido.setEnabled(campos);
        Referencia.setVisible(ref);
        referencia.setVisible(ref);
        Generando.setVisible(gif);
    }
    
    private void ValidarBusqueda() {
        String seleccionado = Busqueda.getSelectedItem().toString();
        
        if (Busqueda.getSelectedIndex() > 0 && !Dato.getText().isEmpty()) {
            Buscar.setEnabled(true);
        } else {
            Buscar.setEnabled(false);
        }
        
        if (Dato.getText().trim().length() >= 10 && seleccionado.equals("Folio contrato")) {
            Buscar.setEnabled(false);
        }
        if (Dato.getText().trim().length() >= 10 && seleccionado.equals("Folio cliente")) {
            Buscar.setEnabled(false);
        }
    }
    
    public void Paneles(Component h) {
        
        h.setLocation(0, 0);
        
        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Buscar;
    public static javax.swing.JComboBox<String> Busqueda;
    private javax.swing.JTextField Cambio;
    private javax.swing.JLabel Cargando;
    private javax.swing.JComboBox<String> D_pago;
    public static javax.swing.JTextField Dato;
    private javax.swing.JTable Datos_Cliente;
    private javax.swing.JLabel Generando;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextArea Informacion_deudas;
    private javax.swing.JLabel Mes_adeudo;
    private javax.swing.JTextField Mes_pagar;
    private javax.swing.JButton Pagar;
    private javax.swing.JTextField Pago;
    private javax.swing.JLabel Referencia;
    private javax.swing.JComboBox<String> T_pago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField recibido;
    private javax.swing.JTextField referencia;
    // End of variables declaration//GEN-END:variables
}
