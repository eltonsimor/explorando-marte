package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.qualifiers.EsquerdaQualifier;
import br.com.elo7.explorando.marte.service.DirecionarService;
import br.com.elo7.explorando.marte.enums.DirecaoEnum;

import javax.inject.Named;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Named
@EsquerdaQualifier
public class DirecionarEsquerdaServiceImpl implements DirecionarService {

    @Override
    public SondaModel direcionar(SondaModel sonda) {

        switch (sonda.getDirecao()){
            case N:
                sonda.setDirecao(DirecaoEnum.W);
                return sonda;
            case W:
                sonda.setDirecao(DirecaoEnum.S);
                return sonda;
            case S:
                sonda.setDirecao(DirecaoEnum.E);
                return sonda;
            case E:
                sonda.setDirecao(DirecaoEnum.N);
                return sonda;
            default:
                return sonda;
        }
    }
}
