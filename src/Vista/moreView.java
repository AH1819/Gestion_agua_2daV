package Vista;

import Controlador.Empresa_Controller;
import Modelo.Empresa;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Hitler
 */
public class moreView extends javax.swing.JPanel {

    Empresa emp = new Empresa();

    public moreView() {
        initComponents();
        ((AbstractDocument) Pie.getDocument()).setDocumentFilter(new LimitDocumentFilter(100));
        ((AbstractDocument) Terminos.getDocument()).setDocumentFilter(new LimitDocumentFilter(546));
        Pie.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCharacterCount(100, Pie, Pie_Label);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCharacterCount(100, Pie, Pie_Label);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCharacterCount(100, Pie, Pie_Label);
            }
        });
        Terminos.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCharacterCount(546, Terminos, Termino_Label);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCharacterCount(546, Terminos, Termino_Label);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCharacterCount(546, Terminos, Termino_Label);
            }
        });
        CargarDatos();
    }

    private void CargarDatos() {
        Razon.setText(emp.getRazon_social());
        Municipio.setText(emp.getMunicipio());
        Estado.setText(emp.getEstado());
        RFC.setText(emp.getRFC());
        Pie.append(emp.getPie());
        Terminos.append(emp.getTerminos_y_condiciones());
        Eslogan.setText(emp.getEslogan_mov());
        Ruta.setText(emp.getRutaterminos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pie = new javax.swing.JTextArea();
        Razon = new javax.swing.JTextField();
        Municipio = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Terminos = new javax.swing.JTextArea();
        Eslogan = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Termino_Label = new javax.swing.JLabel();
        Pie_Label = new javax.swing.JLabel();
        Ruta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de la empresa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Razon social");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Eslogan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pie de recibos");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Terminos primer vistazo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("RFC");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Municipio");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado");

        Pie.setColumns(20);
        Pie.setLineWrap(true);
        Pie.setRows(5);
        Pie.setWrapStyleWord(true);
        Pie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PieKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Pie);

        Razon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RazonKeyReleased(evt);
            }
        });

        Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MunicipioKeyReleased(evt);
            }
        });

        Estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EstadoKeyReleased(evt);
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

        Terminos.setColumns(20);
        Terminos.setLineWrap(true);
        Terminos.setRows(5);
        Terminos.setWrapStyleWord(true);
        Terminos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TerminosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Terminos);

        Eslogan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EsloganKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EsloganKeyReleased(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(18, 90, 173));
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar");
        Guardar.setBorder(null);
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Termino_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Termino_Label.setForeground(new java.awt.Color(0, 0, 0));
        Termino_Label.setText("546 Caracteres");

        Pie_Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Pie_Label.setForeground(new java.awt.Color(0, 0, 0));
        Pie_Label.setText("100 Caracteres");

        Ruta.setEditable(false);
        Ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RutaKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ruta de terminos y condiciones (PDF)");

        jButton1.setBackground(new java.awt.Color(13, 71, 161));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carpeta.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Razon)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Municipio)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Estado)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RFC)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pie_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Termino_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Eslogan)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Razon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Pie_Label))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Eslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(Termino_Label)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (ValidarRFC()) {
            Actualizar();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void RazonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RazonKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_RazonKeyReleased

    private void MunicipioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_MunicipioKeyReleased

    private void EstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EstadoKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_EstadoKeyReleased

    private void RFCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyReleased
        if (RFC.getText().trim().length() == 13) {
            ValidarDatos();
        }
    }//GEN-LAST:event_RFCKeyReleased

    private void PieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PieKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_PieKeyReleased

    private void TerminosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TerminosKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_TerminosKeyReleased

    private void EsloganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EsloganKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_EsloganKeyPressed

    private void EsloganKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EsloganKeyReleased
        ValidarDatos();
    }//GEN-LAST:event_EsloganKeyReleased

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped

    }//GEN-LAST:event_RFCKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PDF", "pdf");
        chooser.setFileFilter(filtro);
        int seleccion = chooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
            Ruta.setText(archivo.getAbsolutePath());
        }
        ValidarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RutaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RutaKeyReleased

    }//GEN-LAST:event_RutaKeyReleased

    private void Actualizar() {
        Empresa_Controller ec = new Empresa_Controller();

        emp.setRazon_social(Razon.getText());
        emp.setMunicipio(Municipio.getText());
        emp.setEstado(Estado.getText());
        emp.setRFC(RFC.getText());
        emp.setPie(Pie.getText());
        emp.setTerminos_y_condiciones(Terminos.getText());
        emp.setEslogan_mov(Eslogan.getText());
        emp.setRutaterminos(Ruta.getText());

        if (ec.ActualizarDatos(emp)) {
            JOptionPane.showMessageDialog(this, "Se actualizo con exito", "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error al actualizar", "Actualizacion", JOptionPane.ERROR_MESSAGE);
        }
        CargarDatos();
        Guardar.setEnabled(false);
    }

    private boolean ValidarRFC() {
        boolean status = (RFC.getText().toUpperCase().matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}"));

        if (!status) {
            JOptionPane.showMessageDialog(this, "RFC no valido", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        return status;
    }

    private void ValidarDatos() {
        Guardar.setEnabled(
                !emp.getRazon_social().toLowerCase().trim().equals(Razon.getText().toLowerCase().trim())
                || !emp.getMunicipio().toLowerCase().trim().equals(Municipio.getText().toLowerCase().trim())
                || !emp.getEstado().toLowerCase().trim().equals(Estado.getText().toLowerCase().trim())
                || !emp.getRFC().toLowerCase().trim().equals(RFC.getText().toLowerCase().trim())
                || !emp.getPie().toLowerCase().trim().equals(Pie.getText().toLowerCase().trim())
                || !emp.getTerminos_y_condiciones().toLowerCase().trim().equals(Terminos.getText().toLowerCase().trim())
                || !emp.getEslogan_mov().toLowerCase().trim().equals(Eslogan.getText().toLowerCase().trim())
                || !emp.getRutaterminos().trim().toLowerCase().equals(Ruta.getText().toLowerCase().trim())
        );
    }

    private void updateCharacterCount(int Limit, JTextArea campo, JLabel etiqueta) {
        int remaining = Limit - campo.getText().length();
        etiqueta.setText(remaining + " Caracteres");
    }

    static class LimitDocumentFilter extends DocumentFilter {

        private int limit;

        public LimitDocumentFilter(int limit) {
            this.limit = limit;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String str, AttributeSet attr) throws BadLocationException {
            if ((fb.getDocument().getLength() + str.length()) <= limit) {
                super.insertString(fb, offset, str, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String str, AttributeSet attrs) throws BadLocationException {
            int newLength = fb.getDocument().getLength() - length + str.length();
            if (newLength <= limit) {
                super.replace(fb, offset, length, str, attrs);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Eslogan;
    private javax.swing.JTextField Estado;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextArea Pie;
    private javax.swing.JLabel Pie_Label;
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField Razon;
    private javax.swing.JTextField Ruta;
    private javax.swing.JLabel Termino_Label;
    private javax.swing.JTextArea Terminos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
