/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

public class CONS_CLIENTE {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static List<Reserva> reservas = new ArrayList<>();

    static {
        Cliente cliente = new Cliente();
        cliente.setCedula("0102030405")
                .setNombres("Nombre Prueba")
                .setApellidos("Apellidos Prueba")
                .setCorreo("correo@correo.com")
                .setContraseña("1234");
        clientes.add(cliente);
        Cliente ADMIN = new Cliente();
        ADMIN.setCedula("ADMIN")
                .setNombres("ADMINISTRADOR")
                .setApellidos("ADMINISTRADOR")
                .setCorreo("correo@correo.com")
                .setContraseña("ADMIN");
        clientes.add(ADMIN);

        Reserva reserva = new Reserva();

        reserva.setFechaHora();
        reserva.setMetodoPago("EFECTIVO");
        reserva.setHabitacion(CONS.HABITACIONES.get(0));
        reserva.setCliente(cliente);

        reservas.add(reserva);

    }

    public static Cliente login(String cedula, String password) {

        return clientes.stream()
                .filter(cliente -> cliente.getCedula().equals(cedula)
                && cliente.getContraseña().equals(password)
                ).findFirst()
                .orElse(null);

    }

}
