package com.infnet.projeto_oo.service;

import com.infnet.projeto_oo.entity.*;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PedidoService {

    public static void main(String[] args) {
        List<Pedido> pedidos = returnPedido();
    }
    public static List<Pedido> returnPedido(){

        List<Pedido> pedidos = new ArrayList<>();
        String csvFile = "pedidos.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (
             BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                /*Criação do pedido*/
                Pedido pedido = new Pedido();
                Set<Produto> produtos = new HashSet<Produto>();
                String[] pedidoArquivo = line.split(cvsSplitBy);

                pedido.setDescricao(pedidoArquivo[0]);
                pedido.setData(LocalDateTime.parse(pedidoArquivo[1]));
                pedido.setWeb(Boolean.parseBoolean(pedidoArquivo[2]));
                /*Criação do Solicitante*/
                line = br.readLine();
                String[] solicitanteArquivo = line.split(cvsSplitBy);
                Solicitante solicitante = new Solicitante(solicitanteArquivo[0],solicitanteArquivo[1],solicitanteArquivo[2]);
                pedido.setCliente(solicitante);

                /*Criação do produto comida*/
                line = br.readLine();
                String[] comidasArquivo = line.split(cvsSplitBy);
                Comida comida = new Comida();
                comida.setNome(comidasArquivo[0]);
                comida.setValor(new BigDecimal(comidasArquivo[1]));
                comida.setCodigo(Integer.parseInt(comidasArquivo[2]));
                comida.setPeso(new BigDecimal(comidasArquivo[3]));
                comida.setVegano(Boolean.parseBoolean(comidasArquivo[4]));
                comida.setIngredientes(comidasArquivo[5]);
                produtos.add(comida);


                /*Criação do produto bebida*/
                line = br.readLine();
                String[] bebidasArquivo = line.split(cvsSplitBy);
                Bebiba bebida = new Bebiba();
                bebida.setNome(comidasArquivo[0]);
                bebida.setValor(new BigDecimal(bebidasArquivo[1]));
                bebida.setCodigo(Integer.parseInt(bebidasArquivo[2]));
                bebida.setGelada(Boolean.parseBoolean(bebidasArquivo[3]));
                bebida.setTamanho(new BigDecimal(bebidasArquivo[4]));
                bebida.setMarca(bebidasArquivo[5]);
                produtos.add(bebida);

                /*Criação do produto sobremesa*/
                line = br.readLine();
                String[] sobremesaArquivo = line.split(cvsSplitBy);
                Sobremesa sobremesa = new Sobremesa();
                sobremesa.setNome(comidasArquivo[0]);
                sobremesa.setValor(new BigDecimal(sobremesaArquivo[1]));
                sobremesa.setCodigo(Integer.parseInt(sobremesaArquivo[2]));
                sobremesa.setQuantidade(new BigDecimal(sobremesaArquivo[3]));
                sobremesa.setDoce(Boolean.parseBoolean(sobremesaArquivo[4]));
                sobremesa.setInformacao(sobremesaArquivo[5]);
                produtos.add(sobremesa);
                pedido.setProdutos(produtos);
                pedidos.add(pedido);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pedidos;
    }
}