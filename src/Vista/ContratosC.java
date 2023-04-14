package Vista;

import Dao.ClienteDaoR;
import Dao.ContratoDao;
import Entity.Cliente;
import Entity.Contrato;
import Entity.MiRenderer;
import static Vista.Contrato_Vista.espera;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Point;
import java.util.Enumeration;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ContratosC extends javax.swing.JDialog {

    int Xmouse, Ymouse;
    boolean cerrar = false;
    Component ubicacion;
    String opcion;

    public ContratosC(int folio, String titulo, String opcion, Component ubicacion) {
        initComponents();
        this.opcion = opcion;
        this.ubicacion = ubicacion;
        nuevo_cliente.setVisible(false);
        this.setLocationRelativeTo(this);
        Titulo.setText(titulo);
        switch (opcion) {
            case "Cliente_Vista":
                Aceptar.setVisible(false);
                Folio.setVisible(false);
                new Thread() {
                    public void run() {
                        Contratos(folio);
                    }
                }.start();
                break;
            case "Contrato_Vista":
                nombre.setText("Folio del Contrato:");
                Nombre.setText(String.valueOf(folio));
                Aceptar.setVisible(false);
                Folio.setVisible(false);
                new Thread() {
                    public void run() {
                        Clientes(folio);
                    }
                }.start();
                break;
            case "Contrato_Vista_nuevo":
                nuevo_cliente.setVisible(true);
                nombre.setVisible(false);
                Nombre.setVisible(false);
                new Thread() {
                    public void run() {
                        Clientes_Existentes();
                    }
                }.start();
                break;
            case "Servicio":
                new Thread() {
                    public void run() {
                        Contratos(folio);
                    }
                }.start();
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Folio = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        nuevo_cliente = new javax.swing.JButton();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 200));

        Folio.setEditable(false);
        Folio.setForeground(new java.awt.Color(0, 0, 0));
        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        jPanel1.add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 60, -1));

        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 230, 20));

        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 20));

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cerrar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 40));

        Aceptar.setBackground(new java.awt.Color(18, 90, 173));
        Aceptar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Aceptar.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar.setText("Aceptar");
        Aceptar.setBorder(null);
        Aceptar.setEnabled(false);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 40));

        Titulo.setBackground(new java.awt.Color(18, 90, 173));
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setOpaque(true);
        Titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TituloMouseDragged(evt);
            }
        });
        Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TituloMousePressed(evt);
            }
        });
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        nuevo_cliente.setBackground(new java.awt.Color(18, 90, 173));
        nuevo_cliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nuevo_cliente.setForeground(new java.awt.Color(255, 255, 255));
        nuevo_cliente.setText("Nuevo cliente");
        nuevo_cliente.setBorder(null);
        nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(nuevo_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 120, 40));

        Error.setBackground(new java.awt.Color(255, 255, 255));
        Error.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Error.setForeground(new java.awt.Color(0, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if (!cerrar) {
            this.setVisible(true);
        }
    }//GEN-LAST:event_formWindowDeactivated

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        cerrar = true;
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        cerrar = true;
        if (opcion.equals("Contrato_Vista_nuevo")) {
            Cliente cl = new Cliente();
            Contrato_data CD = new Contrato_data(cl, "Nuevo Contrato", ubicacion, Integer.parseInt(Folio.getText()));
            Paneles(CD);
            espera.setVisible(false);
            this.dispose();
        }
        if (opcion.equals("Servicio")) {
            Servicio_Responsive.Dato.setText(Folio.getText());
            Servicio_Responsive.Busqueda.setSelectedIndex(1);
            Servicio_Responsive.Buscar.doClick();
            this.dispose();
        }

    }//GEN-LAST:event_AceptarActionPerformed

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FolioActionPerformed

    private void TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_TituloMousePressed

    private void TituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_TituloMouseDragged

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        JTable table = (JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = Mostrar.rowAtPoint(point);

        if (evt.getClickCount() == 1) {
            try {
                Folio.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                if (!Folio.getText().isEmpty()) {
                    Aceptar.setEnabled(true);
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_clienteActionPerformed
        cerrar = true;

        Cliente_data Cd = new Cliente_data("Nuevo", ubicacion,0);

        this.dispose();
        Paneles(Cd);
        espera.setVisible(false);
    }//GEN-LAST:event_nuevo_clienteActionPerformed
    private void Contratos(int folio) {
        ContratoDao cts = new ContratoDao();
        List<Contrato> lista = cts.ContratosC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][7];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolioContrato().toString();
                list[i][1] = lista.get(i).getMunicipio();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getNumeroMzn().toString();
                list[i][4] = lista.get(i).getNumeroLt().toString();
                list[i][5] = lista.get(i).getDeuda().toString();
                list[i][6] = lista.get(i).getStatus();
                Nombre.setText(lista.get(i).getNombre());
            }
            String head[] = {"Folio", "Municipio", "Residencia", "Manzana", "Lote", "Deuda", "Status"};
            Integer TamañoColumna[] = {10, 40, 40, 10, 10, 10, 20};
            Jtable(Mostrar, list, head, 7, TamañoColumna);
        } else {
            Mostrar.setVisible(false);
            jScrollPane1.setVisible(false);
            Error.setText("No existen contratos");
        }

    }

    private void Clientes(int folio) {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.ClientesC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][6];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolio_cliente().toString();
                list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getFecha_nac().toString();
                list[i][4] = String.valueOf(lista.get(i).getNumero_manzana());
                list[i][5] = String.valueOf(lista.get(i).getNumero_lote());
            }
            String head[] = {"Folio", "Nombre", "Residencia", "Fecha de nacimiento", "Manzana", "Lote"};
            Integer TamañoColumna[] = {10, 100, 50, 85, 20, 20};
            Jtable(Mostrar, list, head, 6, TamañoColumna);
        }
    }

    private void Clientes_Existentes() {
        ClienteDaoR cs = new ClienteDaoR();
        List<Cliente> lista = cs.MostrarClientes(0);
        int tam = lista.size();
        String list[][] = new String[tam][7];

        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolio_cliente().toString();
            list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            list[i][2] = lista.get(i).getFecha_nac().toString();
            list[i][3] = lista.get(i).getCelular();
            list[i][4] = lista.get(i).getEmail();
            list[i][5] = lista.get(i).getRfc();
            list[i][6] = lista.get(i).getStatus();
        }
        String head[] = {"Folio", "Nombre", "Fecha de nacimiento", "Celular", "Correo", "RFC", "Status"};
        Integer TamañoColumna[] = {10, 200, 60, 10, 20, 10, 10};
        Jtable(Mostrar, list, head, 7, TamañoColumna);
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

    public void Paneles(Component h) {
        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField Folio;
    private javax.swing.JTable Mostrar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton nuevo_cliente;
    // End of variables declaration//GEN-END:variables

}
