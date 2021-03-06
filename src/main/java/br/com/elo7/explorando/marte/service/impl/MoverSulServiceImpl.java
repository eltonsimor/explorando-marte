package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.qualifiers.SulQualifier;
import br.com.elo7.explorando.marte.service.MoverService;
import br.com.elo7.explorando.marte.util.ExplorarUtil;

import javax.inject.Named;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Named
@SulQualifier
public class MoverSulServiceImpl implements MoverService {

    @Override
    public SondaModel mover(SondaModel sonda) {
        Integer coordenadaY = sonda.getCoordenadaY();
        sonda.setCoordenadaY(ExplorarUtil.subtrairCoordenada(coordenadaY));
        return sonda;
    }
}
