package br.mack.factory;

public class FabricaDeSucoDeLaranja extends FabricaDeSuco {

    public Suco criarSuco() {
        return new SucoDeLaranja();
    }

}
