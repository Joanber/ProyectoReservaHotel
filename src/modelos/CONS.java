/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrRainx
 */
public class CONS {

    public static List<TipoElemento> tipoElementos = new ArrayList<TipoElemento>() {
        {
            add(new TipoElemento()
                    .setID(this.size())
                    .setDescripcion("SERVICIO")
            );
            add(new TipoElemento()
                    .setID(this.size())
                    .setDescripcion("OBJETO")
            );
        }
    };

    public static List<Elemento> elementos = new ArrayList<Elemento>() {
        {
            add(new Elemento());
        }
    };

    public static void addTipoElemento(TipoElemento tipoElemento) {
        tipoElementos.add(
                tipoElemento.setID(tipoElementos.size())
        );
    }

    public static void addElemento(Elemento elemento) {
        elementos.add(
                elemento.setID(elementos.size())
        );
    }

}
