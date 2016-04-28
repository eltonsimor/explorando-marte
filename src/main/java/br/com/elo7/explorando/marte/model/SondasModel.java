package br.com.elo7.explorando.marte.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondasModel implements Serializable {

    private static final long serialVersionUID = -8633609091485823429L;

    private List<SondaModel> sondas;

    public List<SondaModel> getSondas() {
        return sondas;
    }

    public void setSondas(List<SondaModel> sondas) {
        this.sondas = sondas;
    }

}
