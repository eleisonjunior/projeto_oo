package com.infnet.projeto_oo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComidaTest extends Produto {

    @Test
    void getPeso() {
    }

    @Test
    void setPeso() {
    }

    @Test
    void getVegano() {
    }

    @Test
    void setVegano() {
    }

    @Test
    void getIngredientes() {
    }

    @Test
    void setIngredientes() {
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