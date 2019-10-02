/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author MrRainx
 */
public class CONS {

    public static final List<Elemento> ELEMENTOS = new ArrayList<Elemento>();

    public static final List<Habitacion> HABITACIONES = new ArrayList<>();

    static {

        Elemento cama = new Elemento()
                .setNombre("Cama")
                .setPrecio(20.0)
                .setTipoElemento("OBJETO");

        Elemento refrigerador = new Elemento()
                .setNombre("Refrigerador")
                .setPrecio(30.0)
                .setTipoElemento("OBJETO");

        Elemento baño = new Elemento()
                .setNombre("Baño")
                .setPrecio(10.0)
                .setTipoElemento("OBJETO");

        Elemento telefono = new Elemento()
                .setNombre("Telefono")
                .setPrecio(10.0)
                .setTipoElemento("OBJETO");

        ELEMENTOS.add(cama);
        ELEMENTOS.add(refrigerador);
        ELEMENTOS.add(baño);
        ELEMENTOS.add(telefono);

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setDescripcion("PRUEBA 1")
                .setEstado("RESERVADA")
                .setElementos(new ArrayList<>(ELEMENTOS));

        Habitacion habitacion2 = new Habitacion();
        habitacion2.setDescripcion("PRUEBA 2")
                .setEstado("DISPONIBLE")
                .setElementos(new ArrayList<>(ELEMENTOS));

        Habitacion habitacion3 = new Habitacion();
        habitacion3.setDescripcion("PRUEBA 3")
                .setEstado("DISPONIBLE")
                .setElementos(new ArrayList<>(ELEMENTOS));

        Habitacion habitacion4 = new Habitacion();
        habitacion4.setDescripcion("PRUEBA 4")
                .setEstado("DISPONIBLE")
                .setElementos(new ArrayList<>(ELEMENTOS));

        Habitacion habitacion5 = new Habitacion();
        habitacion5.setDescripcion("PRUEBA 5")
                .setEstado("DISPONIBLE")
                .setElementos(new ArrayList<>(ELEMENTOS));

        add(habitacion1);
        add(habitacion2);
        add(habitacion3);
        add(habitacion4);
        add(habitacion5);

    }

    public static void add(Elemento elemento) {
        ELEMENTOS.add(elemento);
    }

    public static void add(Habitacion habitacion) {
        HABITACIONES.add(habitacion.setNumero(HABITACIONES.size() + 1));
    }

    public static List<Habitacion> getHabitacionesByEstado(String estado) {
        return HABITACIONES.stream()
                .filter(item -> item.getEstado().equals(estado))
                .collect(Collectors.toList());
    }

}
