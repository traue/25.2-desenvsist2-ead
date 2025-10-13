package br.mack.singleton;

public class ConfiguracaoSigleton {

    private String idioma = "pt-BR";
    private int tamanhoFonte = 12;

    private static ConfiguracaoSigleton instance;

    private ConfiguracaoSigleton() {
    }

    public  static ConfiguracaoSigleton getInstance() {
        if (instance == null) {
            instance = new ConfiguracaoSigleton();
        }
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public void setTamanhoFonte(int tamanhoFonte) {
        this.tamanhoFonte = tamanhoFonte;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
