package br.mack.exemplosgasp;

public class EmailService {
    public void enviarEmail(String dest, String mensagem) {
        System.out.println("Enviando para " + dest + "a mensagem " + mensagem);
    }
}
