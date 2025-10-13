package br.mack.singleton;

public class TesteSigleton {

    public static void main(String[] args) {

        // criamos "dois" objetos do tipo ConfiguracaoSingleton
        ConfiguracaoSigleton conf1 = ConfiguracaoSigleton.getInstance();
        ConfiguracaoSigleton conf2 = ConfiguracaoSigleton.getInstance();

        System.out.printf("Conf1 IDIOMA: %s\n", conf1.getIdioma());
        System.out.printf("Conf2 IDIOMA: %s\n", conf2.getIdioma());

        conf1.setIdioma("DN");
        conf1.setTamanhoFonte(18);

        System.out.printf("Conf1 IDIOMA: %s\n", conf1.getIdioma());
        System.out.printf("Conf2 IDIOMA: %s\n", conf2.getIdioma());

        System.out.println("Conf1 TAMANHO FONTE: " + conf1.getTamanhoFonte());
        System.out.println("Conf2 TAMANHO FONTE: " + conf2.getTamanhoFonte());

        Teste2Singleton t2 = new Teste2Singleton();
        t2.alterarIdioma();

        System.out.printf("Conf1 IDIOMA: %s\n", conf1.getIdioma());
        System.out.printf("Conf2 IDIOMA: %s\n", conf2.getIdioma());
    }
}
