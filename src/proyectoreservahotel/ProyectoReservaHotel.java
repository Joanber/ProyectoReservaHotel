/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoreservahotel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import vista.CONS_VTNS;
import vista.habitaciones.VtnHabitaciones;

/**
 *
 * @author Skull
 */
public class ProyectoReservaHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //AQUI DAMOS ESTILO DE WINDOWS AL PROYECTO
        try {
            //AQUI DAMOS ESTILO DE WINDOWS AL PROYECTO
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            VtnHabitaciones vtn = CONS_VTNS.vtnHabitaciones;
            vtn.setLocationRelativeTo(null);
            vtn.setVisible(true);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ProyectoReservaHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
