package com.infnet.projeto_oo.entity;

import com.infnet.projeto_oo.exception.BebidaException;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
@Log4j2
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
    public boolean check(Pedido pedido) {
        if(pedido.getData().isBefore(ChronoLocalDateTime.from(LocalTime.of(22, 00, 00))) ||
                pedido.getData().isAfter(ChronoLocalDateTime.from(LocalTime.of(15, 00, 00)))){
            throw new BebidaException("Pedidos de bebida somente entre os horários de 15:00h às 22:00h!");
        }
        return true;
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
