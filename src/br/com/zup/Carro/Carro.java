package br.com.zup.Carro;

public class Carro {

    double quantidadeDePorta;
    String modelo;
    String marca;
    double potencia = 0;

    public Carro (double quantidadeDePorta, String modelo, String marca){
        this.marca = marca;
        this.modelo = modelo;
        this.quantidadeDePorta =  quantidadeDePorta;
    }
}
