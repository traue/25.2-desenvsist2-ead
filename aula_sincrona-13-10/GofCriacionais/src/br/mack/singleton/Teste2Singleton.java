package br.mack.singleton;

public class Teste2Singleton {

    public void alterarIdioma(){
        ConfiguracaoSigleton conf3 = ConfiguracaoSigleton.getInstance();
        System.out.println("Idioma atual: " + conf3.getIdioma());
        conf3.setIdioma("EN");
        System.out.println("Idioma alterado para EN via CONF3!");
    }
}
