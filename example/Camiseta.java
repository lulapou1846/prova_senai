package org.example;

public class Camiseta {
    private double preco;
    private String tipo;

    public Camiseta(double preco, String tipo) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
        this.tipo = tipo;
    }

    public double calcularDesconto() {
        if (tipo.equalsIgnoreCase("simples")) {
            return preco * 0.90; // 10% de desconto
        } else if (tipo.equalsIgnoreCase("estampada")) {
            return preco * 0.95; // 5% de desconto
        }
        return preco; // Sem desconto
    }

    public static void main(String[] args) {
        Camiseta simples = new Camiseta(50.0, "simples");
        Camiseta estampada = new Camiseta(70.0, "estampada");

        System.out.println("Preço com desconto (simples): R$ " + simples.calcularDesconto());
        System.out.println("Preço com desconto (estampada): R$ " + estampada.calcularDesconto());
    }
}


