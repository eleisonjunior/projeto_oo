package com.infnet.projeto_oo.entity;

import java.math.BigDecimal;
import java.time.DayOfWeek;

public class Comida extends Produto{
    private BigDecimal peso;
    private Boolean vegano;
    private String ingredientes;

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Boolean getVegano() {
        return vegano;
    }

    public void setVegano(Boolean vegano) {
        this.vegano = vegano;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "peso=" + peso +
                ", vegano=" + vegano +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }
}
