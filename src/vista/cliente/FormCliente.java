/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.cliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.CONS_CLIENTE;
import modelos.Cliente;
import modelos.VALIDACIONCedula;
import vista.Principal.VtnPrincipal;

/**
 *
 * @author Skull
 */
public class FormCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormCliente
     */
    private Cliente cliente;
    private final VtnPrincipal desktop;
    private ArrayList<Cliente> clientes;

    public FormCliente(VtnPrincipal desktop, Cliente cliente) {
        this.desktop = desktop;
        this.cliente = cliente;
        initComponents();
        clientes = new ArrayList<>();
        cargarClienteArr();
    }

    public Cliente obtenerCliente() {
        Cliente cl = new Cliente();
        cl.setCedula(txtCedula.getText());
        cl.setApellidos(txtApellidos.getText());
        cl.setNombres(txtNombres.getText());
        cl.setCorreo(txtEmail.getText());
        cl.setContraseña(txtContraseña.getText());
        return cl;
    }

    private void cargarClienteArr() {
        if (cliente != null) {
            txtCedula.setEnabled(false);
            txtCedula.setText(cliente.getCedula());
            txtNombres.setText(cliente.getNombres());
            txtApellidos.setText(cliente.getApellidos());
            txtEmail.setText(cliente.getCorreo());
            txtContraseña.setText(cliente.getContraseña());
            txtConfirmarContraseña.setText(cliente.getContraseña());
        }
    }

    /**
     *
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        txtConfirmarContraseña = new javax.swing.JPasswordField();
        txtContraseña = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRARSE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 432, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Cedula:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 84, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Nombres:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 121, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Apellidos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 158, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 197, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 83, 176, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 120, 176, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 157, 176, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 233, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Confirmar contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 267, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 196, 176, -1));

        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 329, 176, -1));

        lblContraseña.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(102, 51, 0));
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 295, 208, 16));
        getContentPane().add(txtConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 266, 176, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, 176, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        if (txtCedula.getText().equals("") || txtApellidos.getText().equals("") || txtNombres.getText().equals("")
                || txtEmail.getText().equals("") || txtContraseña.getText().equals("") || txtConfirmarContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campos Vacios", "Aviso", JOptionPane.ERROR_MESSAGE);
        } else {

            if (txtContraseña.getText().equalsIgnoreCase(txtConfirmarContraseña.getText())) {
                if (VALIDACIONCedula.validadorDeCedula(txtCedula.getText()) == true) {

                    if (cliente == null) {
                        CONS_CLIENTE.clientes.add(obtenerCliente());
                    } else {
                        Cliente client = null;
                        for (Cliente cli : CONS_CLIENTE.clientes) {
                            if (cli.getCedula().equals(cliente.getCedula())) {
                                System.out.println(cliente.getCedula());
                                client = cli;
                            }
                        }
                        if (client != null) {
                            client.setCedula(txtCedula.getText());
                            client.setNombres(txtNombres.getText());
                            client.setApellidos(txtApellidos.getText());
                            client.setCorreo(txtEmail.getText());
                            client.setContraseña(txtContraseña.getText());
                        }
                    }
                    this.dispose();
                    VtnClientes vtn = new VtnClientes(desktop);
                    this.desktop.desk.add(vtn);
                    vtn.show();
                } else {
                    JOptionPane.showMessageDialog(this, "CEDULA INCORRECTA", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                lblContraseña.setText("Las contraseñas no son iguales");
            }

        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtConfirmarContraseña;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
