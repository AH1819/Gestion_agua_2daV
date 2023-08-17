package Vista;

import Controlador.Contrato_Controller;
import Controlador.Lecturas_Controller;
import Modelo.CeldaRender;
import Modelo.ErrorsAndSuccessesBD;
import Modelo.CargarDatos;
import Modelo.Contrato;
import Modelo.Datos_Existentes;
import Modelo.LecturaPago;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Lecturas extends javax.swing.JPanel {

    Datos_Existentes DE = new Datos_Existentes();
    DefaultTableModel modeloLectura;
    Contrato_Controller CTC;
    int folio;
    boolean NuevaLectura;
    Lecturas_Controller LC = new Lecturas_Controller();
    ErrorsAndSuccessesBD eas = new ErrorsAndSuccessesBD();

    public Lecturas() {
        initComponents();
        CTC = new Contrato_Controller();
        Cargando.setVisible(false);
        modeloLectura = (DefaultTableModel) LecturaTable.getModel();
        CargarLecturas();
        fecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LecturaTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Inicial = new javax.swing.JTextField();
        BuscarLectura = new javax.swing.JButton();
        fijo = new javax.swing.JCheckBox();
        Importe = new javax.swing.JTextField();
        Informacion_icon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Final = new javax.swing.JTextField();
        Consumo = new javax.swing.JTextField();
        id_mes = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Guardar_Lectura = new javax.swing.JButton();
        Cargando = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        LecturaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Contrato", "Cliente", "Id lectura", "Consumo", "Fecha de la lectura", "Periodo de pago", "Meses transcurridos", "Estado del pago", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LecturaTable);

        Informacion.setEditable(false);
        Informacion.setColumns(20);
        Informacion.setLineWrap(true);
        Informacion.setRows(5);
        Informacion.setWrapStyleWord(true);
        jScrollPane5.setViewportView(Informacion);

        jLabel5.setText("Folio a buscar:");

        Dato.setBackground(new java.awt.Color(255, 255, 255));
        Dato.setText(" Ingresa el folio del contrato");
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
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

        jLabel3.setText("Lectura Inicial:");

        Inicial.setEditable(false);
        Inicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InicialFocusGained(evt);
            }
        });
        Inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InicialKeyReleased(evt);
            }
        });

        BuscarLectura.setBackground(new java.awt.Color(18, 90, 173));
        BuscarLectura.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        BuscarLectura.setForeground(new java.awt.Color(255, 255, 255));
        BuscarLectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Buscar.png"))); // NOI18N
        BuscarLectura.setText("Buscar");
        BuscarLectura.setBorder(null);
        BuscarLectura.setEnabled(false);
        BuscarLectura.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        BuscarLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLecturaActionPerformed(evt);
            }
        });

        fijo.setText("Costo fijo");
        fijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijoActionPerformed(evt);
            }
        });

        Importe.setBackground(new java.awt.Color(255, 255, 255));
        Importe.setForeground(new java.awt.Color(0, 0, 0));
        Importe.setEnabled(false);
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ImporteKeyTyped(evt);
            }
        });

        Informacion_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/informacion_icon.png"))); // NOI18N
        Informacion_icon.setToolTipText("El costo fijo es una estrategia \n\nde costo estatico"); // NOI18N
        Informacion_icon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Informacion_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Informacion_iconMouseEntered(evt);
            }
        });

        jLabel4.setText("Mes:");

        jLabel2.setText("Consumo:");

        jLabel1.setText("Lectura final:");

        Final.setEditable(false);
        Final.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FinalFocusLost(evt);
            }
        });
        Final.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FinalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FinalKeyTyped(evt);
            }
        });

        Consumo.setEditable(false);
        Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumoActionPerformed(evt);
            }
        });

        id_mes.setEditable(false);
        id_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mesActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Guardar_Lectura.setBackground(new java.awt.Color(18, 90, 173));
        Guardar_Lectura.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Guardar_Lectura.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Lectura.setText("Guardar");
        Guardar_Lectura.setBorder(null);
        Guardar_Lectura.setEnabled(false);
        Guardar_Lectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_LecturaActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar_Lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 91, 38));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N
        jPanel1.add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 12, 60, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Dato, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Inicial))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BuscarLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Informacion_icon))
                            .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(Final, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addComponent(Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, 0)
                                        .addComponent(id_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BuscarLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(0, 0, 0)
                                .addComponent(Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Informacion_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fijo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained
        if (Dato.getText().equals(" Ingresa el folio del contrato")) {
            Dato.setText("");
        }
    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost
        if (Dato.getText().isEmpty()) {
            Dato.setText(" Ingresa el folio del contrato");
        }
    }//GEN-LAST:event_DatoFocusLost

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void DatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyReleased
        BuscarLectura.setEnabled(!Dato.getText().isEmpty());
    }//GEN-LAST:event_DatoKeyReleased

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void InicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InicialFocusGained

    }//GEN-LAST:event_InicialFocusGained

    private void InicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InicialKeyReleased

    }//GEN-LAST:event_InicialKeyReleased

    private void BuscarLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLecturaActionPerformed
        BuscarLectura(Integer.parseInt(Dato.getText()));
        folio = Integer.parseInt(Dato.getText());
    }//GEN-LAST:event_BuscarLecturaActionPerformed

    private void fijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fijoActionPerformed
        Importe.setEnabled(fijo.isSelected());

        if (fijo.isSelected()) {
            Informacion.setText("");
            Inicial.setText("");
            Final.setText("");
            Consumo.setText("");
            Guardar_Lectura.setEnabled(false);
            Final.setEditable(false);
        }
    }//GEN-LAST:event_fijoActionPerformed

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        Guardar_Lectura.setEnabled(!Importe.getText().isEmpty());
    }//GEN-LAST:event_ImporteKeyReleased

    private void ImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_ImporteKeyTyped

    private void Informacion_iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Informacion_iconMouseEntered

    }//GEN-LAST:event_Informacion_iconMouseEntered

    private void FinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FinalFocusGained

    }//GEN-LAST:event_FinalFocusGained

    private void FinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FinalFocusLost

    }//GEN-LAST:event_FinalFocusLost

    private void FinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinalKeyReleased
        if (!Final.getText().isEmpty() && !Inicial.getText().isEmpty()) {

            double fin = Double.parseDouble(Final.getText());
            double ini = Double.parseDouble(Inicial.getText());

            if (ini < fin) {
                double resultado = fin - ini;
                Consumo.setForeground(Color.black);
                Consumo.setText(String.valueOf(resultado));
                Guardar_Lectura.setEnabled(true);
            } else {
                Consumo.setForeground(Color.red);
                double resultado = fin - ini;
                Consumo.setText(String.valueOf(resultado));
                Guardar_Lectura.setEnabled(false);
            }
        } else {
            Consumo.setText("");
        }
    }//GEN-LAST:event_FinalKeyReleased

    private void FinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FinalKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
        if (Final.getText().isEmpty()) {
            Guardar_Lectura.setEnabled(false);
        }
    }//GEN-LAST:event_FinalKeyTyped

    private void ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoActionPerformed

    private void id_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_mesActionPerformed

    private void Guardar_LecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_LecturaActionPerformed
        Cargando.setVisible(true);
        if (!fijo.isSelected()) {
            new Thread() {
                @Override
                public void run() {
                    InsertarLecturaPago();
                }
            }.start();
        } else {
            InsertarLecturaPagoFijo(Double.valueOf(Importe.getText()), folio, Integer.parseInt(id_mes.getText()));
        }
    }//GEN-LAST:event_Guardar_LecturaActionPerformed

    private void DatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyPressed

    }//GEN-LAST:event_DatoKeyPressed

    private void fecha() {
        id_mes.setText(String.valueOf(LocalDate.now().getMonthValue()));
    }

    private void BuscarLectura(int folio) {
        boolean status = false;
        for (LecturaPago lecturas : DE.getLecturas_Guardadas()) {
            if (lecturas.getFolio_contrato() == folio) {
                int mes = Integer.parseInt(lecturas.getMes());
                int tiempo = Integer.parseInt(lecturas.getTiempo_transcurrido());
                if (mes <= tiempo) {
                    Informacion.setText("Lectura inicial: " + lecturas.getLecturaIni() + "\n" + "Lectura final: " + lecturas.getLecturaFin());
                    Inicial.setText(lecturas.getLecturaIni().toString());
                    Final.setEditable(true);
                } else if (mes > tiempo) {
                    JOptionPane.showMessageDialog(this, "El contrato no requiere una nueva lectura", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    Informacion.setText("");
                    Inicial.setText("");
                    Final.setText("");
                    Consumo.setText("");
                    Guardar_Lectura.setEnabled(false);
                    Final.setEditable(false);
                }
                status = true;
            }
        }
        if (!status) {
            if (Existencia(folio)) {
                int dialogButton = JOptionPane.showConfirmDialog(this, "El contrato no cuenta con una lectura\n ¿Desea añadir una nueva lectura?", "", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.YES_OPTION == dialogButton) {
                    Final.setEditable(true);
                    Inicial.setText("0");
                    NuevaLectura = true;
                } else {
                    Informacion.setText("");
                    Inicial.setText("");
                    Final.setText("");
                    Consumo.setText("");
                    Guardar_Lectura.setEnabled(false);
                    Final.setEditable(false);
                    NuevaLectura = false;
                }
            }
        }
    }

    private boolean Existencia(int folio) {
        boolean existe;
        Contrato lista = CTC.ReadOne(folio);

        if (lista.getFolioContrato() == null) {
            JOptionPane.showMessageDialog(this, "Contrato no registrado en el sistema", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            existe = false;
        } else {
            existe = true;
        }
        return existe;
    }

    private void DataController() {
        CargarDatos cd = new CargarDatos();
        cd.CargarLecturas(true);
        DataTable();
    }

    private void DataTable() {
        if (!DE.getLecturas_Guardadas().isEmpty()) {
            modeloLectura.setRowCount(0);
            for (LecturaPago lectura : DE.getLecturas_Guardadas()) {
                Object[] fila = {
                    lectura.getFolio_contrato(), lectura.getNombre_cliente(),
                    lectura.getIdLectPago(), lectura.getConsumo(), lectura.getFechaHora(),
                    lectura.getTipo_periodo(), lectura.getTiempo_transcurrido(),
                    lectura.getStatus()};
                modeloLectura.addRow(fila);
            }
            LecturaTable.setModel(modeloLectura);
            statusLectura();
        }
    }

    private void statusLectura() {
        for (LecturaPago lecturaPago : DE.getLecturas_Guardadas()) {
            int mes = Integer.parseInt(lecturaPago.getMes());
            int tiempo = Integer.parseInt(lecturaPago.getTiempo_transcurrido());
            if (mes <= tiempo) {
                BuscarEnLaTabla(lecturaPago.getFolio_contrato(), "Tiempo excedido");
            } else if (mes > tiempo) {
                BuscarEnLaTabla(lecturaPago.getFolio_contrato(), "Okey");
            }
        }
    }

    private void BuscarEnLaTabla(int folio, String status) {
        int filas = LecturaTable.getRowCount();
        for (int i = 0; i < filas; i++) {
            if (Integer.parseInt(LecturaTable.getValueAt(i, 0).toString()) == folio) {
                LecturaTable.setValueAt(status, i, 8);
            }
        }
        Render(LecturaTable, this);
    }

    private void InsertarLecturaPago() {
        LecturaPago LPI = new LecturaPago();
        LPI.setLecturaIni(Double.valueOf(Inicial.getText()));
        LPI.setLecturaFin(Double.valueOf(Final.getText()));
        LPI.setConsumo(Double.parseDouble(Consumo.getText()));
        LPI.setFolio_contrato(folio);
        LPI.setId_m(Integer.parseInt(id_mes.getText()));
        LC.setLectura(LPI);
        eas.setResultinsert(LC.Create());
        if (eas.getResultinsert() == -1) {
            JOptionPane.showMessageDialog(this, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
            Cargando.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            Cargando.setVisible(false);
            Limpiar_campos();
            DataController();
        }
    }

    private void InsertarLecturaPagoFijo(Double lecturapago, int folio, int mes) {

        eas.setResultinsert(LC.CreatePagoFijo(lecturapago, folio, mes, true));

        if (eas.getResultinsert() == -1) {
            JOptionPane.showMessageDialog(null, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
            Cargando.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            Cargando.setVisible(false);
            Limpiar_campos();
            DataController();
        }
    }

    private void Limpiar_campos() {
        Informacion.setText("");
        Inicial.setText("");
        Final.setText("");
        Consumo.setText("");
        Importe.setText("");
        Importe.setEnabled(false);
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

    private void CargarLecturas() {
        CargarDatos CDS = new CargarDatos();
        CDS.CargarLecturas(true);
        DataTable();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarLectura;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Consumo;
    private javax.swing.JTextField Dato;
    private javax.swing.JTextField Final;
    private javax.swing.JButton Guardar_Lectura;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JLabel Informacion_icon;
    private javax.swing.JTextField Inicial;
    private javax.swing.JTable LecturaTable;
    private javax.swing.JCheckBox fijo;
    private javax.swing.JTextField id_mes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
