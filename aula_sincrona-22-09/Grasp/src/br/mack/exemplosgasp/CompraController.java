package br.mack.exemplosgasp;

public class CompraController {

    private Compra  compra = new Compra();

    public void processarNovoItem(String nome, double preco, int quantidade) {
        Produto p = new Produto(nome, preco);
        compra.adicionarItem(p, quantidade);
    }

}
