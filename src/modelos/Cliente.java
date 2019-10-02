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

    public Cliente(String cedula, String nombres, String apellidos, String correo, String contraseña) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
   
    
}
