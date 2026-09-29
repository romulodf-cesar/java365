package br.com.romulo.curso.logica;

public class Algoritmo30Sophia {

    public void main(){
        int numero = Integer.parseInt(IO.readln("Digite um número: "));
        long[] vetor = new long[numero - 1];
        long resultadoAtual = numero;

        System.out.println("Passo a passo:");
        for (int i = 0; i < numero - 1; i++) {
            int proximoMultiplicador = numero - 1 - i;
            long proximoResultado = resultadoAtual * proximoMultiplicador;
            System.out.println(resultadoAtual + " * " + proximoMultiplicador + " = " + proximoResultado);
            vetor[i] = proximoResultado;
            resultadoAtual = proximoResultado;
        }
        System.out.println("\nValores armazenados no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
        System.out.println("\nResultado final: " + resultadoAtual);
    }
    
}
