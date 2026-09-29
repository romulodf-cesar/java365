package br.com.romulo.curso.logica;
public class Algoritmo14{

    void main() {
        // Mostre números pares de 0 a 200 usando for

        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("|");
            }
        }
    }



}

