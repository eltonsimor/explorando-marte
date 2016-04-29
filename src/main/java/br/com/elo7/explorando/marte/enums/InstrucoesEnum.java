package br.com.elo7.explorando.marte.enums;

/**
 * Created by eltonmoraes on 27/04/16.
 */
public enum InstrucoesEnum {

    L('L', "Direcionar para Esquerda"),
    R('R', "Direcionar para Direita"),
    M('M', "Movimentar para Frente");

    private char instrucao;
    private String descricao;

    InstrucoesEnum(char instrucao, String descricao) {
        this.instrucao = instrucao;
        this.descricao = descricao;
    }

    public char getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(char instrucao) {
        this.instrucao = instrucao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
