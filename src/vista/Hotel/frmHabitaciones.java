/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Hotel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelos.CONS;
import modelos.Elemento;
import modelos.Habitacion;
import vista.Principal.VtnPrincipal;

/**
 *
 * @author Skull
 */
public class frmHabitaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmHabitaciones
     */
    private Habitacion habitacion;
    private final VtnPrincipal desktop;
    private ArrayList<Habitacion> habitaciones;
    ArrayList arrayElementos = new ArrayList();
    DefaultListModel modeloElementos;

    public frmHabitaciones(VtnPrincipal desktop, Habitacion habitacion) {
        this.habitacion = habitacion;
        this.desktop = desktop;
        initComponents();
        spnNumero.setValue(CONS.HABITACIONES.size()+1);
        spnNumero.setEnabled(false);
        cargarHabitacionArr();
    }

    private Habitacion obtenerHabitacion() {
        Habitacion habit = new Habitacion();
        habit.setDescripcion(txtDescripcion.getText());
        habit.setPrecio(Double.parseDouble(txtPrecio.getText()));
        habit.setEstado(cmbEstado.getSelectedItem().toString());
        habit.setElementos(ObtenerElementos());
        return habit;
    }

    private List<Elemento> ObtenerElementos() {
        List<Elemento> listaElementos = new ArrayList<>();
        Elemento elemento = null;
        for (int i = 0; i < listElementos.getModel().getSize(); i++) {
            if (listElementos.getModel().getSize() > 0) {
                elemento = new Elemento();
                String obtenerItem = listElementos.getModel().getElementAt(i);
                String[] cortarItem = obtenerItem.split(" : ");
                String nombre = cortarItem[0];
                elemento.setNombre(nombre);
                String precio = cortarItem[1];
                elemento.setPrecio(Double.parseDouble(precio));
                String tipo = cortarItem[2];
                elemento.setTipoElemento(tipo);
                listaElementos.add(elemento);
            }
        }
        return listaElementos;
    }
    
    private void cargarHabitacionArr(){
        if(habitacion!=null){
            modeloElementos =new DefaultListModel();
            
            spnNumero.setValue(habitacion.getNumero());
            txtDescripcion.setText(habitacion.getDescripcion());
            txtPrecio.setText(String.valueOf(habitacion.getPrecio()));
            cmbEstado.setSelectedItem(habitacion.getEstado());
            System.out.println(habitacion.getEstado());
            for (Elemento elemento :habitacion.getElementos()) {
                modeloElementos.addElement(elemento.getNombre()+" : "+elemento.getPrecio()+" : "+elemento.getTipoElemento());
                arrayElementos.add(elemento.getNombre()+" : "+elemento.getPrecio()+" : "+elemento.getTipoElemento());
            }
            listElementos.setModel(modeloElementos);
        }
    }
    
    private void agregarListElementos() {
        modeloElementos = new DefaultListModel();
        if (txtNombre.getText().equals("") || txtPrecioElemento.getText().equals("")
                || txtPrecioElemento.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campos vacios de elementos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (arrayElementos.contains(txtNombre.getText())) {
                JOptionPane.showMessageDialog(this, "Elemento ya añadido", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayElementos.add(txtNombre.getText() + " : " + txtPrecioElemento.getText()
                        + " : " + cmbTipo.getSelectedItem().toString());
                for (int i = 0; i < arrayElementos.size(); i++) {
                    modeloElementos.addElement(arrayElementos.get(i));
                }
                listElementos.setModel(modeloElementos);
                limpiarCampos();
            }
        }

    }
    private void eliminarItemList(){
        try {
                String indice;
                if(listElementos.getSelectedIndex()==-1){
                    JOptionPane.showMessageDialog(this,"Seleccione el elemneto a quitar", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }else{
                    indice=listElementos.getSelectedValue();
                    modeloElementos.removeElement(indice);
                    arrayElementos.remove(indice);
                    listElementos.setModel(modeloElementos);
                    recargarElementosList();
                }
        } catch (Exception e) {
        }
    }

    private void recargarElementosList(){
        modeloElementos.removeAllElements();
        for (int i = 0; i < arrayElementos.size(); i++) {
           modeloElementos.addElement(arrayElementos.get(i));
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPrecioElemento.setText("");
        cmbTipo.setSelectedIndex(0);
    }

    private void irVtnHabitaciones() {
        this.dispose();
        VtnHabitaciones vtn = new VtnHabitaciones(desktop);
        this.desktop.desk.add(vtn);
        vtn.show();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnNumero = new javax.swing.JSpinner();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecioElemento = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        bntAgregarElemento = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listElementos = new javax.swing.JList<>();
        BtnQuitar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE HABITACIÓN");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("N° habitación:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Descripción:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "RESERVADA", "MANTENIMIENTO" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Elementos de la habitación");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Tipo:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Precio:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecioElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioElementoActionPerformed(evt);
            }
        });

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OBJETO", "SERVICIO" }));

        bntAgregarElemento.setText("Agregar ");
        bntAgregarElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarElementoActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar Habitacion");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listElementos);

        BtnQuitar.setText("Quitar");
        BtnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtPrecioElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnQuitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntAgregarElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPrecioElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntAgregarElemento)
                            .addComponent(BtnQuitar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnguardar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioElementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioElementoActionPerformed

    private void bntAgregarElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarElementoActionPerformed
        // TODO add your handling code here:
        agregarListElementos();
    }//GEN-LAST:event_bntAgregarElementoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (txtDescripcion.getText().equals("") || txtPrecio.getText().equals("")
                || spnNumero.getValue().equals("0") || listElementos.getModel().getSize() < 1) {
            JOptionPane.showMessageDialog(this, "Campos vacios y/o sin elementos", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {
            if (habitacion==null) {
            CONS.add(obtenerHabitacion());
            } else {
                Habitacion habitacionn=null;
                for(Habitacion hab:CONS.HABITACIONES){
                    if (hab.getNumero().equals(habitacion.getNumero())) {
                        habitacionn=hab;
                    }
                }
                if (habitacionn!=null) {
                    habitacionn.setDescripcion(txtDescripcion.getText());
                    habitacionn.setPrecio(Double.parseDouble(txtPrecio.getText()));
                    habitacionn.setEstado(cmbEstado.getSelectedItem().toString());
                    habitacionn.setElementos(ObtenerElementos());
                }
            }
            irVtnHabitaciones();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void BtnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuitarActionPerformed
        // TODO add your handling code here:
        eliminarItemList();
    }//GEN-LAST:event_BtnQuitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnQuitar;
    private javax.swing.JButton bntAgregarElemento;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbTipo;
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
    private javax.swing.JList<String> listElementos;
    private javax.swing.JSpinner spnNumero;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioElemento;
    // End of variables declaration//GEN-END:variables
}
