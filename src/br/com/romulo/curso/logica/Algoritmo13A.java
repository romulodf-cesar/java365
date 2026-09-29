package br.com.romulo.curso.logica;

public class Algoritmo13A {
    public void main(){
        int num1 = Integer.parseInt(IO.readln("Informe um Número: "));
        int num2 = Integer.parseInt(IO.readln("Informe outro Número: "));
        if(num1>num2){
            IO.println(num1 + " é maior que " + num2);
        } else if (num2 > num1){
            IO.println(num2 + " é maior que " + num1);
        }else{
            IO.println("Os números são iguais");
        }
    }    
}
