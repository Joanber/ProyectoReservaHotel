/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Skull
 */
public class Cliente {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String contraseña;

    public Cliente() {
    }

    public String getCedula() {
        return cedula;
    }

    public Cliente setCedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public String getNombres() {
        return nombres;
    }

    public Cliente setNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cliente setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public String getCorreo() {
        return correo;
    }

    public Cliente setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Cliente setContraseña(String contraseña) {
        this.contraseña = contraseña;
        return this;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }

    public String infoTextArea() {
        return "Datos del Cliente: \n\n"
                + "Cedula: \n"
                + "  " + cedula + "\n"
                + "Nombres: \n"
                + "  " + nombres + "\n"
                + "Apellidos: \n"
                + "  " + apellidos + "\n"
                + "Correo: \n"
                + "  " + correo + "\n";
    }

}
