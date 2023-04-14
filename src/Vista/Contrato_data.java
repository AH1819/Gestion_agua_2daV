package Vista;

import Dao.CatalogosDao;
import Dao.ContratoDao;
import Dao.TarifaDao;
import Entity.Cat_Consumo;
import Entity.Cat_periodo;
import Entity.Cliente;
import Entity.Contrato;
import Entity.Contrato_generado;
import Entity.DetTipoconsumoTarifa;
import Entity.Empresa;
import Entity.ErrorsAndSuccessesBD;
import Entity.Jasper;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class Contrato_data extends javax.swing.JPanel {

    Component Ubicacion;
    String opcion;
    String opcion_contrato;
    String observaciones = "sin observaciones";
    int folio_ct = 0;
    int idconsumo = 0;
    int idperiodo = 0;
    int id_tari = 0;
    boolean edit;
    String[] Mensaje;
    String[][] Consumos;
    String[][] Periodos;
    String[][] Tarifas;
    String id_consumo, id_periodo, id_tarifa;
    Empresa EMP = new Empresa();
    ErrorsAndSuccessesBD es = new ErrorsAndSuccessesBD();

    public Contrato_data(Cliente cliente, String opcion, Component ubicacion, int folio) {
        initComponents();
        Ubicacion = ubicacion;
        this.opcion_contrato = opcion;
        MiHilo.start();
        try {
            MiHilo.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        switch (opcion) {
            case "Nuevo Cliente Contrato":
                Mensaje = new String[2];
                Mensaje[0] = "Desea descartar la creacion del contrato?";
                Mensaje[1] = "Insercion";

                Existencia();
                if (opcion.equals("Si")) {
                    Referencia.setText(cliente.getCalle_referencia());
                    Municipio.setText(cliente.getMunicipio());
                    Residencia.setText(cliente.getResidencia());
                    Nombre_calle.setText(cliente.getNombre_calle());
                    Lote.setText(String.valueOf(cliente.getNumero_lote()));
                    Manzana.setText(String.valueOf(cliente.getNumero_manzana()));
                }
                break;
            case "Nuevo Contrato":
                Mensaje = new String[2];
                Mensaje[0] = "Desea descartar la creacion del contrato?";
                Mensaje[1] = "Insercion";
                this.folio_ct = folio;
                break;
            case "Modificar":
                edit = true;
                Mensaje = new String[2];
                Mensaje[0] = "¿Desea descartar la modificacion del contrato?";
                Mensaje[1] = "Actualizacion";
                Registrar.setText("Guardar");
                new Thread() {
                    public void run() {
                        GetContrato(folio);
                    }
                }.start();
                break;
        }
    }

    public Contrato_data() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contrato = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        Residencia = new javax.swing.JTextField();
        Nombre_calle = new javax.swing.JTextField();
        Referencia = new javax.swing.JTextField();
        Tarifa = new javax.swing.JComboBox<>();
        Consumo = new javax.swing.JComboBox<>();
        Lote = new javax.swing.JTextField();
        Manzana = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Periodo = new javax.swing.JComboBox<>();
        Tipo_p = new javax.swing.JLabel();
        Tipo_c = new javax.swing.JLabel();
        tarifa = new javax.swing.JLabel();
        rerefencia = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        observacione = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();

        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contrato.setText("Contrato");

        Municipio.setBackground(new java.awt.Color(255, 255, 255));
        Municipio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Municipio.setForeground(new java.awt.Color(0, 0, 0));
        Municipio.setText(" Municipio");
        Municipio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MunicipioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MunicipioFocusLost(evt);
            }
        });
        Municipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MunicipioMousePressed(evt);
            }
        });
        Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MunicipioKeyTyped(evt);
            }
        });

        Residencia.setBackground(new java.awt.Color(255, 255, 255));
        Residencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Residencia.setForeground(new java.awt.Color(0, 0, 0));
        Residencia.setText(" Col/barrio/fracc");
        Residencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ResidenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ResidenciaFocusLost(evt);
            }
        });
        Residencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResidenciaMousePressed(evt);
            }
        });
        Residencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResidenciaKeyTyped(evt);
            }
        });

        Nombre_calle.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_calle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_calle.setText(" Calle");
        Nombre_calle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nombre_calleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nombre_calleFocusLost(evt);
            }
        });
        Nombre_calle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre_calleMousePressed(evt);
            }
        });
        Nombre_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_calleKeyTyped(evt);
            }
        });

        Referencia.setBackground(new java.awt.Color(255, 255, 255));
        Referencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Referencia.setForeground(new java.awt.Color(0, 0, 0));
        Referencia.setText(" Calle de referencia");
        Referencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ReferenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReferenciaFocusLost(evt);
            }
        });
        Referencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReferenciaMousePressed(evt);
            }
        });
        Referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReferenciaActionPerformed(evt);
            }
        });

        Tarifa.setBackground(new java.awt.Color(255, 255, 255));
        Tarifa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarifa.setForeground(new java.awt.Color(0, 0, 0));
        Tarifa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Tarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarifaActionPerformed(evt);
            }
        });

        Consumo.setBackground(new java.awt.Color(255, 255, 255));
        Consumo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Consumo.setForeground(new java.awt.Color(0, 0, 0));
        Consumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Consumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consumo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ConsumoItemStateChanged(evt);
            }
        });
        Consumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsumoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsumoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConsumoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConsumoMouseReleased(evt);
            }
        });
        Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumoActionPerformed(evt);
            }
        });
        Consumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConsumoKeyTyped(evt);
            }
        });

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        Lote.setText(" Num. Lt");
        Lote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoteFocusGained(evt);
            }
        });
        Lote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoteMousePressed(evt);
            }
        });
        Lote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoteKeyTyped(evt);
            }
        });

        Manzana.setBackground(new java.awt.Color(255, 255, 255));
        Manzana.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Manzana.setForeground(new java.awt.Color(0, 0, 0));
        Manzana.setText(" Num. Manz");
        Manzana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ManzanaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ManzanaFocusLost(evt);
            }
        });
        Manzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManzanaMousePressed(evt);
            }
        });
        Manzana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ManzanaKeyTyped(evt);
            }
        });

        Observaciones.setBackground(new java.awt.Color(255, 255, 255));
        Observaciones.setColumns(20);
        Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Observaciones.setForeground(new java.awt.Color(0, 0, 0));
        Observaciones.setLineWrap(true);
        Observaciones.setRows(5);
        Observaciones.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Observaciones);

        Periodo.setBackground(new java.awt.Color(255, 255, 255));
        Periodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Periodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Periodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PeriodoMousePressed(evt);
            }
        });
        Periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeriodoActionPerformed(evt);
            }
        });

        Tipo_p.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_p.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_p.setText("Periodo a pagar:");

        Tipo_c.setBackground(new java.awt.Color(0, 0, 0));
        Tipo_c.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_c.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_c.setText("Tipo de consumo:");

        tarifa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tarifa.setForeground(new java.awt.Color(0, 0, 0));
        tarifa.setText("Tarifa:");

        rerefencia.setBackground(new java.awt.Color(0, 0, 0));
        rerefencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rerefencia.setForeground(new java.awt.Color(0, 0, 0));
        rerefencia.setText("Calle de referencia:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre de la calle:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Residencia:");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Num. lote:");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Num. Manzana:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Municipio:");

        observacione.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        observacione.setForeground(new java.awt.Color(0, 0, 0));
        observacione.setText("Observaciones: (opcional)");

        Regresar.setBackground(new java.awt.Color(18, 90, 173));
        Regresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Volver");
        Regresar.setBorder(null);
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Registrar.setBackground(new java.awt.Color(18, 90, 173));
        Registrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setBorder(null);
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Contrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 750, Short.MAX_VALUE)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Manzana, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Municipio, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Residencia, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lote, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo_c, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Referencia, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(rerefencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tarifa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(observacione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Periodo, 0, 200, Short.MAX_VALUE)
                            .addComponent(Tipo_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rerefencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo_c, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Manzana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacione, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MunicipioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusGained
        if (Municipio.getText().equals(" Municipio")) {
            Municipio.setText("");
        }
    }//GEN-LAST:event_MunicipioFocusGained

    private void MunicipioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusLost
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
    }//GEN-LAST:event_MunicipioFocusLost

    private void MunicipioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MunicipioMousePressed

    }//GEN-LAST:event_MunicipioMousePressed

    private void MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyTyped

    }//GEN-LAST:event_MunicipioKeyTyped

    private void ResidenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusGained
        if (Residencia.getText().equals(" Col/barrio/fracc")) {
            Residencia.setText("");
        }
    }//GEN-LAST:event_ResidenciaFocusGained

    private void ResidenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusLost
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
    }//GEN-LAST:event_ResidenciaFocusLost

    private void ResidenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResidenciaMousePressed

    }//GEN-LAST:event_ResidenciaMousePressed

    private void ResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResidenciaKeyTyped

    }//GEN-LAST:event_ResidenciaKeyTyped

    private void Nombre_calleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusGained
        if (Nombre_calle.getText().equals(" Calle")) {
            Nombre_calle.setText("");
        }
    }//GEN-LAST:event_Nombre_calleFocusGained

    private void Nombre_calleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusLost
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Calle");
        }
    }//GEN-LAST:event_Nombre_calleFocusLost

    private void Nombre_calleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_calleMousePressed

    }//GEN-LAST:event_Nombre_calleMousePressed

    private void Nombre_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_calleKeyTyped

    }//GEN-LAST:event_Nombre_calleKeyTyped

    private void ReferenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusGained
        if (Referencia.getText().equals(" Calle de referencia")) {
            Referencia.setText("");
        }
    }//GEN-LAST:event_ReferenciaFocusGained

    private void ReferenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusLost
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_ReferenciaFocusLost

    private void ReferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReferenciaMousePressed

    }//GEN-LAST:event_ReferenciaMousePressed

    private void ReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReferenciaActionPerformed

    private void ConsumoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ConsumoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED && Consumo.getSelectedIndex() > 0) {
            for (String[] Cons : Consumos) {
                if (Cons[1].equals(Consumo.getSelectedItem())) {
                    idconsumo = Integer.parseInt(Cons[0]);
                    HiloTarifa.start();
                }
            }
        }
    }//GEN-LAST:event_ConsumoItemStateChanged

    private void ConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoMouseClicked

    private void ConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoMouseEntered

    private void ConsumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMousePressed

    }//GEN-LAST:event_ConsumoMousePressed

    private void ConsumoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoMouseReleased

    private void ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoActionPerformed

    private void ConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConsumoKeyTyped

    }//GEN-LAST:event_ConsumoKeyTyped

    private void LoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusGained
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
    }//GEN-LAST:event_LoteFocusGained

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed

    }//GEN-LAST:event_LoteMousePressed

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void ManzanaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusGained
        if (Manzana.getText().equals(" Num. Manz")) {
            Manzana.setText("");
        }
    }//GEN-LAST:event_ManzanaFocusGained

    private void ManzanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusLost
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
    }//GEN-LAST:event_ManzanaFocusLost

    private void ManzanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManzanaMousePressed

    }//GEN-LAST:event_ManzanaMousePressed

    private void ManzanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManzanaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ManzanaKeyTyped

    private void PeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriodoMousePressed

    }//GEN-LAST:event_PeriodoMousePressed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        String[] arreglo = {"Si", "No"};

        int opcionp = JOptionPane.showOptionDialog(null, Mensaje[0], Mensaje[1], 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
        if (arreglo[opcionp].equals("Si")) {
            Paneles(Ubicacion);
        } else {
            //
        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (!Observaciones.getText().isEmpty()) {
            observaciones = Observaciones.getText();
        }

        for (String[] Cons : Consumos) {
            if (Cons[1].equals(Consumo.getSelectedItem())) {
                idconsumo = Integer.parseInt(Cons[0]);
            }
        }

        for (String[] Per : Periodos) {
            if (Per[1].equals(Periodo.getSelectedItem())) {
                idperiodo = Integer.parseInt(Per[0]);
            }
        }

        if (Periodo.getSelectedIndex() > 0) {
            for (String[] Tari : Tarifas) {
                if (Tari[1].equals(Tarifa.getSelectedItem())) {
                    id_tari = Integer.parseInt(Tari[0]);
                }
            }
        }

        if (Municipio.getText().isEmpty()) {
            Municipio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Municipio.requestFocus();
        } else {
            Municipio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            if (Residencia.getText().isEmpty()) {
                Residencia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                Residencia.requestFocus();
            } else {
                Residencia.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                if (Nombre_calle.getText().isEmpty()) {
                    Nombre_calle.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    Nombre_calle.requestFocus();
                } else {
                    Nombre_calle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                    if (Referencia.getText().isEmpty()) {
                        Referencia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                        Referencia.requestFocus();
                    } else {
                        Referencia.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        if (Manzana.getText().isEmpty()) {
                            Manzana.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                            Manzana.requestFocus();
                        } else {
                            Manzana.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                            if (Lote.getText().isEmpty()) {
                                Lote.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                Lote.requestFocus();
                            } else {
                                Lote.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                if (Consumo.getSelectedIndex() == 0) {
                                    Consumo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                    Consumo.requestFocus();
                                } else {
                                    Consumo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                    if (Tarifa.getSelectedIndex() == 0) {
                                        Tarifa.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                        Tarifa.requestFocus();
                                    } else {
                                        Tarifa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                        if (Periodo.getSelectedIndex() == 0) {
                                            Periodo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                            Periodo.requestFocus();
                                        } else {
                                            Periodo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                            System.out.println(Municipio.getText() + "\n"
                                                    + Residencia.getText() + "\n"
                                                    + Nombre_calle.getText() + "\n"
                                                    + Referencia.getText() + "\n"
                                                    + Manzana.getText() + "\n"
                                                    + Lote.getText() + "\n"
                                                    + Consumo.getSelectedItem() + "\n"
                                                    + Tarifa.getSelectedItem() + "\n"
                                                    + observaciones + "\n"
                                                    + Periodo.getSelectedItem());
                                            if (opcion_contrato.equals("Nuevo Cliente Contrato") || opcion_contrato.equals("Nuevo Contrato")) {
                                                InsertarContrato(folio_ct);
                                            } else if (opcion_contrato.equals("Modificar")) {
                                                actualizar();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void TarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarifaActionPerformed

    private void PeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PeriodoActionPerformed
    private void Paneles(Component h) {
        h.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    private void GetContrato(int folio) {
        ContratoDao cts = new ContratoDao();
        List<Contrato> lista = cts.SearchContratos_c(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            folio_ct = lista.get(i).getFolioContrato();
            id_consumo = lista.get(i).getId_consumo().toString();
            id_periodo = lista.get(i).getId_periodo().toString();
            id_tarifa = lista.get(i).getConsec().toString();
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombreCalle());
            Referencia.setText(lista.get(i).getCalleReferencia());
            Manzana.setText(lista.get(i).getNumeroMzn().toString());
            Lote.setText(lista.get(i).getNumeroLt().toString());
            Observaciones.setText(lista.get(i).getObservaciones());
        }
        for (String[] Consumo1 : Consumos) {
            System.out.println("entrando al for c");
            if (Consumo1[0].equals(id_consumo)) {
                System.out.println("valido");
                Consumo.setSelectedItem(Consumo1[1]);
            }
        }
        for (String[] Periodo1 : Periodos) {
            System.out.println("entrando al for p");
            if (Periodo1[0].equals(id_periodo)) {
                System.out.println("valido");
                Periodo.setSelectedItem(Periodo1[1]);
            }
        }
        try {
            HiloTarifa.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for (String[] Tarifa1 : Tarifas) {
            if (Tarifa1[0].equals("1")) {
                System.out.println("valido");
                Tarifa.setSelectedItem(Tarifa1[1]);
            }
        }
    }

    private void Existencia() {
        String[] arreglo = {"Si", "No"};
        int opcionp = JOptionPane.showOptionDialog(null, "¿Desea incluir este domicilio en el contrato?", "Contrato", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
        if (arreglo[opcionp].equals("Si")) {
            opcion = "Si";
        } else {
            opcion = "No";
        }
    }

    private void GetConsumo() {

        CatalogosDao cs = new CatalogosDao();
        List<Cat_Consumo> lista = cs.GetConsumo();
        int tam = lista.size();
        if (tam > 0) {
            Consumos = new String[tam][2];
            for (int i = 0; i < tam; i++) {
                Consumos[i][0] = lista.get(i).getId_consumo().toString();
                Consumos[i][1] = lista.get(i).getTipo_consumo();
                Consumo.addItem(lista.get(i).getTipo_consumo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron Consumos disponibles\n Consulte el problema con el administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
            Registrar.setEnabled(false);
        }
    }

    private void GetPeriodo() {
        CatalogosDao cs = new CatalogosDao();
        List<Cat_periodo> lista = cs.GetPeriodo();
        int tam = lista.size();
        if (tam > 0) {
            Periodos = new String[tam][2];
            for (int i = 0; i < tam; i++) {
                Periodos[i][0] = lista.get(i).getId_periodo().toString();
                Periodos[i][1] = lista.get(i).getTipo_periodo();
                Periodo.addItem(lista.get(i).getTipo_periodo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron Periodos disponibles\n Consulte el problema con el administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
            Registrar.setEnabled(false);
        }
    }
    Thread MiHilo = new Thread() {
        @Override
        public void run() {
            GetConsumo();
            GetPeriodo();
        }
    };

    Thread HiloTarifa = new Thread() {
        @Override
        public void run() {
            GetTarifa(idconsumo);
        }
    };

    private void GetTarifa(int id) {
        TarifaDao ts = new TarifaDao();
        List<DetTipoconsumoTarifa> lista = ts.Tarifas(id);
        int tam = lista.size();
        Tarifa.removeAllItems();
        Tarifa.addItem("Selecciona una opción");
        if (tam > 0) {
            Tarifas = new String[tam][2];
            for (int i = 0; i < tam; i++) {
                Tarifas[i][0] = lista.get(i).getConsec().toString();
                Tarifas[i][1] = lista.get(i).getTarifa().toString();
                Tarifa.addItem(lista.get(i).getTarifa().toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron Tarifas disponibles\n Consulte el problema con el administrador", "Error", JOptionPane.INFORMATION_MESSAGE);
            Registrar.setEnabled(false);
        }

    }

    private void actualizar() {
        ContratoDao cs = new ContratoDao();
        System.out.println(folio_ct);
        Contrato CT = new Contrato(folio_ct, Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), observaciones,
                Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()));
        es.setResultact(cs.ActualizarContrato(CT));

        if (es.getResultact() == -1) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el contrato", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println(es.getResultact());
            JOptionPane.showMessageDialog(this, "Contrato actualizado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Paneles(Ubicacion);
        }
    }

    public void InsertarContrato(int folio) {

        ContratoDao cs = new ContratoDao();
        String status = "activo";

        Contrato CT = new Contrato(Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), observaciones, Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()), id_tari, idconsumo, idperiodo, folio, status);
        es.setResultinsert(cs.InsertarContrato(CT));
        if (es.getResultinsert() == -1) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Contrato creado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            Generar_contrato();
        }
    }

    private void Generar_contrato() {
        ContratoDao cs = new ContratoDao();
        List<Contrato> lista = cs.GenerarContrato(es.getResultinsert());
        int tam = lista.size();
        Contrato_generado cg = new Contrato_generado();
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                cg.setFolio_contrato(lista.get(i).getFolioContrato());
                cg.setCreacion_contrato(lista.get(i).getCreacion_contrato());
                cg.setInformativo(EMP.getTerminos_y_condiciones());
            }

            Jasper js = new Jasper();
            js.generar_contraro();
            Paneles(Ubicacion);
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error en la ejecucion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Consumo;
    private javax.swing.JLabel Contrato;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JComboBox<String> Periodo;
    private javax.swing.JTextField Referencia;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox<String> Tarifa;
    private javax.swing.JLabel Tipo_c;
    private javax.swing.JLabel Tipo_p;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel observacione;
    private javax.swing.JLabel rerefencia;
    private javax.swing.JLabel tarifa;
    // End of variables declaration//GEN-END:variables
}
