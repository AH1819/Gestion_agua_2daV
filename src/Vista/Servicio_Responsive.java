package Vista;

import Controlador.Catalogo_Controller;
import Controlador.Cliente_Controller;
import Controlador.DetAbono_Controller;
import Controlador.Lecturas_Controller;
import Dao.TicketDao;
import Modelo.Cat_descuento;
import Modelo.Cat_pago;
import Modelo.Cliente;
import Modelo.DetAbono;
import Modelo.LecturaPago;
import Modelo.MiRenderer;
import Modelo.Ticket;
import Modelo.ticket_generado;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
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
    ArrayList<Cat_pago> Tipo_pago;
    ArrayList<Cat_descuento> Descuentos;
    DefaultTableModel temp;
    Catalogo_Controller CC;
    Cliente_Controller CTC;
    DetAbono_Controller DAC;
    Lecturas_Controller LP;

    public Servicio_Responsive() {
        initComponents();
        CC = new Catalogo_Controller();
        CTC = new Cliente_Controller();
        DAC = new DetAbono_Controller();
        temp = (DefaultTableModel) Datos_Cliente.getModel();
        LP = new Lecturas_Controller();
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
        Abonos = new javax.swing.JButton();

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
        D_pago.setEnabled(false);
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
        T_pago.setEnabled(false);
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

        Abonos.setBackground(new java.awt.Color(18, 90, 173));
        Abonos.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Abonos.setForeground(new java.awt.Color(255, 255, 255));
        Abonos.setText("Ver abonos");
        Abonos.setEnabled(false);
        Abonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonosActionPerformed(evt);
            }
        });

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
                        .addContainerGap(34, Short.MAX_VALUE)
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
                            .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Abonos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(3, 3, 3)
                                        .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Abonos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(18, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(3, 3, 3)
                                .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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
                    .addComponent(T_pago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(43, 43, 43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Informacion_deudas, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addContainerGap(28, Short.MAX_VALUE))))
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
        Cargando.setVisible(true);
        String seleccionado = Busqueda.getSelectedItem().toString();
        new Thread() {
            public void run() {
                switch (seleccionado) {
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
            Descuentos.forEach((desc) -> {
                if (desc.getPorcentaje() == Double.parseDouble(D_pago.getSelectedItem().toString())) {
                    id_descuento = desc.getId_desc();
                }
            });
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
        if (Pago.getText().isEmpty() || recibido.getText().isEmpty() || D_pago.getSelectedIndex() < 1 || T_pago.getSelectedIndex() < 1) {
            Pagar.setEnabled(false);
        } else {
            Pagar.setEnabled(true);
        }

        if (T_pago.getSelectedIndex() > 0) {
            Tipo_pago.forEach((tipo) -> {
                if (tipo.getTipo_pago().equals(T_pago.getSelectedItem())) {
                    id_TipoPago = tipo.getId_tipo_pago();
                }
            });
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

    private void AbonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonosActionPerformed
        AbonosView a = new AbonosView(Integer.parseInt(Dato.getText()), this);
        Paneles(a);
    }//GEN-LAST:event_AbonosActionPerformed

    private void Cambio_p() {

        if (!Pago.getText().isEmpty() && !recibido.getText().isEmpty()) {
            double pagado_c = Double.parseDouble(recibido.getText().trim());
            double pago = Double.parseDouble(Pago.getText().trim());
            double descuento = (!D_pago.getSelectedItem().equals("Seleccione una opción")) ? Double.parseDouble(D_pago.getSelectedItem().toString()) : 0;

            double descuento_pago = descuento / 100.0 * pago;
            double vali = 0;
            for (String[] Adeudo : Adeudos) {
                vali = Double.parseDouble(Adeudo[1]);
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

    private void DataTable(ArrayList<Cliente> datos) {
        temp.setRowCount(0);
        for (Cliente dato : datos) {
            Object[] fila = {
                dato.getFolio_cliente(),
                dato.getNombre() + " " + dato.getApellido_p() + " " + dato.getApellido_m(),
                dato.getMunicipio() + " " + dato.getResidencia() + " mnz: " + dato.getNumero_manzana() + " Lt: " + dato.getNumero_lote(),
                dato.getCelular()
            };
            temp.addRow(fila);
            Importe.setText(String.valueOf(dato.getDeuda()));
            consumo = dato.getConsumo();
            if (Importe.getText().equals("0.0")) {
                Pagar.setEnabled(false);
                Pago.setEditable(false);
                D_pago.setEnabled(false);
                T_pago.setEnabled(false);
            } else {
                D_pago.setEnabled(true);
                T_pago.setEnabled(true);
                Pago.setEditable(true);
                Pago.setEnabled(true);
                recibido.setEditable(true);
                recibido.setEnabled(true);
            }
        }
        setCellRender(Datos_Cliente);
        Abonos.setEnabled(true);
        Cargando.setVisible(false);
    }

    private void contrato(String num) {
        ArrayList<Cliente> lista = CTC.pagocl_ct(Integer.parseInt(num));
        if (!lista.isEmpty()) {
            Mes(Integer.parseInt(Dato.getText()));
            DataTable(lista);
        } else {
            Limpiar(true);
        }
    }

    private void cte(String num) {
        ArrayList<Cliente> lista = CTC.pagocl_cte(Integer.parseInt(num));
        int tam = lista.size();
        if (!lista.isEmpty()) {
            if (tam > 1) {
                ContratosC cc = new ContratosC(Integer.parseInt(num), "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
            } else {
                Mes(Integer.parseInt(Dato.getText()));
                DataTable(lista);
            }
        } else {
            Limpiar(true);
        }

    }

    private void num(String number) {
        ArrayList<Cliente> lista = CTC.pagocl_num(number);
        int tam = lista.size();
        if (!lista.isEmpty()) {
            if (tam > 1) {
                int fol;
                fol = lista.get(0).getFolio_cliente();
                ContratosC cc = new ContratosC(fol, "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
            } else {
                Mes(Integer.parseInt(Dato.getText()));
                DataTable(lista);
            }
        } else {
            numt();
        }

    }

    private void numt() {
        ArrayList<Cliente> lista = CTC.pagocl_numT(Dato.getText());
        int tam = lista.size();
        if (!lista.isEmpty()) {
            if (tam > 1) {
                int fol;
                fol = lista.get(0).getFolio_cliente();
                ContratosC cc = new ContratosC(fol, "Elija un contrato", "Servicio", this);
                cc.setVisible(true);
            } else {
                Mes(Integer.parseInt(Dato.getText()));
                DataTable(lista);
            }
        } else {
            Limpiar(true);
        }
    }

    private void Limpiar(boolean mostrar) {
        Cargando.setVisible(false);
        Buscar.setEnabled(false);
        Busqueda.setSelectedIndex(0);
        recibido.setText("");
        Dato.setText("");
        Informacion_deudas.setText("");
        Mes_pagar.setText(" Mes atrasado");
        Importe.setText(" Importe a pagar");
        Cambio.setText("$0");
        Pagar.setEnabled(false);
        D_pago.setSelectedIndex(0);
        T_pago.setSelectedIndex(0);
        temp.setRowCount(0);
        Pago.setText("");
        Pago.setEnabled(false);
        recibido.setEnabled(false);
        D_pago.setEnabled(false);
        T_pago.setEnabled(false);
        Abonos.setEnabled(false);
        if (mostrar) {
            JOptionPane.showMessageDialog(this, "No se encontro registro alguno", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Mes(int id) {
        LecturaPago lista = LP.Mes_adeudo(id);
        if (lista.getIdLectPago() != null) {
            mes = lista.getMes();
            Mes_pagar.setText(lista.getMes() + ": $" + lista.getAdeudo());
            Lectura_pago = lista.getIdLectPago();
            Fecha_pago = lista.getFechaHora().toString();
            Meses_deber(id);
        } else {
            Limpiar(false);
            Mes_pagar.setText("No hay deuda");
        }
    }

    private void Meses_deber(int id) {
        ArrayList<LecturaPago> lista = LP.Meses_adeudo(id);
        int tam = lista.size();
        int i = 0;
        if (!lista.isEmpty()) {
            Informacion_deudas.setText("");
            Adeudos = new String[tam][2];
            for (LecturaPago lecturaPago : lista) {
                Adeudos[i][0] = lecturaPago.getMes();
                Adeudos[i][1] = lecturaPago.getAdeudo().toString();
                Informacion_deudas.append(lecturaPago.getMes() + ":\t" + lecturaPago.getAdeudo().toString() + "\n");
                i++;
            }
        } else {
            Limpiar(false);
            Mes_pagar.setText("No hay deudas");
        }
    }

    private void Descuentos_pagos() {
        CC.setOpcion(1);
        CC.setOpcionS("porcentaje asc");
        ArrayList<Cat_descuento> lista = (ArrayList<Cat_descuento>) CC.Read();
        if (lista.size() > 0) {
            D_pago.setEnabled(true);
            Pagar.setEnabled(true);
            Descuentos = lista;
            lista.forEach((descuento) -> {
                D_pago.addItem(descuento.getPorcentaje().toString());
            });
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron Descuentos disponibles\n Consulte el problema con el administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
            D_pago.setEnabled(false);
            Pagar.setEnabled(false);
        }
    }

    private void Tipo_pago() {
        CC.setOpcion(4);
        ArrayList<Cat_pago> lista = (ArrayList<Cat_pago>) CC.Read();
        if (lista.size() > 0) {
            T_pago.setEnabled(true);
            Pagar.setEnabled(true);
            Tipo_pago = lista;
            lista.forEach((tipo_pago) -> {
                T_pago.addItem(tipo_pago.getTipo_pago());
            });
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron Tipos de pago disponibles\n Consulte el problema con el administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
            T_pago.setEnabled(false);
            Pagar.setEnabled(false);
        }
    }

    //realizar pago
    private void InsertarPago() {
        DetAbono DAB = new DetAbono();
        DAB.setAbono(Double.parseDouble(Pago.getText()));
        DAB.setId_lectura_pago(Lectura_pago);
        DAB.setId_tipo_pago(id_TipoPago);
        DAB.setId_desc(id_descuento);
        DAB.setFolio_ventanilla(folio_ventanilla);
        DAB.setPagado(Double.parseDouble(recibido.getText()));

        DAC.setAbono(DAB);
        id_abono = DAC.Create();

        if (id_abono != -1) {
            JOptionPane.showMessageDialog(this, "Pago Realizado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            InsertarTicket(id_abono, Lectura_pago);
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

        Cliente CL = new Cliente();

        CL.setFolio_cliente(Integer.parseInt(Datos_Cliente.getValueAt(0, 0).toString()));
        CL.setNombre(Datos_Cliente.getValueAt(0, 1).toString());
        CL.setResidencia(Datos_Cliente.getValueAt(0, 2).toString());

        TicketVista TV = new TicketVista(CL);
        TV.setVisible(true);
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
        Buscar.setEnabled(!Dato.getText().isEmpty() && Busqueda.getSelectedIndex() > 0);
    }

    public void Paneles(Component h) {

        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abonos;
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
