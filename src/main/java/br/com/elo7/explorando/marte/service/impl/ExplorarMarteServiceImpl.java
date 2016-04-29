package br.com.elo7.explorando.marte.service.impl;

import br.com.elo7.explorando.marte.enums.InstrucoesEnum;
import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.model.SondasModel;
import br.com.elo7.explorando.marte.qualifiers.DireitaQualifier;
import br.com.elo7.explorando.marte.qualifiers.EsquerdaQualifier;
import br.com.elo7.explorando.marte.qualifiers.MoverQualifier;
import br.com.elo7.explorando.marte.service.DirecionarService;
import br.com.elo7.explorando.marte.service.ExplorarMarteService;
import br.com.elo7.explorando.marte.service.MoverService;

import javax.ejb.Remote;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
@Remote
public class ExplorarMarteServiceImpl implements ExplorarMarteService {

    @Inject
    @EsquerdaQualifier
    private DirecionarService direcionarEsquerdaService;

    @Inject
    @DireitaQualifier
    private DirecionarService direcionarDireitaService;

    @Inject
    @MoverQualifier
    private MoverService moverService;

    @Override
    public SondasModel explorarMarte(SondasModel sondas){
        definirCodigo(sondas);
        sondas.getSondas().stream().forEach(s -> explorar(s));
        removerSondaComandasParaMesmasCoordenadas(sondas);
        return sondas;
    }

    private SondaModel explorar(SondaModel sonda){

        sonda.getInstrucoes().stream().forEach(i -> {
            direcionar(i, sonda);
        });

        return sonda;
    }

    private void direcionar(InstrucoesEnum instrucao, SondaModel sonda){
        switch (instrucao) {
            case L:
                direcionarEsquerdaService.direcionar(sonda);
                break;
            case R:
                direcionarDireitaService.direcionar(sonda);
                break;
            case M:
                moverService.mover(sonda);
                break;
            default:
                break;
        }
    }

    private void removerSondaComandasParaMesmasCoordenadas(SondasModel sondas){
        List<SondaModel> sondasLista = sondas.getSondas();
        for(int i = 0; i < sondasLista.size(); i++){
            for(int j = 1; j < sondasLista.size(); j++){
                if(sondasLista.get(i).getCodigo().compareTo(sondasLista.get(j).getCodigo()) != 0 &&
                   sondasLista.get(i).getCoordenadaX().compareTo(sondasLista.get(j).getCoordenadaX()) == 0 &&
                   sondasLista.get(i).getCoordenadaY().compareTo(sondasLista.get(j).getCoordenadaY()) == 0){
                    sondasLista.remove(j);
                }
            }
        }
    }

    private void definirCodigo(SondasModel sondasModel){
        List<SondaModel> sondas = sondasModel.getSondas();
        for(int i = 0; i < sondas.size(); i++){
            sondas.get(i).setCodigo(i + 1);
        }
    }

}
