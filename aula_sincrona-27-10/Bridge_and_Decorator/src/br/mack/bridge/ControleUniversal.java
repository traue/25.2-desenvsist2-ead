package br.mack.bridge;

public class ControleUniversal extends ControleRemoto {

    private boolean ligado = false;

    public ControleUniversal(Dispositivo dispositivo) {
        super(dispositivo);
    }

    void ligarDesligar() {
        if (ligado) dispositivo.desligar();
        else dispositivo.ligar();
        ligado = !ligado;
    }

    void mudarVolune(int nivel) {
        dispositivo.ajustarVolune(nivel);
    }

}
