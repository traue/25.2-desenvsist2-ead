package br.mack.decorator;

public class Chantilly extends Adicional {

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chantilly";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}
