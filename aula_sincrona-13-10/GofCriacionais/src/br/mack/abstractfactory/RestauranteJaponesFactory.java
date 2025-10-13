package br.mack.abstractfactory;

public class RestauranteJaponesFactory implements RestauranteFactory {

    public FastFood criarFastFood() {
        return new Temaki();
    }

    public Sobremsa criarSobremsa() {
        return new Manju();
    }
}
