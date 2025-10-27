package br.mack.bridge;

public class TV implements Dispositivo {

    public void ligar() {
        System.out.println("Ligando TV");
        System.out.println("TV ligada!");
    }

    public void desligar() {
        System.out.println("Desligando TV...");
        System.out.println("TV desligada!");
    }

    public void ajustarVolune(int nivel) {
        System.out.println("TV ajustando volume para " + nivel);
    }

}
