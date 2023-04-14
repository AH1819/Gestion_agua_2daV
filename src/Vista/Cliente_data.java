package Vista;

import Dao.ClienteDaoR;
import Entity.Cliente;
import Entity.Contrato_generado;
import Entity.ErrorsAndSuccessesBD;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class Cliente_data extends javax.swing.JPanel {

    Date fechaConAniosRestados;
    String opcion;
    String[] Mensaje;
    Component Ubicacion;
    String Curpo;
    String rfco;
    String emailo;
    String telefono_opcional = "Sin numero";
    String opcion_cliente;
    int folio_cte;
    ErrorsAndSuccessesBD eas = new ErrorsAndSuccessesBD();

    public Cliente_data(String opcion, Component ubicacion, int folio) {
        initComponents();
        MaxFecha();
        this.opcion_cliente = opcion;
        Insertando.setVisible(false);
        this.opcion = opcion;
        Ubicacion = ubicacion;
        switch (opcion) {
            case "Nuevo":
                Mensaje = new String[2];
                Mensaje[0] = "Desea descartar la creacion del usuario?";
                Mensaje[1] = "Insercion";
                break;
            case "Modificar":
                Mensaje = new String[2];
                Mensaje[0] = "Desea descartar la creacion del usuario?";
                Mensaje[1] = "Insercion";
                this.folio_cte = folio;
                Next_or_save.setText("Guardar");
                HiloCliente.start();
                break;
        }
    }

    public void MaxFecha() {
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(fechaActual);
        calendar.add(Calendar.YEAR, -18);
        fechaConAniosRestados = calendar.getTime();
        Fecha_nacimiento.setMaxSelectableDate(fechaConAniosRestados);
        Fecha_nacimiento.setDate(fechaConAniosRestados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cliente_Datos = new javax.swing.JLabel();
        Cliente_Domicilio = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        ap_p = new javax.swing.JTextField();
        ap_m = new javax.swing.JTextField();
        apm = new javax.swing.JLabel();
        app = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Fecha_nacimiento = new com.toedter.calendar.JDateChooser();
        fecha = new javax.swing.JLabel();
        curp = new javax.swing.JLabel();
        Curp = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        rfc = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        municipio = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        residencia = new javax.swing.JLabel();
        Nombre_calle = new javax.swing.JTextField();
        nombre_calle = new javax.swing.JLabel();
        Referencia = new javax.swing.JTextField();
        referencia = new javax.swing.JLabel();
        Manzana = new javax.swing.JTextField();
        manzana = new javax.swing.JLabel();
        Lote = new javax.swing.JTextField();
        lote = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Next_or_save = new javax.swing.JButton();
        Insertando = new javax.swing.JLabel();

        Cliente_Datos.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Datos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Datos.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Datos.setText("Cliente-Datos personales");

        Cliente_Domicilio.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Domicilio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Domicilio.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Domicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Domicilio.setText("Cliente-Domicilio");

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText(" Nombre");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        ap_p.setBackground(new java.awt.Color(255, 255, 255));
        ap_p.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_p.setForeground(new java.awt.Color(0, 0, 0));
        ap_p.setText(" Apellido paterno");
        ap_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ap_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ap_pFocusLost(evt);
            }
        });
        ap_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_pMousePressed(evt);
            }
        });
        ap_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_pActionPerformed(evt);
            }
        });
        ap_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_pKeyTyped(evt);
            }
        });

        ap_m.setBackground(new java.awt.Color(255, 255, 255));
        ap_m.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_m.setForeground(new java.awt.Color(0, 0, 0));
        ap_m.setText(" Apellido materno");
        ap_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ap_mFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ap_mFocusLost(evt);
            }
        });
        ap_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_mMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ap_mMouseReleased(evt);
            }
        });
        ap_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_mKeyTyped(evt);
            }
        });

        apm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apm.setForeground(new java.awt.Color(0, 0, 0));
        apm.setText("* Apellido materno: ");

        app.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        app.setForeground(new java.awt.Color(0, 0, 0));
        app.setText("* Apellido paterno: ");

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("* Nombre:");

        fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("* Fecha de nacimiento:");

        curp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        curp.setForeground(new java.awt.Color(0, 0, 0));
        curp.setText("* Curp: ");

        Curp.setBackground(new java.awt.Color(255, 255, 255));
        Curp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Curp.setForeground(new java.awt.Color(0, 0, 0));
        Curp.setText(" Curp");
        Curp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CurpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CurpFocusLost(evt);
            }
        });
        Curp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CurpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CurpMousePressed(evt);
            }
        });
        Curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurpActionPerformed(evt);
            }
        });
        Curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CurpKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CurpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CurpKeyTyped(evt);
            }
        });

        RFC.setBackground(new java.awt.Color(255, 255, 255));
        RFC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RFC.setForeground(new java.awt.Color(0, 0, 0));
        RFC.setText(" RFC");
        RFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RFCFocusLost(evt);
            }
        });
        RFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RFCMousePressed(evt);
            }
        });
        RFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RFCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RFCKeyTyped(evt);
            }
        });

        rfc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rfc.setForeground(new java.awt.Color(0, 0, 0));
        rfc.setText("RFC: ");

        tel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 0, 0));
        tel.setText(" Telefono: ");

        Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setText(" Numero de telefono");
        Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoFocusLost(evt);
            }
        });
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelefonoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });

        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        Celular.setText(" Numero de celular");
        Celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CelularFocusLost(evt);
            }
        });
        Celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CelularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CelularMousePressed(evt);
            }
        });
        Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CelularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CelularKeyTyped(evt);
            }
        });

        celular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celular.setForeground(new java.awt.Color(0, 0, 0));
        celular.setText("* Celular: ");

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText(" Email");
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmailMousePressed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email: ");

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

        municipio.setBackground(new java.awt.Color(0, 0, 0));
        municipio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        municipio.setForeground(new java.awt.Color(0, 0, 0));
        municipio.setText("* Municipio:");

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
        Residencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidenciaActionPerformed(evt);
            }
        });
        Residencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResidenciaKeyTyped(evt);
            }
        });

        residencia.setBackground(new java.awt.Color(0, 0, 0));
        residencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        residencia.setForeground(new java.awt.Color(0, 0, 0));
        residencia.setText("* Residencia:");

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

        nombre_calle.setBackground(new java.awt.Color(0, 0, 0));
        nombre_calle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        nombre_calle.setText("* Nombre calle:");

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
        Referencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ReferenciaKeyTyped(evt);
            }
        });

        referencia.setBackground(new java.awt.Color(0, 0, 0));
        referencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        referencia.setForeground(new java.awt.Color(0, 0, 0));
        referencia.setText("* Calle de referencia:");

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

        manzana.setBackground(new java.awt.Color(0, 0, 0));
        manzana.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        manzana.setForeground(new java.awt.Color(0, 0, 0));
        manzana.setText("* Manzana: ");

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        Lote.setText(" Num. Lt");
        Lote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoteFocusLost(evt);
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

        lote.setBackground(new java.awt.Color(0, 0, 0));
        lote.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.setText("* Lote/Numero Exterior:");

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Volver");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Next_or_save.setBackground(new java.awt.Color(18, 90, 173));
        Next_or_save.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Next_or_save.setForeground(new java.awt.Color(255, 255, 255));
        Next_or_save.setText("Siguente");
        Next_or_save.setBorder(null);
        Next_or_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_or_saveActionPerformed(evt);
            }
        });

        Insertando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insertando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cliente_Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cliente_Domicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre)
                            .addComponent(rfc)
                            .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ap_p, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(app)
                            .addComponent(tel)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ap_m, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apm)
                            .addComponent(celular)
                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Curp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(curp))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Manzana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manzana)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lote, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320)
                .addComponent(Next_or_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Insertando, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cliente_Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(curp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name)
                            .addComponent(ap_p)
                            .addComponent(Curp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ap_m, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(celular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Cliente_Domicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nombre_calle)
                        .addGap(0, 0, 0)
                        .addComponent(Nombre_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manzana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lote, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Manzana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lote, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Insertando)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(Next_or_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if (name.getText().equals(" Nombre")) {
            name.setText("");
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (name.getText().isEmpty()) {
            name.setText(" Nombre");
        }
    }//GEN-LAST:event_nameFocusLost

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed

    }//GEN-LAST:event_nameMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

    }//GEN-LAST:event_nameKeyTyped

    private void ap_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_pFocusGained
        if (ap_p.getText().equals(" Apellido paterno")) {
            ap_p.setText("");
        }
    }//GEN-LAST:event_ap_pFocusGained

    private void ap_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_pFocusLost
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Apellido paterno");
        }
    }//GEN-LAST:event_ap_pFocusLost

    private void ap_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_pMousePressed

    }//GEN-LAST:event_ap_pMousePressed

    private void ap_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_pActionPerformed

    }//GEN-LAST:event_ap_pActionPerformed

    private void ap_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_pKeyTyped

    }//GEN-LAST:event_ap_pKeyTyped

    private void ap_mFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_mFocusGained
        if (ap_m.getText().equals(" Apellido materno")) {
            ap_m.setText("");
        }
    }//GEN-LAST:event_ap_mFocusGained

    private void ap_mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_mFocusLost
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Apellido materno");
        }
    }//GEN-LAST:event_ap_mFocusLost

    private void ap_mMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMousePressed

    }//GEN-LAST:event_ap_mMousePressed

    private void ap_mMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMouseReleased

    }//GEN-LAST:event_ap_mMouseReleased

    private void ap_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_mKeyTyped

    }//GEN-LAST:event_ap_mKeyTyped

    private void CurpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CurpFocusGained
        if (Curp.getText().equals(" Curp")) {
            Curp.setText("");
        }
    }//GEN-LAST:event_CurpFocusGained

    private void CurpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CurpFocusLost
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Curp");
        }
    }//GEN-LAST:event_CurpFocusLost

    private void CurpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMouseExited

    }//GEN-LAST:event_CurpMouseExited

    private void CurpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMousePressed

    }//GEN-LAST:event_CurpMousePressed

    private void CurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurpKeyTyped
        if (Curp.getText().trim().length() == 18) {
            evt.consume();
        }
    }//GEN-LAST:event_CurpKeyTyped

    private void RFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RFCFocusGained
        if (RFC.getText().equals(" RFC")) {
            RFC.setText("");
        }
    }//GEN-LAST:event_RFCFocusGained

    private void RFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RFCFocusLost
        if (RFC.getText().isEmpty()) {
            RFC.setText(" RFC");
        }
    }//GEN-LAST:event_RFCFocusLost

    private void RFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RFCMousePressed

    }//GEN-LAST:event_RFCMousePressed

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
        if (RFC.getText().trim().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_RFCKeyTyped

    private void TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusGained
        if (Telefono.getText().equals(" Numero de telefono")) {
            Telefono.setText("");
        }
    }//GEN-LAST:event_TelefonoFocusGained

    private void TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusLost
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Numero de telefono");
        }
    }//GEN-LAST:event_TelefonoFocusLost

    private void TelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseExited

    }//GEN-LAST:event_TelefonoMouseExited

    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed

    }//GEN-LAST:event_TelefonoMousePressed

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void CelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CelularFocusGained
        if (Celular.getText().equals(" Numero de celular")) {
            Celular.setText("");
        }
    }//GEN-LAST:event_CelularFocusGained

    private void CelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CelularFocusLost
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Numero de celular");
        }
    }//GEN-LAST:event_CelularFocusLost

    private void CelularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularMouseExited

    private void CelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMousePressed

    }//GEN-LAST:event_CelularMousePressed

    private void CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Celular.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CelularKeyTyped

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        if (Email.getText().equals(" Email")) {
            Email.setText("");
        }
    }//GEN-LAST:event_EmailFocusGained

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        if (Email.getText().isEmpty()) {
            Email.setText(" Email");
        }
    }//GEN-LAST:event_EmailFocusLost

    private void EmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseExited

    }//GEN-LAST:event_EmailMouseExited

    private void EmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMousePressed

    }//GEN-LAST:event_EmailMousePressed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped

    }//GEN-LAST:event_EmailKeyTyped

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

    private void ResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResidenciaActionPerformed

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

    private void ReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReferenciaKeyTyped

    }//GEN-LAST:event_ReferenciaKeyTyped

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

    private void LoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusGained
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
    }//GEN-LAST:event_LoteFocusGained

    private void LoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusLost
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_LoteFocusLost

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed

    }//GEN-LAST:event_LoteMousePressed

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        String[] arreglo = {"Si", "No"};

        int opcionp = JOptionPane.showOptionDialog(null, Mensaje[0], Mensaje[1], 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
        if (arreglo[opcionp].equals("Si")) {
            //new Regresar().show();
            Paneles(Ubicacion);
        } else {

        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void Next_or_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_or_saveActionPerformed
        Insertando.setVisible(true);
        if (name.getText().isEmpty() || name.getText().equals(" Nombre")) {
            name.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            name.requestFocus();
        } else {
            name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
            if (ap_p.getText().isEmpty() || ap_p.getText().equals(" Apellido paterno")) {
                ap_p.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                ap_p.requestFocus();
            } else {
                ap_p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                if (ap_m.getText().isEmpty() || ap_m.getText().equals(" Apellido materno")) {
                    ap_m.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    ap_m.requestFocus();
                } else {
                    ap_m.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                    if (Fecha_nacimiento.getDate() == null || Fecha_nacimiento.getDate().compareTo(fechaConAniosRestados) == 0) {
                        Fecha_nacimiento.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                        Fecha_nacimiento.requestFocus();
                    } else {
                        Fecha_nacimiento.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        if (curp_status) {
                            if (celular_status) {
                                if (Municipio.getText().isEmpty() || Municipio.getText().equals(" Municipio")) {
                                    Municipio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                    Municipio.requestFocus();
                                } else {
                                    Municipio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                    if (Residencia.getText().isEmpty() || Residencia.getText().equals(" Col/barrio/fracc")) {
                                        Residencia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                        Residencia.requestFocus();
                                    } else {
                                        Residencia.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                        if (Nombre_calle.getText().isEmpty() || Nombre_calle.getText().equals(" Calle")) {
                                            Nombre_calle.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                            Nombre_calle.requestFocus();
                                        } else {
                                            Nombre_calle.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                            if (Referencia.getText().isEmpty() || Referencia.getText().equals(" Calle de referencia")) {
                                                Referencia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                                Referencia.requestFocus();
                                            } else {
                                                Referencia.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                                if (Manzana.getText().isEmpty() || Manzana.getText().equals(" Num. Manz")) {
                                                    Manzana.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                                    Manzana.requestFocus();
                                                } else {
                                                    Manzana.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                                    if (Lote.getText().isEmpty() || Lote.getText().equals(" Num. Lt")) {
                                                        Lote.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                                        Lote.requestFocus();
                                                    } else {
                                                        Lote.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                                                        //hilo
                                                        HiloInsertOrUpdate.start();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Celular.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                                Celular.requestFocus();
                            }
                        } else {
                            Curp.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                            Curp.requestFocus();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_Next_or_saveActionPerformed

    private void CurpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurpKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurpKeyPressed
    boolean curp_status = false;
    private void CurpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurpKeyReleased
        if (Curp.getText().trim().length() == 18) {
            curp_status = validarCURP(Curp.getText().trim());
            if (curp_status) {
                Curp.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            } else {
                Curp.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
        } else {
            Curp.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }//GEN-LAST:event_CurpKeyReleased
    boolean rfc_status = false;
    private void RFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyReleased
        if (RFC.getText().trim().length() == 13) {
            rfc_status = validarRfc(RFC.getText().trim());
            if (rfc_status) {
                RFC.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            } else {
                RFC.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
        } else {
            RFC.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        if (RFC.getText().isEmpty() || RFC.getText().equals(" RFC")) {
            RFC.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        }
    }//GEN-LAST:event_RFCKeyReleased
    boolean email_status = false;
    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        email_status = validarEmail(Email.getText().trim());
        if (email_status) {
            Email.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
        } else {
            Email.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }//GEN-LAST:event_EmailKeyReleased
    boolean telefono_status = false;
    private void TelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyReleased
        if (Telefono.getText().trim().length() == 10) {
            telefono_status = true;
            telefono_opcional = Telefono.getText();
            Telefono.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        } else {
            Telefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }//GEN-LAST:event_TelefonoKeyReleased
    boolean celular_status = false;
    private void CelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyReleased
        if (Celular.getText().trim().length() == 10) {
            celular_status = true;
            Celular.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
        } else {
            Celular.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }//GEN-LAST:event_CelularKeyReleased

    private void CurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurpActionPerformed
    private void Paneles(Component h) {
        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    Thread HiloCliente = new Thread() {
        public void run() {
            GetCliente(folio_cte);
        }
    };

    Thread HiloInsertOrUpdate = new Thread() {
        public void run() {
            if (opcion_cliente.equals("Modificar")) {
                Actualizar();
            } else if (opcion_cliente.equals("Nuevo")) {
                InsertarCliente();
            }
        }
    };

    private void GetCliente(int folio) {
        ClienteDaoR CDR = new ClienteDaoR();
        List<Cliente> lista = CDR.SearchClientes(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            name.setText(lista.get(i).getNombre());
            ap_p.setText(lista.get(i).getApellido_p());
            ap_m.setText(lista.get(i).getApellido_m());
            Fecha_nacimiento.setDate(lista.get(i).getFecha_nac());
            Curp.setText(lista.get(i).getCurp());
            RFC.setText(lista.get(i).getRfc());
            Telefono.setText(lista.get(i).getTelefono());
            Celular.setText(lista.get(i).getCelular());
            Email.setText(lista.get(i).getEmail());
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombre_calle());
            Referencia.setText(lista.get(i).getCalle_referencia());
            Manzana.setText(String.valueOf(lista.get(i).getNumero_manzana()));
            Lote.setText(String.valueOf(lista.get(i).getNumero_lote()));
        }
        if (validarCURP(Curp.getText())) {
            curp_status = true;
        }
        if (validarRfc(RFC.getText())) {
            rfc_status = true;
        }
        if (validarEmail(Email.getText())) {
            email_status = true;
        }
        if (!Telefono.getText().isEmpty()) {
            telefono_status = true;
        }
        if (!Celular.getText().isEmpty()) {
            celular_status = true;
        }
    }

    private void InsertarCliente() {
        if (!RFC.getText().isEmpty() && !RFC.getText().equals(" RFC")) {
            if (!rfc_status) {
                RFC.requestFocus();
                return;
            }
        }
        if (!Telefono.getText().isEmpty() && !Telefono.getText().equals(" Numero de telefono")) {
            if (!telefono_status) {
                Telefono.requestFocus();
                return;
            }
        }
        if (!Email.getText().isEmpty() && !Email.getText().equals(" Email")) {
            if (!email_status) {
                Email.requestFocus();
                return;
            }
        }
        insertarCliente();
    }

    private boolean validarCURP(String curp) {
        String regex
                = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}"
                + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])"
                + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}"
                + "[0-9A-Z]{1}[0-9]{1}$";
        curp = curp.toUpperCase().trim();
        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(curp).matches()) {
            return false;
        } else {
            Curpo = curp;
            return true;
        }
    }

    public boolean validarRfc(String rfc) {
        rfc = rfc.toUpperCase().trim();
        rfco = rfc;
        return rfc.toUpperCase().matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}");
    }

    private boolean validarEmail(String email) {
        String regex
                = "([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.(com|mx))+";
        email = email.toLowerCase().trim();
        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(email).matches()) {
            if (Email.getText().equals("Sin email")) {
                return true;
            } else {
                return false;
            }
        } else {
            emailo = email;
            return true;
        }
    }

    private void insertarCliente() {
        ClienteDaoR cs = new ClienteDaoR();
        Date date = Fecha_nacimiento.getDate();
        long d = date.getTime();
        java.sql.Date fechap = new java.sql.Date(d);
        Cliente CL = new Cliente(name.getText(), ap_p.getText(), ap_m.getText(),
                fechap, telefono_opcional, Celular.getText(), emailo, Curpo, rfco, Municipio.getText(),
                Residencia.getText(), Nombre_calle.getText(), Referencia.getText(),
                Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()));

        eas.setResultinsert(cs.InsertarCliente(CL));

        if (eas.getResultinsert() == -1) {
            JOptionPane.showMessageDialog(this, "Algo salio mal al insertar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Contrato_generado cg = new Contrato_generado();
            cg.setNombre_cliente(name.getText() + " " + ap_p.getText() + "" + ap_m.getText());
            Cliente c = new Cliente(eas.getResultinsert(), Municipio.getText(),
                    Residencia.getText(), Nombre_calle.getText(), Referencia.getText(),
                    Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()));
            Contrato_data CD = new Contrato_data(c, "Nuevo Cliente Contrato", Ubicacion, 0);
            Insertando.setVisible(false);
            Paneles(CD);
        }
    }

    private void Actualizar() {
        Date date = Fecha_nacimiento.getDate();
        long d = date.getTime();
        java.sql.Date fechap = new java.sql.Date(d);
        ClienteDaoR CDR = new ClienteDaoR();
        Cliente cl = new Cliente(folio_cte, name.getText(), ap_p.getText(), ap_m.getText(), fechap,
                Telefono.getText(), Celular.getText(), Email.getText(), Curpo, rfco,
                Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(),
                Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()));
        eas.setResultinsert(CDR.ActualizarCliente(cl));
        if (eas.getResultact() == -1) {
            JOptionPane.showMessageDialog(this, "Algo salio mal al actualizar", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Se actualizo con exito", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Insertando.setVisible(false);
            Paneles(Ubicacion);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Celular;
    private javax.swing.JLabel Cliente_Datos;
    private javax.swing.JLabel Cliente_Domicilio;
    private javax.swing.JTextField Curp;
    private javax.swing.JTextField Email;
    private com.toedter.calendar.JDateChooser Fecha_nacimiento;
    private javax.swing.JLabel Insertando;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Municipio;
    private javax.swing.JButton Next_or_save;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField Referencia;
    private javax.swing.JTextField Residencia;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField ap_m;
    private javax.swing.JTextField ap_p;
    private javax.swing.JLabel apm;
    private javax.swing.JLabel app;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel curp;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel lote;
    private javax.swing.JLabel manzana;
    private javax.swing.JLabel municipio;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre_calle;
    private javax.swing.JLabel referencia;
    private javax.swing.JLabel residencia;
    private javax.swing.JLabel rfc;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
