package br.com.romulo.curso.logica;

public class Algoritmo17A {
    public static void main(String[] args){
        int i = 1;
        do{
            if(i % 2 == 0 ){
                IO.println(i);
            }
            i++;
        }while(i<=200);
    }    
}
