/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author MrRainx
 */
public class Habitacion {

    private Integer numero;
    private String descripcion;
    private String estado;
    private Double precio;

    private List<Elemento> elementos;

    public Habitacion() {
    }

    public Integer getNumero() {
        return numero;
    }

    public Habitacion setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Habitacion setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Habitacion setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public Double getPrecio() {

        this.precio = this.elementos
                .stream()
                .map(c -> c.getPrecio())
                .reduce(Double::sum)
                .orElse(0.0);

        return this.precio;
    }

    public Habitacion setPrecio(Double precio) {
        this.precio = precio;
        return this;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public Habitacion setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
        return this;
    }

}
