package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.qualifiers.*;
import br.com.elo7.explorando.marte.service.MoverService;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Named
@MoverQualifier
public class MoverServiceImpl implements MoverService {

    @Inject
    @NorteQualifier
    private MoverService moverNorteService;

    @Inject
    @SulQualifier
    private MoverService moverSulService;

    @Inject
    @LesteQualifier
    private MoverService moverLesteService;

    @Inject
    @OesteQualifier
    private MoverService moverOesteService;

    @Override
    public SondaModel mover(SondaModel sonda) {

        switch (sonda.getDirecao()){
            case N:
                moverNorteService.mover(sonda);
                return sonda;
            case S:
                moverSulService.mover(sonda);
                return sonda;
            case W:
                moverOesteService.mover(sonda);
                return sonda;
            case E:
                moverLesteService.mover(sonda);
                return sonda;
            default:
                return sonda;
        }
    }

}
