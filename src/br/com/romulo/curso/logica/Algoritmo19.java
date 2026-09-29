package br.com.romulo.curso.logica;

import java.util.List;

public class Algoritmo19 {
    public void main() {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        // Sintaxe da lambda: (parâmetro) -> corpo
        numeros.forEach(n -> System.out.println(n));
    }

}
