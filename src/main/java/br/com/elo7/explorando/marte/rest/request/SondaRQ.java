package br.com.elo7.explorando.marte.rest.request;

import br.com.elo7.explorando.marte.enuns.DirecaoEnum;
import br.com.elo7.explorando.marte.enuns.InstrucoesEnum;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondaRQ implements Serializable {

    private static final long serialVersionUID = 3900254384087669614L;

    @NotNull(message = "{coordenadaX.notnull}")
    @Min(value = 0, message = "{coordenadaX.min}")
    private Integer coordenadaX;

    @NotNull(message = "{coordenadaY.notnull}")
    @Min(value = 0, message = "{coordenadaY.min}")
    private Integer coordenadaY;

    @NotNull(message = "{direcao.notnull}")
    private DirecaoEnum direcao;

    private List<InstrucoesEnum> instrucoes;

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

    public DirecaoEnum getDirecao() {
        return direcao;
    }

    public void setDirecao(DirecaoEnum direcao) {
        this.direcao = direcao;
    }

    public List<InstrucoesEnum> getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(List<InstrucoesEnum> instrucoes) {
        this.instrucoes = instrucoes;
    }
}
