package br.com.romulo.curso.logica;

public class Algoritmo23{
   public void main(){
       
       IO.println("=== PREENCHIMENTO DE VARIÁVEIS SIMPLES ===");
        
        // 1. Leitura individual de cada variável
        IO.println("Digite o 1º número:");
        int numero1 = Integer.parseInt(IO.readln());
        
        IO.println("Digite o 2º número:");
        int numero2 = Integer.parseInt(IO.readln());
        
        IO.println("Digite o 3º número:");
        int numero3 = Integer.parseInt(IO.readln());
        
        IO.println("Digite o 4º número:");
        int numero4 = Integer.parseInt(IO.readln());
        
        IO.println("Digite o 5º número:");
        int numero5 = Integer.parseInt(IO.readln());
        
        // 2. Exibição individual de cada variável
        IO.println("\n=== VALORES GUARDADOS ===");
        IO.println("Variável 1 = " + numero1);
        IO.println("Variável 2 = " + numero2);
        IO.println("Variável 3 = " + numero3);
        IO.println("Variável 4 = " + numero4);
        IO.println("Variável 5 = " + numero5);
 
   }

}