package br.com.elo7.explorando.marte.rest.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondasRS implements Serializable {

    private static final long serialVersionUID = 7053050358550611350L;

    private List<SondaRS> sondas;

    public List<SondaRS> getSondas() {
        return sondas;
    }

    public void setSondas(List<SondaRS> sondas) {
        this.sondas = sondas;
    }

}
