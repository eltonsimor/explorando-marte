package br.com.elo7.explorando.marte.service;

import br.com.elo7.explorando.marte.exception.ExplorandoMarteException;
import br.com.elo7.explorando.marte.model.SondaModel;

import javax.ejb.Local;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Local
public interface DirecionarService {

    SondaModel direcionar(SondaModel sonda);
}
