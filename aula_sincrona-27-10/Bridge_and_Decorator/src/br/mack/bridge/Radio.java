package br.mack.bridge;

public class Radio implements Dispositivo {

    public void ligar() {
        System.out.println("Ligando Rádio");
        System.out.println("Rádio ligado!");
    }

    public void desligar() {
        System.out.println("Desligando o rádio...");
        System.out.println("Rádio desligado!");
    }

    public void ajustarVolune(int nivel) {
        System.out.println("Rádio ajustado para o volume para " + nivel);
    }

}
