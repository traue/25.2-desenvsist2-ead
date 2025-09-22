package br.mack.exemplosgasp;

public class ItemComprado {
    private Produto produto;
    private int quantidade;

    public ItemComprado(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calculaSubtotal() {
        return produto.getPrecoUnitario() * quantidade;
    }

    @Override
    public String toString() {
        return "ItemComprado{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
