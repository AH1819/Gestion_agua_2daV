package Vista;

import Controlador.Cliente_Controller;
import Modelo.Cliente;
import Modelo.Datos_Existentes;
import Modelo.MiRenderer;
import Modelo.CargarDatos;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Enumeration;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Hitler
 */
public class Cliente_Vista extends javax.swing.JPanel {

    int id_busqueda = 0;
    Datos_Existentes CE;
    DefaultTableModel modelo;
    Cliente_Controller CC;
    CargarDatos CD;

    public Cliente_Vista() {
        initComponents();
        CE = new Datos_Existentes();
        CD = new CargarDatos();
        CC = new Cliente_Controller();
        modelo = (DefaultTableModel) Mostrar.getModel();
        esperabusqueda.setVisible(false);
        esperaNuevoC.setVisible(false);
        espera.setVisible(false);
        HiloCliente.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        esperabusqueda = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        NuevoContrato = new javax.swing.JButton();
        esperaNuevoC = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        espera = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Clientes");

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el folio de cliente a buscar");
        usrnm.setBorder(null);
        usrnm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usrnmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usrnmFocusLost(evt);
            }
        });
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        usrnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usrnmKeyReleased(evt);
            }
        });

        esperabusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperabusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        jScrollPane2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jScrollPane2FocusGained(evt);
            }
        });

        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Fecha de nacimiento", "Celular", "Correo", "RFC", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Mostrar.setRowHeight(22);
        Mostrar.getTableHeader().setReorderingAllowed(false);
        Mostrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MostrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MostrarFocusLost(evt);
            }
        });
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Mostrar);
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setResizable(false);
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setResizable(false);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(150);
            Mostrar.getColumnModel().getColumn(2).setResizable(false);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(60);
            Mostrar.getColumnModel().getColumn(3).setResizable(false);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(4).setResizable(false);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(100);
            Mostrar.getColumnModel().getColumn(5).setResizable(false);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(6).setResizable(false);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        NuevoContrato.setBackground(new java.awt.Color(18, 90, 173));
        NuevoContrato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NuevoContrato.setForeground(new java.awt.Color(255, 255, 255));
        NuevoContrato.setText("Nuevo Contrato");
        NuevoContrato.setBorder(null);
        NuevoContrato.setEnabled(false);
        NuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoContratoActionPerformed(evt);
            }
        });

        esperaNuevoC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperaNuevoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        Nuevo.setBackground(new java.awt.Color(18, 90, 173));
        Nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.setBorder(null);
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevoMouseExited(evt);
            }
        });
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(18, 90, 173));
        Edit.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Editar");
        Edit.setBorder(null);
        Edit.setEnabled(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(18, 90, 173));
        Delete.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Dar de baja");
        Delete.setBorder(null);
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        espera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Activos", "Inactivos" }));
        Tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoItemStateChanged(evt);
            }
        });
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NuevoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(esperaNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(espera, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(esperabusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(esperabusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esperaNuevoC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NuevoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed

    }//GEN-LAST:event_usrnmMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased

    }//GEN-LAST:event_usrnmMouseReleased

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (Mostrar.getSelectedRow() != -1 && Mostrar.getSelectedRow() < Mostrar.getRowCount()) {
            switch (evt.getClickCount()) {
                case 1:
                    try {
                        id_busqueda = Integer.parseInt(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Edit.setEnabled(true);
                        NuevoContrato.setEnabled(true);
                        Delete.setEnabled(true);
                        if (Mostrar.getValueAt(Mostrar.getSelectedRow(), 6).toString().equals("inactivo")) {
                            Delete.setText("Dar de alta");
                        }
                        if (Mostrar.getValueAt(Mostrar.getSelectedRow(), 6).toString().equals("activo")) {
                            Delete.setText("Dar de baja");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Error", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 2:
                    try {
                        id_busqueda = Integer.parseInt(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        ContratosC ct = new ContratosC(id_busqueda, "Contratos del cliente", "Cliente_Vista", this);
                        ct.setVisible(true);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Hubo un error al consultar: " + e, "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }
        } else {
            System.out.println("fuera");
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void NuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoContratoActionPerformed
        Contrato_data cd = new Contrato_data(this, "Nuevo Contrato", id_busqueda);
        Paneles(cd);
    }//GEN-LAST:event_NuevoContratoActionPerformed

    private void NuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseEntered

    }//GEN-LAST:event_NuevoMouseEntered

    private void NuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseExited

    }//GEN-LAST:event_NuevoMouseExited

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Cliente_data CDP = new Cliente_data("Nuevo", this, 0);
        Paneles(CDP);
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        System.out.println("presiona");
        Cliente_data CDP = new Cliente_data("Modificar", this, id_busqueda);
        System.out.println("presiona");
        Paneles(CDP);
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String[] arreglo = {"Si", "No"};
        switch (Delete.getText()) {

            case "Dar de baja":
                int opcionp = JOptionPane.showOptionDialog(null, "¿Esta seguro que quiere dar de baja el contrato?", "Dar de baja", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
                if (arreglo[opcionp].equals("Si")) {
                    new Thread() {
                        @Override
                        public void run() {
                            Baja();
                            DataTabla();
                        }
                    }.start();
                }
                break;
            case "Dar de alta":
                int opcion = JOptionPane.showOptionDialog(null, "¿Esta seguro que quiere dar de alta el contrato?", "Dar de alta", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
                if (arreglo[opcion].equals("Si")) {
                    new Thread() {
                        @Override
                        public void run() {
                            Alta();
                            DataTabla();
                        }
                    }.start();
                }
                break;
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void usrnmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usrnmKeyReleased
        if (!usrnm.getText().isEmpty()) {
            esperabusqueda.setVisible(true);
            try {
                int number = Integer.parseInt(usrnm.getText());
                usrnm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                FiltroTabla(usrnm.getText().trim(), 2);
            } catch (NumberFormatException e1) {
                try {
                    double number = Double.parseDouble(usrnm.getText());
                    usrnm.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    DataTabla();
                } catch (NumberFormatException e2) {
                    if (usrnm.getText().trim().length() > 2) {
                        usrnm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        FiltroTabla(usrnm.getText().toLowerCase(), 1);
                    } else {
                        DataTabla();
                    }
                }
            }
        } else {
            DataTabla();
        }
    }//GEN-LAST:event_usrnmKeyReleased

    private void TipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoItemStateChanged


    }//GEN-LAST:event_TipoItemStateChanged

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        esperabusqueda.setVisible(true);
        usrnm.setText("Ingrese el folio de cliente a buscar");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Thread() {
                    public void run() {
                        DataTabla();
                    }
                }.start();
            }
        });
    }//GEN-LAST:event_TipoActionPerformed

    private void jScrollPane2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane2FocusGained

    }//GEN-LAST:event_jScrollPane2FocusGained

    private void MostrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MostrarFocusGained

    }//GEN-LAST:event_MostrarFocusGained

    private void MostrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MostrarFocusLost

    }//GEN-LAST:event_MostrarFocusLost

    private void usrnmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrnmFocusGained
        if (usrnm.getText().equals("Ingrese el folio de cliente a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmFocusGained

    private void usrnmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrnmFocusLost
        if (usrnm.getText().trim().equals("") || usrnm.getText() == null) {
            usrnm.setText("Ingrese el folio de cliente a buscar");
        }
    }//GEN-LAST:event_usrnmFocusLost

    public void Paneles(Component h) {
        h.setLocation(0, 0);
        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    Thread HiloCliente = new Thread() {
        public void run() {
            DataTabla();
        }
    };

    private void DataTabla() {
        modelo.setRowCount(0);
        if (CD.CargarClientes(Tipo.getSelectedIndex())) {
            for (Cliente cliente : CE.getClientes_Guardados()) {
                Object[] fila = {cliente.getFolio_cliente(), cliente.getNombre(),
                    cliente.getFecha_nac(), cliente.getCelular(), cliente.getEmail(),
                    cliente.getRfc(), cliente.getStatus()};
                modelo.addRow(fila);
            }
            Mostrar.setModel(modelo);
            setCellRender(Mostrar);
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros para mostrar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        esperabusqueda.setVisible(false);
    }

    private void Baja() {
        if (CC.Delete(id_busqueda)) {
            JOptionPane.showMessageDialog(this,
                    "Baja exitosa",
                    "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al dar de baja",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void Alta() {
        if (CC.Alta(id_busqueda)) {
            JOptionPane.showMessageDialog(this,
                    "Alta exitosa",
                    "Exito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error al dar de Alta",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void setCellRender(JTable table) {

        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new MiRenderer());
        }
        table.repaint();
    }

    private void FiltroTabla(String busqueda, int opcion) {
        boolean Status = false;

        modelo.setRowCount(0);

        switch (opcion) {
            case 1:
                for (Cliente cliente : CE.getClientes_Guardados()) {
                    if (cliente.getNombre().toLowerCase().contains(busqueda)) {
                        Object[] arr = {cliente.getFolio_cliente(), cliente.getNombre(),
                            cliente.getFecha_nac(), cliente.getCelular(), cliente.getEmail(),
                            cliente.getRfc(), cliente.getStatus()};
                        modelo.addRow(arr);
                        Status = true;
                    }
                }
                break;
            case 2:
                for (Cliente cliente : CE.getClientes_Guardados()) {
                    if (cliente.getFolio_cliente().toString().contains(busqueda)) {
                        Object[] arr = {cliente.getFolio_cliente(), cliente.getNombre(),
                            cliente.getFecha_nac(), cliente.getCelular(), cliente.getEmail(),
                            cliente.getRfc(), cliente.getStatus()};
                        modelo.addRow(arr);
                        Status = true;
                    }
                }
                break;
        }

        if (!Status) {
            DataTabla();
            return;
        }
        Mostrar.setModel(modelo);
        setCellRender(Mostrar);
        esperabusqueda.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    public javax.swing.JTable Mostrar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton NuevoContrato;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel espera;
    private javax.swing.JLabel esperaNuevoC;
    private javax.swing.JLabel esperabusqueda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
