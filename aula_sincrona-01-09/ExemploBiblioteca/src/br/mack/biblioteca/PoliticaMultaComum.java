package br.mack.biblioteca;

public class PoliticaMultaComum implements PoliticaMulta {

    @Override
    public double calcular(int diasAtraso) {
        double multa = diasAtraso * 2.0;
        if (diasAtraso > 10) multa += 20;
        return multa;
    }
}
