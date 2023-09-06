package com.infnet.projeto_oo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SobremesaTest extends Produto {

    @Test
    void getQuantidade() {
    }

    @Test
    void setQuantidade() {
    }

    @Test
    void getDoce() {
    }

    @Test
    void setDoce() {
    }

    @Test
    void getInformacao() {
    }

    @Test
    void setInformacao() {
    }

    @Test
    void testToString() {
    }

    public static void main(String[] args) {

    }

    @Override
    public boolean check(Pedido pedido) {
        Comida comida = new Comida();
        return comida.check(pedido);
    }
}