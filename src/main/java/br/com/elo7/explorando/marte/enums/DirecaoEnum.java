package br.com.elo7.explorando.marte.enums;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public enum DirecaoEnum {

    N('N', "Norte"),
    S('S', "Sul"),
    W('W', "Oeste"),
    E('E', "Leste");

    private char direcao;
    private String descricao;

    DirecaoEnum(char direcao, String descricao) {
        this.direcao = direcao;
        this.descricao = descricao;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
