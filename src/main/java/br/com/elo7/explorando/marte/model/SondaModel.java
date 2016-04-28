package br.com.elo7.explorando.marte.model;

import br.com.elo7.explorando.marte.enuns.DirecaoEnum;
import br.com.elo7.explorando.marte.enuns.InstrucoesEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondaModel implements Serializable {

    private static final long serialVersionUID = -5785095496009784685L;

    private Integer codigo;
    private Integer coordenadaX;
    private Integer coordenadaY;
    private DirecaoEnum direcao;
    private List<InstrucoesEnum> instrucoes;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(Integer coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public Integer getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(Integer coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public List<InstrucoesEnum> getInstrucoes() {
        return instrucoes;
    }

    public DirecaoEnum getDirecao() {
        return direcao;
    }

    public void setDirecao(DirecaoEnum direcao) {
        this.direcao = direcao;
    }

    public void setInstrucoes(List<InstrucoesEnum> instrucoes) {
        this.instrucoes = instrucoes;
    }

    @Override
    public String toString() {
        return "Sonda [ Numero: " + codigo + " - " + "( " + coordenadaX + " " + coordenadaY + " " + direcao +" )" + " ]" ;
    }
}
