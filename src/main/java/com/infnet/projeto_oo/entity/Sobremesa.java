package com.infnet.projeto_oo.entity;

import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
@Log4j2
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
    public boolean check(Pedido pedido) {
        if(pedido.getWeb()){
            log.info("Não entregamos sobremesa para pedidos feitos na web");
            return false;
        }
        return true;
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
