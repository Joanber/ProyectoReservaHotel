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

    private String descripcion;
    private ArrayList<TipoElemento> lista;
    

    public ArrayList<TipoElemento> getLista() {
        return lista;
    }

    public void setLista(ArrayList<TipoElemento> lista) {
        this.lista = lista;
    }

    public TipoElemento() {
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
        return "TipoElemento{ descripcion=" + descripcion + '}';
    }

}
