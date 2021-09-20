package br.com.zup.Pessoa;

public class Main {
    public static void main(String[] args) {
      Pessoa humano = new Pessoa();

      humano.altura = 1.58;
      humano.peso = 65;
      humano.idade = 35;
      humano.nome = "Xuxu";

        System.out.println(humano.altura);
        System.out.println(humano.idade);
        System.out.println(humano.nome);
        System.out.println(humano.peso);
    }
}
