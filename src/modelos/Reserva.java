/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MrRainx
 */
public class Reserva {

    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private String metodoPago;

    public Reserva() {
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Reserva setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        return this;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Reserva setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Reserva setFecha(LocalDate fecha) {
        this.fecha = fecha;
        return this;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Reserva setHora(LocalTime hora) {
        this.hora = hora;
        return this;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public Reserva setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
        return this;
    }

    public Reserva setFechaHora() {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        return this;
    }

    public String getFechaHora() {
        return this.fecha.toString() + " / " + this.hora.toString();
    }

}
