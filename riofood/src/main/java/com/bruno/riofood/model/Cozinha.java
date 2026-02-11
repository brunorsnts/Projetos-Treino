package com.bruno.fastfood.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Cozinha {

    ArrayDeque<ItemVenda> pedidosPendentes = new ArrayDeque<>();

    public ArrayDeque<ItemVenda> getPedidosPendentes() {
        return pedidosPendentes;
    }

    public void receberPedido(ItemVenda pedido) {
        pedidosPendentes.add(pedido);
        System.out.println("Pedido realizado!");
    }

    public void prepararProximoPedido() {
        ItemVenda itemAtual = pedidosPendentes.poll();

        if (itemAtual != null) {
            System.out.println("--- Cozinha trabalhando ---");
            itemAtual.preparar(); // Polimorfismo: cada item se prepara do seu jeito
            System.out.println("Item " + itemAtual.getNome() + " pronto para entrega!\n");
        }

        else {
            System.out.println("Não há pedidos pendentes.");
        }
    }

    public int verTotalPedidoPendentes() {
        return pedidosPendentes.size();
    }

    public void exibirPedidosPendentes() {
        pedidosPendentes.forEach(System.out::println);
    }
}
