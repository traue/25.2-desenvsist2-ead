package br.mack.abstractfactory;

public class RestauranteItalianoFactory implements RestauranteFactory {

    public FastFood criarFastFood() {
        return new Pizza();
    }

    public Sobremsa criarSobremsa() {
        return new Canoli();
    }

}
