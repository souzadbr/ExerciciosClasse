package br.com.zup.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carrinho = new Carro(4 ,"Uno", "Fiat");

        System.out.println(carrinho.marca);
        System.out.println(carrinho.potencia);
        System.out.println(carrinho.modelo);
        System.out.println(carrinho.quantidadeDePorta);
    }

}
