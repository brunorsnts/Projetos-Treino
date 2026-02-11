package com.bruno.fastfood.model;

public class Bebida implements ItemVenda{

    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void preparar() {
        System.out.println("Enchendo copo de " + nome + " com gelo...");
    }

    @Override
    public String toString() {
        return nome + "(R$ " + preco + ")";
    }
}
