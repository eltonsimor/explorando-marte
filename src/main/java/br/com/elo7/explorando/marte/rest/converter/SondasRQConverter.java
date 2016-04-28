package br.com.elo7.explorando.marte.rest.converter;

import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.model.SondasModel;
import br.com.elo7.explorando.marte.rest.request.SondasRQ;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondasRQConverter implements Serializable {

    private static final long serialVersionUID = -3816824219834961490L;

    public static final SondasModel converter(SondasRQ sondasRQ){
        SondasModel sondasModel = new SondasModel();
        sondasModel.setSondas(new ArrayList<>());

        if(sondasModel != null){
            sondasRQ.getSondas().stream().forEach(s -> {
                SondaModel sonda = new SondaModel();
                sonda.setDirecao(s.getDirecao());
                sonda.setCoordenadaX(s.getCoordenadaX());
                sonda.setCoordenadaY(s.getCoordenadaY());
                sonda.setInstrucoes(s.getInstrucoes());
                sondasModel.getSondas().add(sonda);
            });
        }

        return sondasModel;
    }
}
