package br.mack.biblioteca;

public class PoliticaMultaVIP implements PoliticaMulta {
    @Override
    public double calcular(int diasAtraso) {
        double multa = diasAtraso * 1.0; //mesmo sendo x1, manter para gerar legibilidde
        if (diasAtraso > 10) multa += 20;
        return multa;
    }
}
