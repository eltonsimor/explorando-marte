package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.enums.DirecaoEnum;
import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.qualifiers.DireitaQualifier;
import br.com.elo7.explorando.marte.service.DirecionarService;

import javax.inject.Named;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Named
@DireitaQualifier
public class DirecionarDireitaServiceImpl implements DirecionarService {

    @Override
    public SondaModel direcionar(SondaModel sonda){

        switch (sonda.getDirecao()){
            case N:
                sonda.setDirecao(DirecaoEnum.E);
                return sonda;
            case E:
                sonda.setDirecao(DirecaoEnum.S);
                return sonda;
            case S:
                sonda.setDirecao(DirecaoEnum.W);
                return sonda;
            case W:
                sonda.setDirecao(DirecaoEnum.N);
                return sonda;
            default:
                return sonda;
        }
    }
}
