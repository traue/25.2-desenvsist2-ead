package br.mack.factory;

public class FabricaDeSucoDeMaracuja extends FabricaDeSuco {

    public Suco criarSuco() {
        return new SucoDeMaracuja();
    }
}
