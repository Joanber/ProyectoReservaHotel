package vista.Principal;

import vista.Hotel.FrmElementosHabitacion;
import vista.Hotel.FrmHabitacion;
import vista.Hotel.FrmTipoElemento;




/**
 *
 * @author Skull
 */
public class VtnPrincipal extends javax.swing.JFrame {

    public VtnPrincipal() {
        initComponents();
        this.setTitle("Sistema de Reserva de Habitaciones");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnReservaciones = new javax.swing.JButton();
        btnHabitaciones = new javax.swing.JButton();
        btnElementosH = new javax.swing.JButton();
        btnTipoElemento = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desk.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1004, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        btnReservaciones.setBackground(new java.awt.Color(204, 255, 204));
        btnReservaciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnReservaciones.setForeground(new java.awt.Color(0, 0, 51));
        btnReservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/Bed_48px.png"))); // NOI18N
        btnReservaciones.setText("Reservarciones");
        btnReservaciones.setToolTipText("Registrar Persona");
        btnReservaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReservaciones.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservacionesActionPerformed(evt);
            }
        });

        btnHabitaciones.setBackground(new java.awt.Color(204, 255, 204));
        btnHabitaciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnHabitaciones.setForeground(new java.awt.Color(0, 0, 51));
        btnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/Door_48px.png"))); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.setToolTipText("Registrar Persona");
        btnHabitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHabitaciones.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnElementosH.setBackground(new java.awt.Color(204, 255, 204));
        btnElementosH.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnElementosH.setForeground(new java.awt.Color(0, 0, 51));
        btnElementosH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/Armchair_48px.png"))); // NOI18N
        btnElementosH.setText(" Elementos H");
        btnElementosH.setToolTipText("Registrar Persona");
        btnElementosH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElementosH.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnElementosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElementosHActionPerformed(evt);
            }
        });

        btnTipoElemento.setBackground(new java.awt.Color(204, 255, 204));
        btnTipoElemento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnTipoElemento.setForeground(new java.awt.Color(0, 0, 51));
        btnTipoElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/Interior_48px.png"))); // NOI18N
        btnTipoElemento.setText("Tipo Elemento");
        btnTipoElemento.setToolTipText("Registrar Persona");
        btnTipoElemento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTipoElemento.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnTipoElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoElementoActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(204, 255, 204));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 51));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/clientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setToolTipText("Registrar Persona");
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnElementosH, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTipoElemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnElementosH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTipoElemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desk))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservacionesActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnReservacionesActionPerformed

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        // TODO add your handling code here:
        FrmHabitacion frm=new FrmHabitacion();
        this.desk.add(frm);
        frm.show();
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnElementosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElementosHActionPerformed
        // TODO add your handling code here:
        FrmElementosHabitacion frm=new FrmElementosHabitacion();
        this.desk.add(frm);
        frm.show();
    }//GEN-LAST:event_btnElementosHActionPerformed

    private void btnTipoElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoElementoActionPerformed
        // TODO add your handling code here:
        FrmTipoElemento frm=new FrmTipoElemento();
        this.desk.add(frm);
        frm.show();
    }//GEN-LAST:event_btnTipoElementoActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnElementosH;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnReservaciones;
    private javax.swing.JButton btnTipoElemento;
    public javax.swing.JDesktopPane desk;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
