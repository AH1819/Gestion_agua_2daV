package Vista;

import Dao.EmpresaDao;
import Entity.Empresa;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import static java.awt.Frame.ICONIFIED;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hitler
 */
public class Interfaz extends javax.swing.JFrame {

    EmpresaDao ED = new EmpresaDao();
    Empresa EMP = new Empresa();
    PrincipalResponsive pl = new PrincipalResponsive();
    boolean opcion = false;
    private int posX = 0;

    public Interfaz() {
        initComponents();
        ED.EmpresaData();
        this.setSize(new Dimension(1200, 600));
        this.setLocationRelativeTo(this);
        fecha();
        LogoIcon();
        Promo.setText(EMP.getEslogan_mov());
        new Thread() {
            public void run() {
                eslogan();
            }
        }.start();
    }

    private void fecha() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        Fecha.setText(+dia + " de " + meses[month - 1] + " de " + year);
    }

    private void LogoIcon() {
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Recursos/logo_azul.jpeg"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(199, 99, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        Logo.setIcon(iconoEscalado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_principal = new javax.swing.JPanel();
        Lado_derecho = new javax.swing.JPanel();
        Panel_head = new javax.swing.JPanel();
        Panel_movimiento = new javax.swing.JPanel();
        Panel_opciones = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Visible_off = new javax.swing.JPanel();
        Visible = new javax.swing.JLabel();
        Min_Max = new javax.swing.JPanel();
        Max_Min = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ruta = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Promo = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Opcion_1 = new javax.swing.JPanel();
        Princ = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        Opcion_2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Opcion_3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Opcion_4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Opcion_5 = new javax.swing.JPanel();
        Admin_l = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Opcion_6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        About = new javax.swing.JLabel();
        Opcion_7 = new javax.swing.JPanel();
        Admin_l1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(250, 600));
        setUndecorated(true);

        Panel_principal.setBackground(new java.awt.Color(13, 71, 161));

        Lado_derecho.setBackground(new java.awt.Color(255, 255, 255));
        Lado_derecho.setPreferredSize(new java.awt.Dimension(994, 40));
        Lado_derecho.setLayout(new java.awt.BorderLayout());

        Panel_head.setBackground(new java.awt.Color(13, 71, 161));
        Panel_head.setPreferredSize(new java.awt.Dimension(994, 105));

        Panel_movimiento.setOpaque(false);
        Panel_movimiento.setPreferredSize(new java.awt.Dimension(150, 100));

        Panel_opciones.setPreferredSize(new java.awt.Dimension(150, 100));
        Panel_opciones.setLayout(new java.awt.BorderLayout());

        Exit.setBackground(new java.awt.Color(13, 71, 161));
        Exit.setPreferredSize(new java.awt.Dimension(50, 50));
        Exit.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/delete_32px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        Exit.add(jLabel6, java.awt.BorderLayout.CENTER);

        Panel_opciones.add(Exit, java.awt.BorderLayout.LINE_END);

        Visible_off.setBackground(new java.awt.Color(13, 71, 161));
        Visible_off.setPreferredSize(new java.awt.Dimension(50, 50));
        Visible_off.setLayout(new java.awt.BorderLayout());

        Visible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icons8-menos-30.png"))); // NOI18N
        Visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisibleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VisibleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VisibleMouseExited(evt);
            }
        });
        Visible_off.add(Visible, java.awt.BorderLayout.CENTER);

        Panel_opciones.add(Visible_off, java.awt.BorderLayout.LINE_START);

        Min_Max.setBackground(new java.awt.Color(13, 71, 161));
        Min_Max.setPreferredSize(new java.awt.Dimension(50, 50));
        Min_Max.setLayout(new java.awt.BorderLayout());

        Max_Min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Max_Min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/full_screen_32px.png"))); // NOI18N
        Max_Min.setPreferredSize(new java.awt.Dimension(50, 50));
        Max_Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Max_MinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Max_MinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Max_MinMousePressed(evt);
            }
        });
        Min_Max.add(Max_Min, java.awt.BorderLayout.CENTER);

        Panel_opciones.add(Min_Max, java.awt.BorderLayout.CENTER);

        jPanel1.setOpaque(false);

        Ruta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ruta.setForeground(new java.awt.Color(255, 255, 255));
        Ruta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ruta.setText("Administracion/Principal");

        Fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel_movimientoLayout = new javax.swing.GroupLayout(Panel_movimiento);
        Panel_movimiento.setLayout(Panel_movimientoLayout);
        Panel_movimientoLayout.setHorizontalGroup(
            Panel_movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_movimientoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_movimientoLayout.setVerticalGroup(
            Panel_movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_movimientoLayout.createSequentialGroup()
                .addGroup(Panel_movimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Promo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Promo.setForeground(new java.awt.Color(13, 71, 161));
        Promo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_headLayout = new javax.swing.GroupLayout(Panel_head);
        Panel_head.setLayout(Panel_headLayout);
        Panel_headLayout.setHorizontalGroup(
            Panel_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_movimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addComponent(Promo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_headLayout.setVerticalGroup(
            Panel_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_headLayout.createSequentialGroup()
                .addComponent(Panel_movimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Promo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Lado_derecho.add(Panel_head, java.awt.BorderLayout.PAGE_START);

        Contenedor.setLayout(new java.awt.CardLayout());
        Lado_derecho.add(Contenedor, java.awt.BorderLayout.CENTER);

        Menu.setBackground(new java.awt.Color(13, 71, 161));

        Opcion_1.setBackground(new java.awt.Color(21, 124, 195));
        Opcion_1.setMinimumSize(new java.awt.Dimension(109, 40));
        Opcion_1.setPreferredSize(new java.awt.Dimension(109, 40));
        Opcion_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_1MousePressed(evt);
            }
        });
        Opcion_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Princ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Princ.setForeground(new java.awt.Color(255, 255, 255));
        Princ.setText("Principal");
        Opcion_1.add(Princ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/home.png"))); // NOI18N
        Opcion_1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Opcion_2.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_2MousePressed(evt);
            }
        });
        Opcion_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Servicios");
        Opcion_2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/servicio.png"))); // NOI18N
        Opcion_2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Opcion_3.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_3MousePressed(evt);
            }
        });
        Opcion_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/libro_abierto.png"))); // NOI18N
        Opcion_3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contrato");
        Opcion_3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        Opcion_4.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_4MousePressed(evt);
            }
        });
        Opcion_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clientes.png"))); // NOI18N
        Opcion_4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");
        Opcion_4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 30));

        Opcion_5.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_5MousePressed(evt);
            }
        });
        Opcion_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_l.setBackground(new java.awt.Color(255, 255, 255));
        Admin_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_l.setForeground(new java.awt.Color(255, 255, 255));
        Admin_l.setText("Administrador");
        Opcion_5.add(Admin_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/administrador.png"))); // NOI18N
        Opcion_5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Opcion_6.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Opcion_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_6MousePressed(evt);
            }
        });
        Opcion_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/informacion.png"))); // NOI18N
        Opcion_6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        About.setBackground(new java.awt.Color(255, 255, 255));
        About.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        About.setForeground(new java.awt.Color(255, 255, 255));
        About.setText("Acerca");
        Opcion_6.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 60, 30));

        Opcion_7.setBackground(new java.awt.Color(18, 90, 173));
        Opcion_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Opcion_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Opcion_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Opcion_7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Opcion_7MousePressed(evt);
            }
        });
        Opcion_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_l1.setBackground(new java.awt.Color(255, 255, 255));
        Admin_l1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_l1.setForeground(new java.awt.Color(255, 255, 255));
        Admin_l1.setText("Cerrar session");
        Opcion_7.add(Admin_l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida.png"))); // NOI18N
        Opcion_7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Opcion_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Opcion_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Opcion_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Opcion_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Opcion_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Opcion_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(Opcion_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Opcion_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel_principalLayout = new javax.swing.GroupLayout(Panel_principal);
        Panel_principal.setLayout(Panel_principalLayout);
        Panel_principalLayout.setHorizontalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lado_derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_principalLayout.setVerticalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lado_derecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opcion_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_1MouseEntered
        ClickOpcion(Opcion_1, Opcion_2, Opcion_3, Opcion_4, Opcion_5, Opcion_6, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_1MouseEntered

    private void Opcion_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_1MouseExited

    }//GEN-LAST:event_Opcion_1MouseExited

    private void Opcion_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_1MousePressed
        ClickOpcion(Opcion_1, Opcion_2, Opcion_3, Opcion_4, Opcion_5, Opcion_6, Opcion_7, 1);
        opcion = true;
        Ruta.setText("Administracion/Principal");
        Paneles(pl);
    }//GEN-LAST:event_Opcion_1MousePressed

    private void Opcion_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_2MouseEntered
        ClickOpcion(Opcion_2, Opcion_1, Opcion_3, Opcion_4, Opcion_5, Opcion_6, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_2MouseEntered

    private void Opcion_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_2MouseExited

    }//GEN-LAST:event_Opcion_2MouseExited

    private void Opcion_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_2MousePressed
        Ruta.setText("Administracion/Servicio");
        new Thread() {
            public void run() {
                Servicio_Responsive SR = new Servicio_Responsive();
                Paneles(SR);
            }
        }.start();
    }//GEN-LAST:event_Opcion_2MousePressed

    private void Opcion_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_3MouseEntered
        ClickOpcion(Opcion_3, Opcion_1, Opcion_2, Opcion_4, Opcion_5, Opcion_6, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_3MouseEntered

    private void Opcion_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_3MouseExited

    }//GEN-LAST:event_Opcion_3MouseExited

    private void Opcion_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_3MousePressed
        Ruta.setText("Administracion/Contratos");
        new Thread() {
            public void run() {
                Contrato_Vista CV = new Contrato_Vista();
                Paneles(CV);
            }
        }.start();
    }//GEN-LAST:event_Opcion_3MousePressed

    private void Opcion_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_4MouseEntered
        ClickOpcion(Opcion_4, Opcion_1, Opcion_2, Opcion_3, Opcion_5, Opcion_6, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_4MouseEntered

    private void Opcion_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_4MouseExited

    }//GEN-LAST:event_Opcion_4MouseExited

    private void Opcion_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_4MousePressed
        Ruta.setText("Administracion/Clientes");
        new Thread() {
            public void run() {
                Cliente_Vista ClV = new Cliente_Vista();
                Paneles(ClV);
            }
        }.start();
    }//GEN-LAST:event_Opcion_4MousePressed

    private void Opcion_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_5MouseEntered
        ClickOpcion(Opcion_5, Opcion_1, Opcion_2, Opcion_3, Opcion_4, Opcion_6, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_5MouseEntered

    private void Opcion_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_5MouseExited

    }//GEN-LAST:event_Opcion_5MouseExited

    private void Opcion_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_5MousePressed
        Ruta.setText("Administracion/Administrador");
        new Thread() {
            public void run() {
                Administracion AD = new Administracion();
                Paneles(AD);
            }
        }.start();
    }//GEN-LAST:event_Opcion_5MousePressed

    private void Opcion_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_6MouseEntered
        ClickOpcion(Opcion_6, Opcion_1, Opcion_2, Opcion_3, Opcion_4, Opcion_5, Opcion_7, 1);
    }//GEN-LAST:event_Opcion_6MouseEntered

    private void Opcion_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_6MouseExited

    }//GEN-LAST:event_Opcion_6MouseExited

    private void Opcion_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_6MousePressed
        Ruta.setText("Administracion/Acerca");
    }//GEN-LAST:event_Opcion_6MousePressed

    private void Opcion_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_7MouseEntered
        ClickOpcion(Opcion_7, Opcion_1, Opcion_2, Opcion_3, Opcion_4, Opcion_5, Opcion_6, 1);
    }//GEN-LAST:event_Opcion_7MouseEntered

    private void Opcion_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_7MouseExited

    }//GEN-LAST:event_Opcion_7MouseExited

    private void Opcion_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Opcion_7MousePressed

    }//GEN-LAST:event_Opcion_7MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel6MousePressed

    private void Max_MinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Max_MinMousePressed
        if (this.getExtendedState() != Interfaz.MAXIMIZED_BOTH) {
            changeimage(Max_Min, "/Recursos/minimizar.png");
            this.setExtendedState(Interfaz.MAXIMIZED_BOTH);
        } else {
            changeimage(Max_Min, "/Recursos/full_screen_32px.png");
            this.setExtendedState(Interfaz.NORMAL);
        }
    }//GEN-LAST:event_Max_MinMousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        changecolor(Exit, Color.red);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        changecolor(Exit, new Color(13, 71, 161));
    }//GEN-LAST:event_jLabel6MouseExited

    private void Max_MinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Max_MinMouseEntered
        changecolor(Min_Max, new Color(21, 124, 195));
    }//GEN-LAST:event_Max_MinMouseEntered

    private void Max_MinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Max_MinMouseExited
        changecolor(Min_Max, new Color(13, 71, 161));
    }//GEN-LAST:event_Max_MinMouseExited

    private void VisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_VisibleMouseClicked

    private void VisibleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleMouseEntered
        changecolor(Visible_off, new Color(21, 124, 195));
    }//GEN-LAST:event_VisibleMouseEntered

    private void VisibleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleMouseExited
        changecolor(Visible_off, new Color(13, 71, 161));
    }//GEN-LAST:event_VisibleMouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    public void Paneles(Component h) {

        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    public void ClickOpcion(JPanel h1, JPanel h2, JPanel h3, JPanel h4, JPanel h5, JPanel h6,
            JPanel h7, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(21, 124, 195));

            h2.setBackground(new Color(18, 90, 173));
            h3.setBackground(new Color(18, 90, 173));
            h4.setBackground(new Color(18, 90, 173));
            h5.setBackground(new Color(18, 90, 173));
            h6.setBackground(new Color(18, 90, 173));
            h7.setBackground(new Color(18, 90, 173));
        }
    }

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void changeimage(JLabel button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    private void eslogan() {
        while (true) {
            posX--;
            Promo.setLocation(posX, 44);
            Promo.setForeground(Color.white);
            if (posX < -Promo.getWidth()) {
                posX = getWidth();
            }
            try {
                sleep(9);
            } catch (Exception e) {
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JLabel Admin_l;
    private javax.swing.JLabel Admin_l1;
    public static javax.swing.JPanel Contenedor;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel Fecha;
    private javax.swing.JPanel Lado_derecho;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Max_Min;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Min_Max;
    private javax.swing.JPanel Opcion_1;
    private javax.swing.JPanel Opcion_2;
    private javax.swing.JPanel Opcion_3;
    private javax.swing.JPanel Opcion_4;
    public static javax.swing.JPanel Opcion_5;
    private javax.swing.JPanel Opcion_6;
    private javax.swing.JPanel Opcion_7;
    private javax.swing.JPanel Panel_head;
    private javax.swing.JPanel Panel_movimiento;
    private javax.swing.JPanel Panel_opciones;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JLabel Princ;
    private javax.swing.JLabel Promo;
    private javax.swing.JLabel Ruta;
    private javax.swing.JLabel Visible;
    private javax.swing.JPanel Visible_off;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
