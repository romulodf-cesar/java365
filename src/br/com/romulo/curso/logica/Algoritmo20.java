package br.com.romulo.curso.logica;

import java.util.List;

public class Algoritmo20 {

    public void main() {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        // Faz exatamente a mesma coisa que: n -> System.out.println(n)
        numeros.forEach(System.out::println);
    }

}
