package Vista;

import Entity.Cliente;
import Entity.Empresa;
import Entity.Logeo;
import Entity.ticket_generado;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class TicketVista extends javax.swing.JDialog implements Printable {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    Logeo lo = new Logeo();

    public TicketVista(Cliente cl) {
        initComponents();
        this.setLocationRelativeTo(this);
        fecha.setText(dtf.format(LocalDateTime.now()));
        fecha1.setText(dtf.format(LocalDateTime.now()));
        InformacionPago();
        InformacionEmpresa();
        InformacionCliente(cl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Imprimir = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pie_pagina = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        S_a_c_v = new javax.swing.JLabel();
        Empresa = new javax.swing.JLabel();
        muniest = new javax.swing.JLabel();
        rfc = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Operador = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        folio_ticket = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        folio_cliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        folio_contrato1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        domicilio = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mes_pago = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tipo_consumo = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tipo_pago = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        monto_pago = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        cargo_generado = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Empresa1 = new javax.swing.JLabel();
        S_a_c_v1 = new javax.swing.JLabel();
        rfc1 = new javax.swing.JLabel();
        muniest1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        fecha1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        folio_ticket1 = new javax.swing.JLabel();
        Operador1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        folio_contrato2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        folio_cliente1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        domicilio1 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        mes_pago1 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tipo_consumo1 = new javax.swing.JLabel();
        cargo_generado1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tipo_pago1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        descuento1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        monto_pago1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        pie_pagina1 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Imprimir.setMinimumSize(new java.awt.Dimension(1022, 510));
        Imprimir.setPreferredSize(new java.awt.Dimension(1022, 510));
        Imprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel5.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        pie_pagina.setText("x");
        pie_pagina.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pie_pagina.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Imprimir.add(pie_pagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 380, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DATOS DEL PAGO");
        Imprimir.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 260, -1));

        jLabel9.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        S_a_c_v.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        S_a_c_v.setText("x");
        Imprimir.add(S_a_c_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 120, 10));

        Empresa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Empresa.setText("x");
        Imprimir.add(Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 270, 10));

        muniest.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        muniest.setText("x");
        Imprimir.add(muniest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 230, -1));

        rfc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rfc.setText("x");
        Imprimir.add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, 10));

        jLabel10.setText("OPERADOR:");
        Imprimir.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, -1));

        jLabel11.setText("Fecha:");
        Imprimir.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        fecha.setText("x");
        Imprimir.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, -1));

        Operador.setText("x");
        Imprimir.add(Operador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, -1));

        jLabel12.setText("Folio de ticket:");
        Imprimir.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        folio_ticket.setText("x");
        Imprimir.add(folio_ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, -1));

        jLabel13.setText("Nombre:");
        Imprimir.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        nombre.setText("x");
        Imprimir.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, -1));

        jLabel14.setText("Folio de cliente:");
        Imprimir.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        folio_cliente.setText("x");
        Imprimir.add(folio_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 60, -1));

        jLabel15.setText("Folio de contrato:");
        Imprimir.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        folio_contrato1.setText("x");
        Imprimir.add(folio_contrato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 60, -1));

        jLabel16.setText("Domicilio:");
        Imprimir.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        domicilio.setText("x");
        Imprimir.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 220, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DATOS DEL CLIENTE");
        Imprimir.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 270, -1));

        jLabel18.setText("Mes del pago:");
        Imprimir.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, -1));

        total.setText("x");
        Imprimir.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 100, -1));

        jLabel19.setText("Total:");
        Imprimir.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        mes_pago.setText("x");
        Imprimir.add(mes_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 160, -1));

        jLabel20.setText("Tipo de consumo:");
        Imprimir.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        tipo_consumo.setText("x");
        Imprimir.add(tipo_consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 120, -1));

        jLabel21.setText("Cargo generado:");
        Imprimir.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        tipo_pago.setText("x");
        Imprimir.add(tipo_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 120, -1));

        jLabel22.setText("Descuento:");
        Imprimir.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel23.setText("Monto del pago:");
        Imprimir.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        monto_pago.setText("x");
        Imprimir.add(monto_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 100, -1));

        descuento.setText("x");
        Imprimir.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 100, -1));

        cargo_generado.setText("x");
        Imprimir.add(cargo_generado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 120, -1));

        jLabel24.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel25.setText("************************************************************************");
        Imprimir.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 360, -1));

        jLabel26.setText("************************************************************************");
        Imprimir.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jLabel6.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        Empresa1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Empresa1.setText("x");
        Imprimir.add(Empresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 260, 20));

        S_a_c_v1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        S_a_c_v1.setText("x");
        Imprimir.add(S_a_c_v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 140, 10));

        rfc1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rfc1.setText("x");
        Imprimir.add(rfc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 170, 10));

        muniest1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        muniest1.setText("x");
        Imprimir.add(muniest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 220, -1));

        jLabel27.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        jLabel28.setText("OPERADOR:");
        Imprimir.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 100, -1));

        jLabel29.setText("Fecha:");
        Imprimir.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        fecha1.setText("x");
        Imprimir.add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 180, -1));

        jLabel30.setText("Folio de ticket:");
        Imprimir.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        folio_ticket1.setText("x");
        Imprimir.add(folio_ticket1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 130, -1));

        Operador1.setText("x");
        Imprimir.add(Operador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 180, -1));

        jLabel31.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel33.setText("Nombre:");
        Imprimir.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        nombre1.setText("x");
        Imprimir.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 240, -1));

        jLabel34.setText("Folio de contrato:");
        Imprimir.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        folio_contrato2.setText("x");
        Imprimir.add(folio_contrato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 60, -1));

        jLabel35.setText("Folio de cliente:");
        Imprimir.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        folio_cliente1.setText("x");
        Imprimir.add(folio_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 60, -1));

        jLabel36.setText("Domicilio:");
        Imprimir.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        domicilio1.setText("x");
        Imprimir.add(domicilio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 220, -1));

        jLabel37.setText("----------------------------------------------------------------------------------------------------------");
        Imprimir.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Mes del pago:");
        Imprimir.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 80, -1));

        mes_pago1.setText("x");
        Imprimir.add(mes_pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 160, -1));

        jLabel40.setText("Tipo de consumo:");
        Imprimir.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        tipo_consumo1.setText("x");
        Imprimir.add(tipo_consumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 120, -1));

        cargo_generado1.setText("x");
        Imprimir.add(cargo_generado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 120, -1));

        jLabel41.setText("Cargo generado:");
        Imprimir.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        tipo_pago1.setText("x");
        Imprimir.add(tipo_pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 120, -1));

        jLabel42.setText("Descuento:");
        Imprimir.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        descuento1.setText("x");
        Imprimir.add(descuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 100, -1));

        jLabel43.setText("Monto del pago:");
        Imprimir.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        monto_pago1.setText("x");
        Imprimir.add(monto_pago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 100, -1));

        jLabel44.setText("Total:");
        Imprimir.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        total1.setText("x");
        Imprimir.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 100, -1));

        jLabel45.setText("************************************************************************");
        Imprimir.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        pie_pagina1.setText("x");
        pie_pagina1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(pie_pagina1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 410, 30));

        jLabel46.setText("************************************************************************");
        Imprimir.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("DATOS DEL PAGO");
        Imprimir.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 260, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("DATOS DEL CLIENTE");
        Imprimir.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 944, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 478, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Thread() {
            public void run() {
                imprimir();
            }
        }.start();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void InformacionPago() {
        ticket_generado tg = new ticket_generado();
        Operador.setText(lo.getUsuario());
        folio_ticket.setText(String.valueOf(tg.getFolio_ticket()));
        folio_contrato1.setText(String.valueOf(tg.getFolio_contrato()));
        mes_pago.setText(tg.getMes());
        tipo_consumo.setText(tg.getConsumo());
        cargo_generado.setText(String.valueOf(tg.getImporte()));
        tipo_pago.setText(tg.getT_pago());
        descuento.setText(String.valueOf(tg.getPorcentaje()));
        monto_pago.setText(String.valueOf(tg.getPago()));
        total.setText(String.valueOf(tg.getTotal()));

        Operador1.setText(lo.getUsuario());
        folio_ticket1.setText(String.valueOf(tg.getFolio_ticket()));
        folio_contrato2.setText(String.valueOf(tg.getFolio_contrato()));
        mes_pago1.setText(tg.getMes());
        tipo_consumo1.setText(tg.getConsumo());
        cargo_generado1.setText(String.valueOf(tg.getImporte()));
        tipo_pago1.setText(tg.getT_pago());
        descuento1.setText(String.valueOf(tg.getPorcentaje()));
        monto_pago1.setText(String.valueOf(tg.getPago()));
        total1.setText(String.valueOf(tg.getTotal()));
    }

    private void InformacionEmpresa() {
        Empresa EMP = new Empresa();
        Empresa.setText(EMP.getRazon_social());
        S_a_c_v.setText(EMP.getSa());
        muniest.setText(EMP.getMunicipio() + ", " + EMP.getEstado());
        rfc.setText(EMP.getRFC());
        pie_pagina.setText("<html><center>" + EMP.getPie());

        Empresa1.setText(EMP.getRazon_social());
        S_a_c_v1.setText(EMP.getSa());
        muniest1.setText(EMP.getMunicipio() + ", " + EMP.getEstado());
        rfc1.setText(EMP.getRFC());
        pie_pagina1.setText("<html><center>" + EMP.getPie());
    }

    private void InformacionCliente(Cliente CL) {
        folio_cliente.setText(String.valueOf(CL.getFolio_cliente()));
        nombre.setText(CL.getNombre());
        domicilio.setText(CL.getResidencia());

        folio_cliente1.setText(String.valueOf(CL.getFolio_cliente()));
        nombre1.setText(CL.getNombre());
        domicilio1.setText(CL.getResidencia());
    }

    public void imprimir() {
        try {
            PrinterJob g = PrinterJob.getPrinterJob();
            g.setPrintable(this);
            boolean gl = g.printDialog();
            if (gl) {
                g.print();
            }
            JOptionPane.showMessageDialog(this, "Exito", "Impresion", JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | PrinterException e) {
            JOptionPane.showMessageDialog(this, "Error al imprimir", "Impresion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empresa;
    private javax.swing.JLabel Empresa1;
    private javax.swing.JPanel Imprimir;
    private javax.swing.JLabel Operador;
    private javax.swing.JLabel Operador1;
    private javax.swing.JLabel S_a_c_v;
    private javax.swing.JLabel S_a_c_v1;
    private javax.swing.JLabel cargo_generado;
    private javax.swing.JLabel cargo_generado1;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel descuento1;
    private javax.swing.JLabel domicilio;
    private javax.swing.JLabel domicilio1;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha1;
    private javax.swing.JLabel folio_cliente;
    private javax.swing.JLabel folio_cliente1;
    private javax.swing.JLabel folio_contrato1;
    private javax.swing.JLabel folio_contrato2;
    private javax.swing.JLabel folio_ticket;
    private javax.swing.JLabel folio_ticket1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mes_pago;
    private javax.swing.JLabel mes_pago1;
    private javax.swing.JLabel monto_pago;
    private javax.swing.JLabel monto_pago1;
    private javax.swing.JLabel muniest;
    private javax.swing.JLabel muniest1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel pie_pagina;
    private javax.swing.JLabel pie_pagina1;
    private javax.swing.JLabel rfc;
    private javax.swing.JLabel rfc1;
    private javax.swing.JLabel tipo_consumo;
    private javax.swing.JLabel tipo_consumo1;
    private javax.swing.JLabel tipo_pago;
    private javax.swing.JLabel tipo_pago1;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagefor, int Index) throws PrinterException {
        if (Index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D ar = (Graphics2D) graf;
        ar.translate(pagefor.getImageableX() * 50, pagefor.getImageableY() * 70);
        ar.scale(0.6, 0.6);
        Imprimir.printAll(graf);
        return PAGE_EXISTS;

    }
}
