package br.com.zup.Levelup;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais>continente = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Pais pais1 = new Pais ("Brasil",5000.00,200.00);
        Pais pais2 = new Pais ("Argentina", 2000, 123000);
        Pais pais3 = new Pais ("Chile", 1548200, 15203);
        Pais pais4 = new Pais ("Paraguei",12548, 90);

        continente.add(pais1);
        continente.add(pais2);
        continente.add (pais3);
        continente.add(pais4);

        boolean menu = true;
        int opcao = 0;

        while (menu){

            System.out.println("Por favor, digite 1 para listar os paises");
            System.out.println("Por favor digite 2 para sair fo menu");
            opcao = leitor.nextInt();

            if (opcao ==1){
                for (Pais referencia:continente) {
                    System.out.println("O nome do pais é: ");
                    System.out.println(referencia.nome);
                    System.out.println("Aextensão do pais é: ");
                    System.out.println(referencia.extensãoTerritorail);
                    System.out.println("A população do pais é: ");
                    System.out.println(referencia.populacao);
                    System.out.println();

            }
            }
           else if (opcao == 2){
                System.out.println("Obrigada voltei sempre");
                menu = false;
                }

                else{
                    System.out.println("Digite um numero válido");
                }

             }

          }

    }
