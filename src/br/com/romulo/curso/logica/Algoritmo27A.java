package br.com.romulo.curso.logica;

public class Algoritmo27A {
     public void main() {
        //Definir vetor de 5 posições
        int[] numeros = new int[5];

        //Preencher os valores
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("Digite o número desejado:"));
        }

        //Colocar tudo em ordem inversa da digitada pelo usuário
        for(int i = numeros.length - 1; i >= 0; i--){
            IO.println("Posição: " + (i+1) + " | Número digitado: " + numeros[i]);
        }  
    }
}
