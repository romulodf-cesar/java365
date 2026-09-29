package br.com.romulo.curso.logica;

public class Algoritmo9A {

    public void main(){
        double x; 
        x = Double.parseDouble(IO.readln("Digite o numero: "));      
        double divisao = x / 3;
        IO.println("A terça parte do número "+x+" é: " + divisao);
    }
    
}
