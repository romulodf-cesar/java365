package br.com.romulo.curso.logica;

public class Algoritmo6A {

    void main(){
    
        //Ler nome, endereço e telefone e imprimi-los.
        String nome = IO.readln("Digite seu nome: ");
        String endereco = IO.readln("Digite seu endereço: ");
        String telefone = IO.readln("Digite seu telefone: ");
        IO.println("Seu nome é: " + nome.toUpperCase());
        IO.println("Seu endereço é: " + endereco.toUpperCase());
        IO.println("Seu telefone é: " + telefone.toLowerCase());

    }
    
}
