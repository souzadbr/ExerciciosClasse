package br.com.zup.Bola;

import br.com.zup.Bola.Bola;

public class Main {

    public static void main(String[] args) {
        Bola bolinha = new Bola ();

        bolinha.cor = "Laranja";
        bolinha.esporte = "Basquete";
        bolinha.material = "Borracha";
        bolinha.peso = 1.0;
        bolinha.tamanho = 30;

        System.out.println(bolinha.cor);
        System.out.println(bolinha.esporte);
        System.out.println(bolinha.material);
        System.out.println(bolinha.peso);
        System.out.println(bolinha.tamanho);

    }
}

