/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author MrRainx
 */
public class TipoElemento {

    private Integer ID;
    private String descripcion;
    private ArrayList<TipoElemento> lista;
    public TipoElemento(Integer ID, String descripcion) {
        this.ID = ID;
        this.descripcion = descripcion;
    }

    public ArrayList<TipoElemento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<TipoElemento> lista) {
        this.lista = lista;
    }

    public TipoElemento() {
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoElemento{" + "ID=" + ID + ", descripcion=" + descripcion + '}';
    }

}
