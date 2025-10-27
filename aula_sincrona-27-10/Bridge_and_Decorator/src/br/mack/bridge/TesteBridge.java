package br.mack.bridge;

public class TesteBridge {
    public static void main(String[] args) {

        Dispositivo tv = new TV();
        ControleRemoto controle = new ControleUniversal(tv);
        controle.ligarDesligar();
        controle.mudarVolune(15);
        controle.ligarDesligar();

        Dispositivo radio = new Radio();
        controle = new  ControleUniversal(radio);
        controle.ligarDesligar();
        controle.mudarVolune(5);
        controle.ligarDesligar();
    }
}
