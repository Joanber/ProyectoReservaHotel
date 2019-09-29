/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author MrRainx
 */
public class TipoElemento {

    private Integer ID;
    private String descripcion;

    public TipoElemento() {
    }

    public Integer getID() {
        return ID;
    }

    public TipoElemento setID(Integer ID) {
        this.ID = ID;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoElemento setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    @Override
    public String toString() {
        return "TipoElemento{" + "ID=" + ID + ", descripcion=" + descripcion + '}';
    }

}
