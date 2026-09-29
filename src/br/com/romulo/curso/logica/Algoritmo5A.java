package br.com.romulo.curso.logica;

public class Algoritmo5A {
    void main(){
        int numero ;
        numero = Integer.parseInt(IO.readln("digite um número: "));
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        IO.println("O antecessor: " + antecessor);
        IO.println("O sucessor: " + sucessor);
    }    
}
