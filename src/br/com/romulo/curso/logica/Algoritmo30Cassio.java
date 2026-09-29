package br.com.romulo.curso.logica;

public class Algoritmo30Cassio {
    void main(){
        int numeroFatorial = Integer.parseInt(IO.readln("Digite o número que deseja descobrir o fatorial: "));
        int[] decremento = new int [numeroFatorial];
        int valor = numeroFatorial;
        for (int i = decremento.length - 1; i >= 1; i--) {
            decremento[i] = valor;
            valor = i * decremento[i];
            IO.println("Posição " + (i-1) + ": " + decremento[i] + " * " + i + " = " + valor);
        }
        IO.println("Resultado final: O fatorial de " + numeroFatorial + " é " + valor);
    }
}
