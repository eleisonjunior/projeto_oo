package com.infnet.projeto_oo.entity;

import java.math.BigDecimal;

public class Bebiba extends Produto {
    private Boolean gelada;
    private BigDecimal tamanho;
    private String marca;

    public Boolean getGelada() {
        return gelada;
    }

    public void setGelada(Boolean gelada) {
        this.gelada = gelada;
    }

    public BigDecimal getTamanho() {
        return tamanho;
    }

    public void setTamanho(BigDecimal tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public String toString() {
        return "Bebiba{" +
                "gelada=" + gelada +
                ", tamanho=" + tamanho +
                ", marca='" + marca + '\'' +
                '}';
    }
}
