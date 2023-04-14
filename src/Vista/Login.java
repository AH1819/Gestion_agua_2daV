package Vista;

import Conexion.ConexionBD;
import Conexion.PersistenciaLogeoBD;
import Entity.ErrorsAndSuccessesBD;
import Entity.Logeo;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    ErrorsAndSuccessesBD er = new ErrorsAndSuccessesBD();

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Error.setVisible(false);
        Ocultar.setVisible(false);
        Cargando.setVisible(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Recursos/gota_agua.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Fondo_login = new javax.swing.JLabel();
        Initxt = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JLabel();
        Usertxt = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        Barra = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        Exitjlabel = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        Mostrar = new javax.swing.JLabel();
        Ocultar = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();
        Entertxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1000, 510));
        setUndecorated(true);
        setResizable(false);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Bienvenida_login.png"))); // NOI18N
        Fondo_login.setText("jLabel1");
        Fondo_login.setToolTipText("");
        Panel1.add(Fondo_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 520, 510));

        Initxt.setFont(new java.awt.Font("Roboto Light", 1, 36)); // NOI18N
        Initxt.setForeground(new java.awt.Color(0, 0, 0));
        Initxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Initxt.setText("INICIAR SESION");
        Panel1.add(Initxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 60));

        Passwordtxt.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Passwordtxt.setForeground(new java.awt.Color(0, 0, 0));
        Passwordtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Passwordtxt.setText("CONTRASEÑA");
        Panel1.add(Passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 30));

        Usertxt.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Usertxt.setForeground(new java.awt.Color(0, 0, 0));
        Usertxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Usertxt.setText("USUARIO");
        Panel1.add(Usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, 30));

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setText(" Ingrese su nombre de usuario");
        user.setBorder(null);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFocusLost(evt);
            }
        });
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });
        Panel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, 30));
        Panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 340, 20));
        Panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 212, 340, 10));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setText("••••••••");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        Panel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 340, 30));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraMouseDragged(evt);
            }
        });
        Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));

        Exitjlabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Exitjlabel.setForeground(new java.awt.Color(0, 0, 0));
        Exitjlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exitjlabel.setText("X");
        Exitjlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exitjlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitjlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitjlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitjlabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exitjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Exitjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 961, Short.MAX_VALUE))
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel1.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        Error.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Error.setText("Usuario o contraseña incorrecto");
        Panel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 480, 30));

        Mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mostrar.png"))); // NOI18N
        Mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        Panel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 20));

        Ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ocultar.png"))); // NOI18N
        Ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OcultarMousePressed(evt);
            }
        });
        Panel1.add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 30, 20));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N
        Panel1.add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 70, 50));

        Entertxt.setBackground(new java.awt.Color(0, 102, 204));
        Entertxt.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Entertxt.setForeground(new java.awt.Color(255, 255, 255));
        Entertxt.setText("ENTRAR");
        Entertxt.setBorder(null);
        Entertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntertxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntertxtMouseExited(evt);
            }
        });
        Entertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntertxtActionPerformed(evt);
            }
        });
        Entertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EntertxtKeyReleased(evt);
            }
        });
        Panel1.add(Entertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void ExitjlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitjlabelMouseClicked

    private void BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_BarraMousePressed

    private void BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);

    }//GEN-LAST:event_BarraMouseDragged

    private void ExitjlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseEntered
        // TODO add your handling code here:
        exit.setBackground(new Color(242, 44, 44));
        Exitjlabel.setForeground(Color.white);
    }//GEN-LAST:event_ExitjlabelMouseEntered

    private void ExitjlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseExited
        // TODO add your handling code here:
        exit.setBackground(Color.white);
        Exitjlabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_ExitjlabelMouseExited

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed

    }//GEN-LAST:event_userMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed

    }//GEN-LAST:event_passwordMousePressed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if (evt.getKeyCode() == 115) {
            CambiarConexion();
        }
        if (evt.getKeyCode() == 10) {
            if (password.getText().isEmpty() || password.getText().equals("••••••••")) {

            } else {
                if (user.getText().equals(" Ingrese su nombre de usuario") || user.getText().isEmpty()
                        || password.getText().equals("••••••••") || password.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    new Entrar().show();
                }
            }
        }
    }//GEN-LAST:event_passwordKeyReleased

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        if (evt.getKeyCode() == 10) {
            password.requestFocus();
        }
    }//GEN-LAST:event_userKeyReleased

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped

    }//GEN-LAST:event_passwordKeyTyped

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        Mostrar.setVisible(false);
        password.setEchoChar((char) 0);
        Ocultar.setVisible(true);
    }//GEN-LAST:event_MostrarMousePressed

    private void OcultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMousePressed
        Mostrar.setVisible(true);
        password.setEchoChar('•');
        Ocultar.setVisible(false);
    }//GEN-LAST:event_OcultarMousePressed

    private void EntertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntertxtActionPerformed
        if (user.getText().equals(" Ingrese su nombre de usuario") || user.getText().isEmpty()
                || password.getText().equals("••••••••") || password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new Entrar().show();
        }
    }//GEN-LAST:event_EntertxtActionPerformed

    private void EntertxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntertxtMouseEntered
        Entertxt.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_EntertxtMouseEntered

    private void EntertxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntertxtMouseExited
        Entertxt.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_EntertxtMouseExited

    private void userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusGained
        user.setForeground(Color.BLACK);
        if (user.getText().equals(" Ingrese su nombre de usuario")) {
            user.setText("");
        }
    }//GEN-LAST:event_userFocusGained

    private void userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFocusLost
        user.setForeground(new java.awt.Color(102, 102, 102));
        if (user.getText().isEmpty()) {
            user.setText(" Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_userFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setForeground(Color.BLACK);
        if (password.getText().equals("••••••••")) {
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        password.setForeground(new java.awt.Color(102, 102, 102));
        if (password.getText().isEmpty()) {
            password.setText("••••••••");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void EntertxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntertxtKeyReleased
        if (evt.getKeyCode() == 10) {
            if (user.getText().equals(" Ingrese su nombre de usuario") || user.getText().isEmpty()
                    || password.getText().equals("••••••••") || password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                new Entrar().show();
            }
        }
    }//GEN-LAST:event_EntertxtKeyReleased

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyPressed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    public class Entrar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        public void run() {

            Cargando.setVisible(true);
            user.setEditable(false);
            password.setEditable(false);
            entrar();
            Cargando.setVisible(false);
            user.setEditable(true);
            password.setEditable(true);
        }
    }

    private void CambiarConexion() {
        if (user.getText().equals(" Ingrese su nombre de usuario") || user.getText().isEmpty()
                || password.getText().equals("********") || password.getText().isEmpty()) {

        } else {
            Logeo p0 = new Logeo(user.getText(), password.getText());
            Conexion_login p1 = new Conexion_login();
            p1.setVisible(true);
            p1.setSize(610, 380);
            this.setVisible(false);
        }

    }

    private void entrar() {
        PersistenciaLogeoBD pl = new PersistenciaLogeoBD();
        pl.Leer();
        ConexionBD con = new ConexionBD();
        Logeo p0 = new Logeo(user.getText(), password.getText());
        con.conectar();
        if (er.isExitoConexion() == true) {
            Interfaz Intz = new Interfaz();
            Intz.setVisible(true);
            this.dispose();
        } else {
            new Error().show();
        }
    }

    public class Error implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        public void run() {
            try {
                Error.setVisible(true);
                Thread.sleep(4000);
                Error.setVisible(false);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton Entertxt;
    private javax.swing.JLabel Error;
    private javax.swing.JLabel Exitjlabel;
    private javax.swing.JLabel Fondo_login;
    private javax.swing.JLabel Initxt;
    private javax.swing.JLabel Mostrar;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel Passwordtxt;
    private javax.swing.JLabel Usertxt;
    private javax.swing.JPanel exit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
