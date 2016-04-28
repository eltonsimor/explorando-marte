package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.qualifiers.OesteQualifier;
import br.com.elo7.explorando.marte.service.MoverService;
import br.com.elo7.explorando.marte.util.ExplorarUtil;

import javax.inject.Named;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Named
@OesteQualifier
public class MoverOesteServiceImpl implements MoverService {

    @Override
    public SondaModel mover(SondaModel sonda) {
        Integer coordenadaX = sonda.getCoordenadaX();
        sonda.setCoordenadaX(ExplorarUtil.subtrairCoordenada(coordenadaX));
        return sonda;
    }

}
