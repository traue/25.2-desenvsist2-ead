package br.mack.decorator;

public abstract class Adicional implements Bebida {

    protected Bebida bebida;

    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }
}
