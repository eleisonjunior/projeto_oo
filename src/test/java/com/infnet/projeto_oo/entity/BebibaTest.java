package com.infnet.projeto_oo.entity;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
class BebibaTest extends Produto {

    @Test
    void getGelada() {
    }

    @Test
    void setGelada() {
    }

    @Test
    void getTamanho() {
    }

    @Test
    void setTamanho() {
    }

    @Test
    void getMarca() {
    }

    @Test
    void setMarca() {
    }

    @Test
    void testToString() {
    }

    public static void main(String[] args) {
        Bebiba drink = new Bebiba();
        drink.setCodigo(1);
        drink.setGelada(true);
        drink.setMarca("Gordon");
        drink.setTamanho(new BigDecimal(0.300));
        drink.setNome("Moscou Mulle");
        drink.setValor(new BigDecimal(19.00));
        drink.toString();


        Bebiba cerveja = new Bebiba();
        cerveja.setCodigo(2);
        cerveja.setGelada(true);
        cerveja.setMarca("Colorado");
        cerveja.setTamanho(new BigDecimal(1));
        cerveja.setNome("Appia");
        cerveja.setValor(new BigDecimal(20.00));
        drink.toString();

        Bebiba  suco = new Bebiba();
        suco.setCodigo(3);
        suco.setGelada(false);
        suco.setMarca("Sem marca");
        suco.setTamanho(new BigDecimal(0.500));
        suco.setNome("Suco de Laranja");
        suco.setValor(new BigDecimal(8.00));
        drink.toString();
    }

    @Override
    public boolean check(Pedido pedido) {
        Comida comida = new Comida();
        return comida.check(pedido);
    }
}