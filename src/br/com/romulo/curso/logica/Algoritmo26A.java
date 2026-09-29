package br.com.romulo.curso.logica;

public class Algoritmo26A {
     public void main () {
        int[] numeros = new int[5];
        
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número na posição " + (i+1) + ": "));
        }

        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }

        IO.println("A soma de todos os números inseridos é: " + soma);
    }
}
