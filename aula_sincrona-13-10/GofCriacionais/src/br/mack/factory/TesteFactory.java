package br.mack.factory;

public class TesteFactory {

    public static void main(String[] args) {

        // não podemos instanciar classes abstratas!
        //Suco c = new Suco();

        FabricaDeSuco fabrica = new FabricaDeSucoDeLaranja();
        Suco suco = fabrica.criarSuco();
        suco.prepararSuco();

        System.out.println("-------------------");

        fabrica = new FabricaDeSucoDeMaracuja();
        suco = fabrica.criarSuco();
        suco.prepararSuco();


    }
}
