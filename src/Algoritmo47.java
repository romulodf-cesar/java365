public class Algoritmo47 {
    //faça um vetor que armazene 10 valores inteiros
    //IO.println()    IO.readln()
    //imprima a média dos valores.
   
     public void main(){

        IO.println("***Cálculo de Média de 10 Números!***\n\n");

        int[] num = new int[10];

        
        
        int soma = 0;
        double media = 0;

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(IO.readln("Digite um número: "));
            soma += num[i];
        }
        
        media = (double) soma / num.length;
        IO.print("Eis os números digitados: \n");
        for(int nums : num){
            IO.print(nums + " ");
        }
        IO.println("\nA soma dos números inseridos é: " + soma);
        IO.println("A média dos números digitados é: " + media);        

    }
    //crie um vetor de 10 posições
}
