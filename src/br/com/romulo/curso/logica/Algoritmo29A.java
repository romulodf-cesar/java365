package br.com.romulo.curso.logica;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo29A {

    public void main(){

        //Interface              Classe
        List<Double> vetor = new ArrayList<>();

        int vendas_total = Integer.parseInt(IO.readln("Quantas vezes deseja adicionar vendas: "));

        double soma = 0;
        double media = 0;

        if(vendas_total != 0){
            for(int i = 0; i < vendas_total; i++){
                double valor = Double.parseDouble(IO.readln("entre com o valor: "));
                vetor.add(valor);
            }
        }

        for(int i = 0; i < vetor.size() ; i++){
            soma = vetor.get(i) + soma;
        }
        
        IO.println("A soma total dos valores: " + soma);
        media = soma / vetor.size();
        IO.println("A media aritmetica dos valores: " + media);
    }
}
