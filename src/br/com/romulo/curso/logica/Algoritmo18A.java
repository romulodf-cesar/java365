package br.com.romulo.curso.logica;

public class Algoritmo18A {
    // Crie um algoritmo que mostre os números pares de 0 a 200. Use Vetor e For
    public void main() {
        // criar o vetor array, e alocar a memória necessária para o vetorarray na JVM,
        // No Java, vetores têm tamanho fixo e são objetos
        // precisa usar a palavra "new" para instanciar a estrutura na memória.
        // lista(array, vetor)
        int[] numeros = new int[101];

        // for para verificar se o número e positivo e adicionar no vetor/array
        for(int i = 0; i <= 100; i++){
            numeros[i] = i * 2;
        }

        // Outro for para percorrer o vetor já com número positivos e imprimir cada um na tela
        for (int numero : numeros ) {
            System.out.println(numero);
        }


    }
}