package Vista;

import Dao.ContratoDao;
import Entity.Cliente;
import Entity.Contrato;
import Entity.Contrato_generado;
import Entity.Datos_Existentes;
import Entity.Empresa;
import Entity.Jasper;
import Entity.MiRenderer;
import static Vista.Interfaz.Contenedor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
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
    Empresa EMP = new Empresa();
    Datos_Existentes CE = new Datos_Existentes();
    String opcion_condicional = "all";
    //ArrayList<ArrayList<String>> arrayList = new ArrayList<>();

    public Contrato_Vista() {
        initComponents();
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

        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
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
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(10);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(esperabusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased

    }//GEN-LAST:event_usrnmMouseReleased

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" ")) {
            usrnm.setText("Ingrese el folio de contrato a buscar");
        }

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
        ContratosC CC = new ContratosC(0, "Elija a un cliente existente", "Contrato_Vista_nuevo", this);
        new Thread() {
            @Override
            public void run() {
                CC.setVisible(true);
            }
        }.start();
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        new Thread() {
            @Override
            public void run() {
                Cliente c = new Cliente();
                Contrato_Vista Contrato_Vista = new Contrato_Vista();
                Contrato_data CD = new Contrato_data(c, "Modificar", Contrato_Vista, id_busqueda);
                Paneles(CD);
            }
        }.start();
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
                            GetContratos();
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
                            GetContratos();
                        }
                    }.start();
                }
                break;
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void usrnmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usrnmKeyReleased

        if (!usrnm.getText().isEmpty()) {
            esperabusqueda.setVisible(true);
            String text = usrnm.getText();
            try {
                int number = Integer.parseInt(text);
                usrnm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                FiltroTabla(0, usrnm.getText());
            } catch (NumberFormatException e1) {
                try {
                    double number = Double.parseDouble(text);
                    usrnm.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    FiltroTabla(6, "all");
                } catch (NumberFormatException e2) {
                    if (usrnm.getText().trim().length() > 2) {
                        usrnm.setBorder(BorderFactory.createLineBorder(Color.BLACK, 0));
                        FiltroTabla(1, usrnm.getText());
                    } else {
                        FiltroTabla(6, "all");
                    }
                }
            }
        } else {
            FiltroTabla(6, "all");

        }
        //PruebaFiltro(usrnm.getText().trim().toLowerCase());
    }//GEN-LAST:event_usrnmKeyReleased

    private void TipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoItemStateChanged
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                esperabusqueda.setVisible(true);
                usrnm.setText("Ingrese el folio de contrato a buscar");
                GetContratos();
            }
        });
    }//GEN-LAST:event_TipoItemStateChanged

    private void MostrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MostrarFocusLost

    }//GEN-LAST:event_MostrarFocusLost

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed
    public void Paneles(Component h) {
        h.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(h, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    private void Generar_contrato() {
        ContratoDao cs = new ContratoDao();
        List<Contrato> lista = cs.GenerarContrato(Integer.parseInt(String.valueOf(id_busqueda)));
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

        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error en la ejecucion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void GetContratos() {
        int opcion = Tipo.getSelectedIndex();
        ContratoDao cs = new ContratoDao();
        List<Contrato> lista = cs.MostrarContratos(opcion);
        int tam = 0;
        tam = lista.size();
        //arraylist - collection - lamdas
        //NombreArrayList.metodos(valorBuscar);
        String list[][] = new String[tam][7];
        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolioContrato().toString();
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getMunicipio() + "/ " + lista.get(i).getResidencia() + "/ " + lista.get(i).getNombreCalle() + "/ " + lista.get(i).getCalleReferencia() + "/ " + lista.get(i).getNumeroMzn() + "/ " + lista.get(i).getNumeroLt();
            list[i][3] = lista.get(i).getTipo_consumo();
            list[i][4] = lista.get(i).getTipo_periodo();
            list[i][5] = lista.get(i).getDeuda().toString();
            list[i][6] = lista.get(i).getStatus();
        }

        /*for (String[] array : list) {
                    ArrayList<String> listarr = new ArrayList<>(Arrays.asList(array));
                    arrayList.add(listarr);
                }*/
        CE.setContratos_Guardados(list);
        String head[] = {"Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"};
        Integer TamañoColumna[] = {10, 10, 300, 80, 50, 20, 20};
        Jtable(Mostrar, list, head, 7, TamañoColumna);
    }

    private void Baja() {
        ContratoDao cs = new ContratoDao();
        cs.DarDeBajaContrato(id_busqueda);
    }

    private void Alta() {
        ContratoDao cs = new ContratoDao();
        cs.DarDeAltaContrato(id_busqueda);
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
        esperabusqueda.setVisible(false);
    }

    public void setCellRender(JTable table) {
        Enumeration<TableColumn> en = table.getColumnModel().getColumns();
        while (en.hasMoreElements()) {
            TableColumn tc = en.nextElement();
            tc.setCellRenderer(new MiRenderer());
        }
    }

    private void FiltroTabla(int column, String search) {
        new Thread() {
            public void run() {
                DefaultTableModel modelo = (DefaultTableModel) Mostrar.getModel();
                modelo.setRowCount(0);
                boolean status = false;
                for (String[] Contratos_Guardado : CE.getContratos_Guardados()) {
                    for (String Contratos_Guardado1 : Contratos_Guardado) {

                        if (Contratos_Guardado[column].toLowerCase().contains(search.toLowerCase())) {
                            modelo.addRow(Contratos_Guardado);
                            status = true;
                            break;
                        }

                    }
                }
                if (!status) {
                    for (String[] contratos_Guardado : CE.getContratos_Guardados()) {
                        modelo.addRow(contratos_Guardado);
                    }
                }
                Mostrar.setModel(modelo);
                esperabusqueda.setVisible(false);
            }
        }.start();
    }
    Thread HiloContratos = new Thread() {
        public void run() {
            GetContratos();
        }
    };
    /*private void PruebaFiltro(String busqueda) {
        DefaultTableModel modelo = (DefaultTableModel) Mostrar.getModel();
        modelo.setRowCount(0);
        System.out.println("ArrayList");
        for (ArrayList<String> innerList : arrayList) {
            if (innerList.contains(busqueda)) {
                String[] arr = innerList.toArray(new String[0]);
                modelo.addRow(arr);
            }
        }
        Mostrar.setModel(modelo);
        esperabusqueda.setVisible(false);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTable Mostrar;
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
