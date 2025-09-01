package br.mack.biblioteca;

public class Emprestimo {
    private String tituloLivro;
    private String nomeUsuario;
    private int diasAtraso;
    // private boolean usuarioVIP;
    private PoliticaMulta politicaMulta;

    public Emprestimo(String tituloLivro, String nomeUsuario, int diasAtraso, PoliticaMulta politicaMulta) {
        this.tituloLivro = tituloLivro;
        this.nomeUsuario = nomeUsuario;
        this.diasAtraso = diasAtraso;
        //this.usuarioVIP = usuarioVIP;
        this.politicaMulta = politicaMulta;
    }

    public double calcularMulta() {
//        double multa = 0;
//        if (diasAtraso > 0) {
//            if (usuarioVIP) {
//                multa = diasAtraso * 1.0;
//            } else {
//                multa = diasAtraso * 2.0;
//            }
//            if (diasAtraso > 10) {
//                multa += 20;
//            }
//        }
        if (diasAtraso <= 0) return 0;
        return politicaMulta.calcular(diasAtraso);
//        return multa;
    }
}
