package br.mack.exemplosgasp;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private List<ItemComprado> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {
        ItemComprado novoItem = new ItemComprado(produto, quantidade);
        itens.add(novoItem);
    }

    private String getItens() {
        String listagem = "";
        for (ItemComprado item : itens) {
            listagem += item.toString();
            listagem += "\n";
        }
        return listagem;
    }

    public double getValroCompra() {
        double valroCompra = 0;
        for  (ItemComprado item : itens) {
            valroCompra += item.calculaSubtotal();
        }
        return valroCompra;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "itens=" + getItens() +
                '}';
    }
}
