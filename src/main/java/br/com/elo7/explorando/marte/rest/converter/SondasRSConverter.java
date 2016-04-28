package br.com.elo7.explorando.marte.rest.converter;

import br.com.elo7.explorando.marte.model.SondasModel;
import br.com.elo7.explorando.marte.rest.response.SondaRS;
import br.com.elo7.explorando.marte.rest.response.SondasRS;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondasRSConverter implements Serializable {

    private static final long serialVersionUID = -3524875780194433754L;

    public static final SondasRS converter(SondasModel sondasModel){
        SondasRS sondasRS = new SondasRS();
        sondasRS.setSondas(new ArrayList<>());

        if(sondasModel != null){
            sondasModel.getSondas().stream().forEach(s -> {
                SondaRS sondaRS = new SondaRS();
                sondaRS.setCoordenadaX(s.getCoordenadaX());
                sondaRS.setCoordenadaY(s.getCoordenadaY());
                sondaRS.setDirecao(s.getDirecao());
                sondaRS.setCodigo(s.getCodigo());
                sondasRS.getSondas().add(sondaRS);
            });
        }

        return sondasRS;
    }
}
