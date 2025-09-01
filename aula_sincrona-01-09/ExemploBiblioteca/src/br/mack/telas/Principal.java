package br.mack.telas;

import br.mack.biblioteca.Emprestimo;
import br.mack.biblioteca.PoliticaMultaComum;
import br.mack.biblioteca.PoliticaMultaVIP;

public class Principal {
    public static void main(String[] args) {

        Emprestimo comum = new Emprestimo("Java Básico", "Maria", 12, new PoliticaMultaComum());
        System.out.println("Multa comum: " + comum.calcularMulta());

        Emprestimo vip = new Emprestimo("Clean Code", "Carlos", 12, new PoliticaMultaVIP());
        System.out.println("Multa VIP: " + vip.calcularMulta());

    }
}
