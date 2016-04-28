package br.com.elo7.explorando.marte.rest.request;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondasRQ implements Serializable {

    private static final long serialVersionUID = -1854572634735648961L;

    @Valid
    private List<SondaRQ> sondas;

    public List<SondaRQ> getSondas() {
        return sondas;
    }

    public void setSondas(List<SondaRQ> sondas) {
        this.sondas = sondas;
    }
}
