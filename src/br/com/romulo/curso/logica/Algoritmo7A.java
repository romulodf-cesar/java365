package br.com.romulo.curso.logica;

public class Algoritmo7A {

    void main(){
        //ENTRADA
           IO.println("Digite um numero:");
           int numero1 = Integer.parseInt(IO.readln());
           IO.println("Digite outro numero:");
           int numero2 = Integer.parseInt(IO.readln());
           int soma;

        //PROCESSAMENTO
           soma = numero1 + numero2;    

        //SAÍDA
           IO.println("A soma dos números é: " + soma);
    }
    
}
