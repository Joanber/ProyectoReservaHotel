/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Hotel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelos.CONS;
import modelos.Habitacion;
import vista.Principal.VtnPrincipal;

/**
 *
 * @author Skull
 */
public class VtnHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Habitacion
     */
    private final VtnPrincipal desktop;
     private DefaultTableModel table;
     private List<Habitacion> habitaciones;
    public VtnHabitaciones(VtnPrincipal desktop) {
        this.desktop=desktop;
        initComponents();
        Init();
    }

    private void Init() {
        table = (DefaultTableModel) tbHabitaciones.getModel();
        cargarTabla();
    }
     public void cargarTabla() {
       habitaciones=CONS.HABITACIONES;
        table.setRowCount(0);
        for (Habitacion habitacion : habitaciones) {
            table.addRow(new Object[]{
                habitacion.getNumero(),
                habitacion.getDescripcion(),
                habitacion.getPrecio(),
                habitacion.getEstado(),
                habitacion.getElementosAll()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHabitaciones = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HABITACIONES");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tbHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° ", "Descripción", "Precio", "Estado", "Detalle Elementos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHabitaciones.getTableHeader().setResizingAllowed(false);
        tbHabitaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbHabitaciones);
        if (tbHabitaciones.getColumnModel().getColumnCount() > 0) {
            tbHabitaciones.getColumnModel().getColumn(0).setMinWidth(25);
            tbHabitaciones.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbHabitaciones.getColumnModel().getColumn(0).setMaxWidth(25);
            tbHabitaciones.getColumnModel().getColumn(1).setMinWidth(100);
            tbHabitaciones.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbHabitaciones.getColumnModel().getColumn(1).setMaxWidth(100);
            tbHabitaciones.getColumnModel().getColumn(2).setMinWidth(40);
            tbHabitaciones.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbHabitaciones.getColumnModel().getColumn(2).setMaxWidth(40);
            tbHabitaciones.getColumnModel().getColumn(3).setMinWidth(100);
            tbHabitaciones.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbHabitaciones.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jButton3.setText("Eliminar");

        jButton4.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 570, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmHabitaciones frm = new frmHabitaciones(desktop, null);
        this.desktop.desk.add(frm);
        frm.show();
    }//GEN-LAST:event_btnNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHabitaciones;
    // End of variables declaration//GEN-END:variables
}
