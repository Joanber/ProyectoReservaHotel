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
public class Elemento {

    private String nombre;
    private Double precio;
    private TipoElemento tipoElemento;

    public Elemento() {
    }

    public String getNombre() {
        return nombre;
    }

    public Elemento setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Double getPrecio() {
        return precio;
    }

    public Elemento setPrecio(Double precio) {
        this.precio = precio;
        return this;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }

    public Elemento setTipoElemento(TipoElemento tipoElemento) {
        this.tipoElemento = tipoElemento;
        return this;
    }

}
