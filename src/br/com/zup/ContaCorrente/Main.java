package br.com.zup.ContaCorrente;

public class Main {
    public static void main(String[] args) {
       ContaCorrente continha = new ContaCorrente ("Debora",1235);

        System.out.println(continha.nomeCorrentista);
        System.out.println(continha.numeroConta);
        System.out.println(continha.saldo);
    }
}
