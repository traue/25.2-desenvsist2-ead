package br.mack.exemplosgasp;

public class Principal {

    public static void main(String[] args) {

        Compra compra = new Compra();
        CompraController compraController = new CompraController();

//        ItemComprado item = new ItemComprado(
//                new Produto("iPhone 17 Pro Max", 30000),
//                5
//        );

//        ItemComprado item2 = new ItemComprado(
//                new Produto("MacBook Pro M4 Pro", 50000),
//                2
//        );

        compra.adicionarItem(new Produto("MacBook Pro M4 Pro", 50000),
                2);
        compra.adicionarItem(new Produto("iPhone 17 Pro Max", 30000),
                5);


        System.out.println(compra.toString());
        System.out.println("Valor da compra: " + compra.getValroCompra());


        compraController.processarNovoItem("Mouse Logitech", 150, 3);

        Relatorio relatorio = new Relatorio();
        relatorio.imprimirRelatorio(compra);

    }

}
