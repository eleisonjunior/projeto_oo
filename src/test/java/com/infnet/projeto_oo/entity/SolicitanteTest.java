package com.infnet.projeto_oo.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitanteTest {

    @Test
    void testGetNome() {
    }

    @Test
    void testSetNome() {
    }

    @Test
    void getCpf() {
    }

    @Test
    void setCpf() {
    }

    @Test
    void getEmail() {
    }

    @Test
    void setEmail() {
    }

    @Test
    void testToString() {
    }

    public static void main(String[] args) {
        Solicitante cliente1 = new Solicitante("Jose Pereira","99999999999","josepereira@gmail.com");
        cliente1.toString();
        Solicitante cliente2 = new Solicitante("Maria das Dores","88888888888","mariadasdores@gmail.com");
        cliente2.toString();
        Solicitante cliente3 = new Solicitante("Mario Detraz","77777777777","mariodetraz@gmail.com");
        cliente3.toString();
    }

}