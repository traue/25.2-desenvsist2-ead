package br.mack.decorator;

public class TesteDecoator {
    public static void main(String[] args) {
        Bebida pedido = new Chantilly(new Leite(new Cafe()));
        System.out.println(pedido.getDescricao());
        System.out.println(pedido.getPreco());
    }
}
