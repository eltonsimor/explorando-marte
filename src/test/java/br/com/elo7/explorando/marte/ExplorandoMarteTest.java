package br.com.elo7.explorando.marte;

import br.com.elo7.explorando.marte.enums.DirecaoEnum;
import br.com.elo7.explorando.marte.model.SondaModel;
import br.com.elo7.explorando.marte.service.DirecionarService;
import br.com.elo7.explorando.marte.service.MoverService;
import br.com.elo7.explorando.marte.service.impl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class ExplorandoMarteTest {

    private MoverService moverNorteService;
    private MoverService moverSulService;
    private MoverService moverLesteService;
    private MoverService moverOesteService;
    private DirecionarService direcionarEsquerdaService;
    private DirecionarService direcionarDireitaService;

    @Before
    public void init(){
        moverNorteService = new MoverNorteServiceImpl();
        moverSulService = new MoverSulServiceImpl();
        moverLesteService = new MoverLesteServiceImpl();
        moverOesteService = new MoverOesteServiceImpl();
        direcionarDireitaService = new DirecionarDireitaServiceImpl();
        direcionarEsquerdaService = new DirecionarEsquerdaServiceImpl();
    }

    @Test
     public final void moverParaNorte(){
        SondaModel sondaPosicaoInicial = mockSondaDirecionadoNorte();
        SondaModel sondaPosicaoFinal = mockSondaDirecionadoNorte();
        moverNorteService.mover(sondaPosicaoFinal);
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaY() > sondaPosicaoInicial.getCoordenadaY());
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaX() == sondaPosicaoInicial.getCoordenadaX());
    }

    @Test
    public final void moverParaLeste(){
        SondaModel sondaPosicaoInicial = mockSondaDirecionadoLeste();
        SondaModel sondaPosicaoFinal = mockSondaDirecionadoLeste();
        moverLesteService.mover(sondaPosicaoFinal);
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaX() > sondaPosicaoInicial.getCoordenadaX());
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaY() == sondaPosicaoInicial.getCoordenadaY());
    }

    @Test
    public final void moverParaSul(){
        SondaModel sondaPosicaoInicial = mockSondaDirecionadoSul();
        SondaModel sondaPosicaoFinal = mockSondaDirecionadoSul();
        moverSulService.mover(sondaPosicaoFinal);
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaY() < sondaPosicaoInicial.getCoordenadaY());
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaX() == sondaPosicaoInicial.getCoordenadaX());
    }

    @Test
    public final void moverParaOeste(){
        SondaModel sondaPosicaoInicial = mockSondaDirecionadoOeste();
        SondaModel sondaPosicaoFinal = mockSondaDirecionadoOeste();
        moverOesteService.mover(sondaPosicaoFinal);
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaX() < sondaPosicaoInicial.getCoordenadaX());
        Assert.assertTrue(sondaPosicaoFinal.getCoordenadaY() == sondaPosicaoInicial.getCoordenadaY());
    }

    @Test
    public final void moverParaNorteCoordenadaNegativa(){
        SondaModel sonda = mockSondaDirecionadoNorteCoordenadaNegativa();
        moverNorteService.mover(sonda);
        Assert.assertTrue(sonda.getCoordenadaY().equals(0));
    }

    @Test
    public final void moverParaSulCoordenadaNegativa(){
        SondaModel sonda = mockSondaDirecionadoSulCoordenadaNegativa();
        moverSulService.mover(sonda);
        Assert.assertTrue(sonda.getCoordenadaY().equals(0));
    }

    @Test
    public final void moverParaLesteCoordenadaNegativa(){
        SondaModel sonda = mockSondaDirecionadoLesteCoordenadaNegativa();
        moverLesteService.mover(sonda);
        Assert.assertTrue(sonda.getCoordenadaX().equals(0));
    }

    @Test
    public final void moverParaOesteCoordenadaNegativa(){
        SondaModel sonda = mockSondaDirecionadoOesteCoordenadaNegativa();
        moverOesteService.mover(sonda);
        Assert.assertTrue(sonda.getCoordenadaX().equals(0));
    }

    @Test
    public final void direcionarNorteParaLeste() {
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.N);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.E);
    }

    @Test
    public final void direcionarNorteParaOeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.N);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(),DirecaoEnum.W);
    }

    @Test
    public final void direcionarOesteParaNorte(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.W);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.N);
    }

    @Test
    public final void direcionarOesteParaSul(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.W);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.S);
    }

    @Test
    public final void direcionarSulParaOeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.S);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.W);

    }

    @Test
    public final void direcionarSulParaLeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.S);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.E);
    }

    @Test
    public final void direcionarLesteParaSul(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.E);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.S);
    }

    @Test
    public final void direcionarLesteParaNorte(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.E);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.N);
    }

    @Test
    public final void direcionarNorteParaSul(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.N);
        direcionarDireitaService.direcionar(sonda);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.S);
    }

    @Test
    public final void direcionarSulParaNorte(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.S);
        direcionarEsquerdaService.direcionar(sonda);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.N);
    }

    @Test
    public final void direcionarLesteParaOeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.E);
        direcionarEsquerdaService.direcionar(sonda);
        direcionarEsquerdaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.W);
    }

    @Test
    public final void direcionarOesteParaLeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.W);
        direcionarDireitaService.direcionar(sonda);
        direcionarDireitaService.direcionar(sonda);
        Assert.assertEquals(sonda.getDirecao(), DirecaoEnum.E);
    }


    private SondaModel mockSondaDirecionadoNorte(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.N);
        sonda.setCoordenadaX(1);
        sonda.setCoordenadaY(2);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoLeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.E);
        sonda.setCoordenadaX(2);
        sonda.setCoordenadaY(2);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoSul(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.S);
        sonda.setCoordenadaX(3);
        sonda.setCoordenadaY(3);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoOeste(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.W);
        sonda.setCoordenadaX(3);
        sonda.setCoordenadaY(4);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoNorteCoordenadaNegativa(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.N);
        sonda.setCoordenadaX(1);
        sonda.setCoordenadaY(-2);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoSulCoordenadaNegativa(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.S);
        sonda.setCoordenadaX(1);
        sonda.setCoordenadaY(-3);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoLesteCoordenadaNegativa(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.E);
        sonda.setCoordenadaX(-1);
        sonda.setCoordenadaY(2);
        return sonda;
    }

    private SondaModel mockSondaDirecionadoOesteCoordenadaNegativa(){
        SondaModel sonda = new SondaModel();
        sonda.setDirecao(DirecaoEnum.W);
        sonda.setCoordenadaX(-2);
        sonda.setCoordenadaY(2);
        return sonda;
    }
}
