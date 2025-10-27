package br.mack.bridge;

public abstract class ControleRemoto {

    protected Dispositivo dispositivo;

    protected ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    abstract void ligarDesligar();
    abstract void mudarVolune(int nivel);

}
