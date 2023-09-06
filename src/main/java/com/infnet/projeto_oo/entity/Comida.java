package com.infnet.projeto_oo.entity;

import com.infnet.projeto_oo.exception.ComidaException;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.time.DayOfWeek;
@Log4j2
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
    public boolean check(Pedido pedido) {
        if(pedido.getData().getDayOfWeek().equals(DayOfWeek.TUESDAY) ||
                pedido.getData().getDayOfWeek().equals(DayOfWeek.WEDNESDAY) ||
                pedido.getData().getDayOfWeek().equals(DayOfWeek.THURSDAY) ||
                pedido.getData().getDayOfWeek().equals(DayOfWeek.FRIDAY) ||
                pedido.getData().getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
                pedido.getData().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            throw new ComidaException("Não entregamos comida segunda-feira");
        }
        return true;
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
