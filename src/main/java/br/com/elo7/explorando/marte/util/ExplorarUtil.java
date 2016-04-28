package br.com.elo7.explorando.marte.util;

import java.io.Serializable;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public abstract class ExplorarUtil implements Serializable {

    private static final long serialVersionUID = 4789033840452639497L;

    public static final Integer somarCoordenada(Integer coordenada) {
        return ((coordenada < 0) ? 0 : coordenada + 1);
    }

    public static final Integer subtrairCoordenada(Integer coordenada){
        return ((coordenada - 1 < 0) ? 0 : coordenada - 1);
    }
}
