package br.com.elo7.explorando.marte.rest.response;

import br.com.elo7.explorando.marte.enums.DirecaoEnum;

import java.io.Serializable;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public class SondaRS implements Serializable{

    private static final long serialVersionUID = -4618051485572597550L;

    private Integer codigo;
    private Integer coordenadaX;
    private Integer coordenadaY;
    private DirecaoEnum direcao;

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

    public DirecaoEnum getDirecao() {
        return direcao;
    }

    public void setDirecao(DirecaoEnum direcao) {
        this.direcao = direcao;
    }

}
