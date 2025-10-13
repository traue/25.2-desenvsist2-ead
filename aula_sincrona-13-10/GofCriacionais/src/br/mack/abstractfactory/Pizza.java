package br.mack.abstractfactory;

public class Pizza implements FastFood{

    public void preparar() {
        System.out.println("Preparando Pizza!");
        System.out.println("Pizza pronta!");
    }

}
