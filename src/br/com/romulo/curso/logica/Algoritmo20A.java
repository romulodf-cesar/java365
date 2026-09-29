package br.com.romulo.curso.logica;

import java.util.List;

public class Algoritmo20A {
    void main(){
        List<String> cupons = List.of("PROMO10", "DESCONTO20", "FRETEGRATIS", "PIX5");
        cupons.forEach(cupom -> System.out.println(cupom));
    }
}
