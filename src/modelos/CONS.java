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

    public static final List<TipoElemento> TIPO_ELEMENTOS = new ArrayList<TipoElemento>() {
        {

        }
    };

    public static final List<Elemento> ELEMENTOS = new ArrayList<Elemento>();

    static {
        TIPO_ELEMENTOS.add(new TipoElemento()
                .setDescripcion("SERVICIO")
        );
        TIPO_ELEMENTOS.add(new TipoElemento()
                .setDescripcion("OBJETO")
        );
    }

    public static void add(TipoElemento tipoElemento) {
        TIPO_ELEMENTOS.add(tipoElemento);
    }

    public static void add(Elemento elemento) {
        ELEMENTOS.add(elemento);
    }

}
