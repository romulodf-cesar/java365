package br.com.romulo.curso.logica;

import java.util.List;

public class Algoritmo21A {
    public static void main(String[] args){
        List<Integer> numeros = List.of(45, 67, 89, 34, 23, 56 , 78, 98,45, 34);
        double total = 0;
        //int quantidade = 0;

        for(int numero : numeros){
            total += numero;
           // quantidade++;
        }
        IO.println("A media da lista de numeros é " + total/numeros.size());
       // IO.println(quantidade);
        IO.println(numeros.size());
        IO.println("A soma é:"+total);

      
    }
}

