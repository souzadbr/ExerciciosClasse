package br.com.zup.Bola;

import br.com.zup.Bola.Bola;

public class Main {

    public static void main(String[] args) {
        Bola bolinha = new Bola (1.1, "Vermelha", "Sei lá", 2);

        System.out.println("Bola1: ");
        System.out.println(bolinha.circunferencia);
        System.out.println(bolinha.cor);
        System.out.println(bolinha.marca);
        System.out.println(bolinha.velocidade);
        System.out.println();

        Bola bolinha1 = new Bola (2.5, "Azul","Sei não",5);

        System.out.println("Bola2: ");
        System.out.println(bolinha1.circunferencia);
        System.out.println(bolinha1.cor);
        System.out.println(bolinha1.marca);
        System.out.println(bolinha1.velocidade);
        System.out.println();
    }


}

