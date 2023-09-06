package com.infnet.projeto_oo.entity;

import lombok.extern.log4j.Log4j2;

import java.time.LocalDateTime;
import java.util.Set;
@Log4j2
public class Pedido {

    private String descricao;
    private LocalDateTime data;
    private Boolean web;
    private Set<Produto> produtos;
    private Solicitante cliente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Boolean getWeb() {
        return web;
    }

    public void setWeb(Boolean web) {
        this.web = web;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }

    public Solicitante getCliente() {
        return cliente;
    }

    public void setCliente(Solicitante cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", produtos=" + produtos +
                ", cliente=" + cliente +
                '}';
    }
}
