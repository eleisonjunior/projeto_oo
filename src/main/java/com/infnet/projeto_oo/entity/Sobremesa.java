package com.infnet.projeto_oo.entity;

import java.math.BigDecimal;

public class Sobremesa extends Produto{
    private BigDecimal quantidade;
    private Boolean doce;
    private String informacao;

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getDoce() {
        return doce;
    }

    public void setDoce(Boolean doce) {
        this.doce = doce;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "quantidade=" + quantidade +
                ", doce=" + doce +
                ", informacao='" + informacao + '\'' +
                '}';
    }
}
