package Vista;

import Controlador.Contrato_Controller;
import Modelo.Contrato;
import Modelo.Contrato_generado;
import Modelo.Datos_Existentes;
import Modelo.Empresa;
import Modelo.Jasper;
import Modelo.CargarDatos;
import Modelo.MiRenderer;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
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
public class Contrato_Vista extends javax.swing.JPanel {

    int id_busqueda = 0;
    Empresa EMP;
    Datos_Existentes CE;
    DefaultTableModel modelo;
    Contrato_Controller CC;
    CargarDatos CD;

    public Contrato_Vista() {
        initComponents();
        CD = new CargarDatos();
        CC = new Contrato_Controller();
        CE = new Datos_Existentes();
        EMP = new Empresa();
        modelo = (DefaultTableModel) Mostrar.getModel();
        esperabusqueda.setVisible(false);
        esperareimprimir.setVisible(false);
        espera.setVisible(false);
        HiloContratos.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        esperabusqueda = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Reimprimir = new javax.swing.JButton();
        esperareimprimir = new javax.swing.JLabel();
        Nuevo = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        espera = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Contratos");

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el folio de contrato a buscar");
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

        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Mostrar.setRowHeight(22);
        Mostrar.getTableHeader().setReorderingAllowed(false);
        Mostrar.addFocusListener(new java.awt.event.FocusAdapter() {
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
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(2).setResizable(false);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(300);
            Mostrar.getColumnModel().getColumn(3).setResizable(false);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(80);
            Mostrar.getColumnModel().getColumn(4).setResizable(false);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(5).setResizable(false);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            Mostrar.getColumnModel().getColumn(6).setResizable(false);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        Reimprimir.setBackground(new java.awt.Color(18, 90, 173));
        Reimprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reimprimir.setForeground(new java.awt.Color(255, 255, 255));
        Reimprimir.setText("Reimprimir contrato");
        Reimprimir.setBorder(null);
        Reimprimir.setEnabled(false);
        Reimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReimprimirActionPerformed(evt);
            }
        });

        esperareimprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperareimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cargando.gif"))); // NOI18N

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
                .addComponent(Reimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(esperareimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(esperareimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espera, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        JTable table = (JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = Mostrar.rowAtPoint(point);

        if (evt.getClickCount() == 2) {
            try {
                id_busqueda = Integer.parseInt(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                ContratosC ct = new ContratosC(id_busqueda, "Cliente del contrato", "Contrato_Vista", this);
                ct.setVisible(true);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Sin contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (evt.getClickCount() == 1) {
            try {
                id_busqueda = Integer.parseInt(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                Edit.setEnabled(true);
                Reimprimir.setEnabled(true);
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
        }

    }//GEN-LAST:event_MostrarMousePressed

    private void ReimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReimprimirActionPerformed
        esperareimprimir.setVisible(true);
        new Thread() {
            @Override
            public void run() {
                Generar_contrato();
            }
        }.start();
    }//GEN-LAST:event_ReimprimirActionPerformed

    private void NuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseEntered

    }//GEN-LAST:event_NuevoMouseEntered

    private void NuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseExited

    }//GEN-LAST:event_NuevoMouseExited

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        espera.setVisible(true);
        ContratosC C = new ContratosC(0, "Elija a un cliente existente", "Contrato_Vista_nuevo", this);
        new Thread() {
            @Override
            public void run() {
                C.setVisible(true);
            }
        }.start();
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        Contrato_data C = new Contrato_data(this, "Modificar", id_busqueda);
        Paneles(C);
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

    private void MostrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MostrarFocusLost

    }//GEN-LAST:event_MostrarFocusLost

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        esperabusqueda.setVisible(true);
        usrnm.setText("Ingrese el folio de contrato a buscar");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DataTabla();
                new Thread() {
                    public void run() {

                    }
                }.start();
            }
        });
    }//GEN-LAST:event_TipoActionPerformed

    private void usrnmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrnmFocusGained
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmFocusGained

    private void usrnmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usrnmFocusLost
        if (usrnm.getText().trim().equals("") || usrnm.getText() == null) {
            usrnm.setText("Ingrese el folio de contrato a buscar");
        }
    }//GEN-LAST:event_usrnmFocusLost
    public void Paneles(Component h) {
        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    private void Generar_contrato() {

        Contrato lista = CC.GenerarContrato(id_busqueda);
        Contrato_generado cg = new Contrato_generado();
        if (lista != null) {

            cg.setFolio_contrato(lista.getFolioContrato());
            cg.setCreacion_contrato(lista.getCreacion_contrato());
            cg.setInformativo(EMP.getTerminos_y_condiciones());

            Jasper js = new Jasper();
            js.generar_contraro(esperareimprimir);

        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error en la ejecucion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void DataTabla() {
        modelo.setRowCount(0);
        if (CD.CargarContratos(Tipo.getSelectedIndex())) {
            for (Contrato contratos : CE.getContratos_Guardados()) {
                Object[] fila = {contratos.getFolioContrato(), contratos.getNombre(),
                    contratos.getResidencia(), contratos.getTipo_consumo(), contratos.getTipo_periodo(),
                    contratos.getDeuda(), contratos.getStatus()};
                modelo.addRow(fila);
            }
            Mostrar.setModel(modelo);
            setCellRender(Mostrar);
        } else {
            modelo.setRowCount(0);
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

    Thread HiloContratos = new Thread() {
        @Override
        public void run() {
            DataTabla();
        }
    };

    private void FiltroTabla(String busqueda, int opcion) {
        boolean Status = false;
        modelo.setRowCount(0);
        if (opcion == 1) {
            for (Contrato contratos_Guardado : CE.getContratos_Guardados()) {
                if (contratos_Guardado.getNombre().toLowerCase().contains(busqueda)) {
                    Object[] arr = {contratos_Guardado.getFolioContrato(),
                        contratos_Guardado.getNombre(), contratos_Guardado.getResidencia(),
                        contratos_Guardado.getTipo_consumo(), contratos_Guardado.getTipo_periodo(),
                        contratos_Guardado.getDeuda(), contratos_Guardado.getStatus()};
                    modelo.addRow(arr);
                    Status = true;
                }
            }
        }
        if (opcion == 2) {
            for (Contrato contratos_Guardado : CE.getContratos_Guardados()) {
                if (contratos_Guardado.getFolioContrato().toString().contains(busqueda)) {
                    Object[] arr = {contratos_Guardado.getFolioContrato(),
                        contratos_Guardado.getNombre(), contratos_Guardado.getResidencia(),
                        contratos_Guardado.getTipo_consumo(), contratos_Guardado.getTipo_periodo(),
                        contratos_Guardado.getDeuda(), contratos_Guardado.getStatus()};
                    modelo.addRow(arr);
                    Status = true;
                }
            }
        }
        if (!Status) {
            DataTabla();
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
    private javax.swing.JButton Reimprimir;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel Title;
    public static javax.swing.JLabel espera;
    private javax.swing.JLabel esperabusqueda;
    public static javax.swing.JLabel esperareimprimir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
