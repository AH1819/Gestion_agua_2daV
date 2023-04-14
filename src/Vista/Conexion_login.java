package Vista;

import Conexion.ConexionBD;
import Conexion.PersistenciaLogeoBD;
import Conexion.PersistenciaLoginBD;
import Entity.ErrorsAndSuccessesBD;
import Entity.Logeo;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Conexion_login extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Logeo p1 = new Logeo();
    ConexionBD p0 = new ConexionBD();
    ErrorsAndSuccessesBD er = new ErrorsAndSuccessesBD();

    public Conexion_login() {
        initComponents();
        this.setLocationRelativeTo(null);
        Error.setVisible(false);
        Loading.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        Hostl = new javax.swing.JLabel();
        Host = new javax.swing.JTextField();
        Bdl = new javax.swing.JLabel();
        Portl = new javax.swing.JLabel();
        Bd = new javax.swing.JTextField();
        Port = new javax.swing.JTextField();
        exit = new javax.swing.JPanel();
        Exitjlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Error_con = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        Conectar = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hostl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Hostl.setForeground(new java.awt.Color(0, 0, 0));
        Hostl.setText("Host del servidor:");
        Contenido.add(Hostl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Host.setBackground(new java.awt.Color(255, 255, 255));
        Host.setForeground(new java.awt.Color(0, 0, 0));
        Host.setText(" Ingrese la direccion host del servidor");
        Host.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                HostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                HostFocusLost(evt);
            }
        });
        Host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HostMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HostMouseReleased(evt);
            }
        });
        Host.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HostKeyReleased(evt);
            }
        });
        Contenido.add(Host, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, 40));

        Bdl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Bdl.setForeground(new java.awt.Color(0, 0, 0));
        Bdl.setText("Base de datos:");
        Contenido.add(Bdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Portl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Portl.setForeground(new java.awt.Color(0, 0, 0));
        Portl.setText("Puerto:");
        Contenido.add(Portl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Bd.setBackground(new java.awt.Color(255, 255, 255));
        Bd.setForeground(new java.awt.Color(0, 0, 0));
        Bd.setText(" Ingrese el nombre de la base de datos");
        Bd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BdFocusLost(evt);
            }
        });
        Bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BdMouseReleased(evt);
            }
        });
        Bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdActionPerformed(evt);
            }
        });
        Bd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BdKeyReleased(evt);
            }
        });
        Contenido.add(Bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 290, 40));

        Port.setBackground(new java.awt.Color(255, 255, 255));
        Port.setForeground(new java.awt.Color(0, 0, 0));
        Port.setText(" Ingrese el puerto de conexion");
        Port.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PortMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PortMouseReleased(evt);
            }
        });
        Port.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PortKeyReleased(evt);
            }
        });
        Contenido.add(Port, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 40));

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

        Contenido.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de conexion");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        Contenido.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));
        Contenido.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 10));

        Error_con.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Error_con.setForeground(new java.awt.Color(255, 0, 0));
        Error_con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contenido.add(Error_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 430, 30));

        Error.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Error.setText("Error en la conexion");
        Contenido.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 430, 20));

        Conectar.setBackground(new java.awt.Color(18, 90, 173));
        Conectar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Conectar.setForeground(new java.awt.Color(255, 255, 255));
        Conectar.setText("Probar Conexion");
        Conectar.setBorder(null);
        Conectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });
        Contenido.add(Conectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 130, 40));

        Save.setBackground(new java.awt.Color(18, 90, 173));
        Save.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Guardar Configuracion");
        Save.setBorder(null);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Contenido.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 170, 40));

        Loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        Contenido.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 610, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HostMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HostMousePressed

    }//GEN-LAST:event_HostMousePressed

    private void HostMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HostMouseReleased

    }//GEN-LAST:event_HostMouseReleased

    private void BdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdMousePressed

    }//GEN-LAST:event_BdMousePressed

    private void BdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BdMouseReleased

    private void PortMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortMousePressed

    }//GEN-LAST:event_PortMousePressed

    private void PortMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PortMouseReleased

    }//GEN-LAST:event_PortMouseReleased

    private void BdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdActionPerformed

    }//GEN-LAST:event_BdActionPerformed
    PersistenciaLogeoBD pl = new PersistenciaLogeoBD();
    private void HostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HostKeyReleased
        if (evt.getKeyCode() == 10) {
            Bd.requestFocus();
        }
    }//GEN-LAST:event_HostKeyReleased

    private void BdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BdKeyReleased
        if (evt.getKeyCode() == 10) {
            Port.requestFocus();
        }
    }//GEN-LAST:event_BdKeyReleased

    private void PortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PortKeyReleased
        if (evt.getKeyCode() == 10) {
            Save.requestFocus();
        }
    }//GEN-LAST:event_PortKeyReleased

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
        if (Host.getText().equals(" Ingrese la direccion host del servidor")
                || Bd.getText().equals(" Ingrese el nombre de la base de datos")
                || Port.getText().equals(" Ingrese el puerto de conexion")
                || Host.getText().isEmpty()
                || Bd.getText().isEmpty()
                || Port.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Logeo l = new Logeo(Port.getText(), Host.getText(), Bd.getText());
            new conectar().show();
        }
    }//GEN-LAST:event_ConectarActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        if (Host.getText().equals(" Ingrese la direccion host del servidor")
                || Bd.getText().equals(" Ingrese el nombre de la base de datos")
                || Port.getText().equals(" Ingrese el puerto de conexion")
                || Host.getText().isEmpty()
                || Bd.getText().isEmpty()
                || Port.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (er.isExitoConexion() == true) {
                PersistenciaLoginBD p = new PersistenciaLoginBD(Host.getText(), Bd.getText(), Port.getText());
                pl.Guardar(p);
                Error.setText("Guardado con exito");
                Error.setForeground(Color.GREEN);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede guardar una configuracion erronea");
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void HostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HostFocusGained
        if (Host.getText().equals(" Ingrese la direccion host del servidor")) {
            Host.setText("");
        }
    }//GEN-LAST:event_HostFocusGained

    private void HostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_HostFocusLost
        if (Host.getText().isEmpty()) {
            Host.setText(" Ingrese la direccion host del servidor");
        }
    }//GEN-LAST:event_HostFocusLost

    private void BdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdFocusGained
        if (Bd.getText().equals(" Ingrese el nombre de la base de datos")) {
            Bd.setText("");
        }
    }//GEN-LAST:event_BdFocusGained

    private void BdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdFocusLost
        if (Bd.getText().isEmpty()) {
            Bd.setText(" Ingrese el nombre de la base de datos");
        }
    }//GEN-LAST:event_BdFocusLost

    private void ExitjlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseExited
        // TODO add your handling code here:
        exit.setBackground(Color.white);
        Exitjlabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_ExitjlabelMouseExited

    private void ExitjlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseEntered
        exit.setBackground(new Color(242, 44, 44));
        Exitjlabel.setForeground(Color.white);
    }//GEN-LAST:event_ExitjlabelMouseEntered

    private void ExitjlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitjlabelMouseClicked
        this.dispose();
        Login p2 = new Login();
        p2.setVisible(true);
    }//GEN-LAST:event_ExitjlabelMouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    public class conectar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Host.setVisible(false);
            Bd.setVisible(false);
            Port.setVisible(false);
            Hostl.setVisible(false);
            Bdl.setVisible(false);
            Portl.setVisible(false);
            Conectar.setVisible(false);
            Error_con.setVisible(false);
            Error.setVisible(false);
            Loading.setVisible(true);
            Save.setVisible(false);
            conexion();
            Loading.setVisible(false);
            Host.setVisible(true);
            Bd.setVisible(true);
            Port.setVisible(true);
            Hostl.setVisible(true);
            Bdl.setVisible(true);
            Portl.setVisible(true);
            Conectar.setVisible(true);
            Save.setVisible(true);
        }
    }

    private void conexion() {
        if (Host.getText().equals(" Ingrese la direccion host del servidor")
                || Bd.getText().equals(" Ingrese el nombre de la base de datos")
                || Port.getText().equals(" Ingrese el puerto de conexion")) {
            JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            p1.setIp(Host.getText());
            p1.setBase(Bd.getText());
            p1.setPuerto(Port.getText());
            p0.conectar();
        }
        if (er.isExitoConexion() == true) {
            Error_con.setVisible(false);
            Error.setVisible(true);
            Error.setText("Conexion exitosa");
            Error.setForeground(Color.BLACK);
        } else {
            Error_con.setVisible(true);
            Error_con.setText(er.getErrorconexion());
            Error.setVisible(true);
            Error.setText("Error en la conexion");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bd;
    private javax.swing.JLabel Bdl;
    private javax.swing.JButton Conectar;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Error;
    public static javax.swing.JLabel Error_con;
    private javax.swing.JLabel Exitjlabel;
    private javax.swing.JTextField Host;
    private javax.swing.JLabel Hostl;
    private javax.swing.JLabel Loading;
    private javax.swing.JTextField Port;
    private javax.swing.JLabel Portl;
    private javax.swing.JButton Save;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
