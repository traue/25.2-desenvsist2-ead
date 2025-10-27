package br.mack.decorator;

public class Leite extends Adicional {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.0;
    }
}
