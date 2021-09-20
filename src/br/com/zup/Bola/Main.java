package br.com.zup.Bola;

import br.com.zup.Bola.Bola;

public class Main {

    public static void main(String[] args) {
        Bola bolinha = new Bola (1.1, "Vermelha", "Sei lá", 2);

        System.out.println(bolinha.circunferencia);
        System.out.println(bolinha.cor);
        System.out.println(bolinha.marca);
        System.out.println(bolinha.velocidade);
    }
}

