package br.mack.abstractfactory;

public class TesteAbstractFacotry {

    public static void main(String[] args) {
        RestauranteFactory restauranteFactory = new RestauranteItalianoFactory();
        FastFood comida = restauranteFactory.criarFastFood();
        Sobremsa sobremesa = restauranteFactory.criarSobremsa();

        comida.preparar();
        sobremesa.servir();

        System.out.println("------------------------");

        restauranteFactory = new RestauranteJaponesFactory();
        comida = restauranteFactory.criarFastFood();
        sobremesa = restauranteFactory.criarSobremsa();

        comida.preparar();
        sobremesa.servir();
    }
}
