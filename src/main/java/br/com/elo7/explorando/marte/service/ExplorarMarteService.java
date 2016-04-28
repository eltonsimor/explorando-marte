package br.com.elo7.explorando.marte.service;

import br.com.elo7.explorando.marte.exception.ExplorandoMarteException;
import br.com.elo7.explorando.marte.model.SondasModel;

import javax.ejb.Local;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Local
public interface ExplorarMarteService {

    SondasModel explorarMarte(SondasModel sonda) throws ExplorandoMarteException;

}
