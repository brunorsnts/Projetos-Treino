package com.bruno.fastfood.model;

public class Lanche implements ItemVenda{

    private String nome;
    private double preco;

    public Lanche(String nome, double preco) {
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
        System.out.println("Grelhando a carne e montando o " + nome + "...");
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}
