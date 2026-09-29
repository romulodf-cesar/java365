package br.com.romulo.curso.colecoes;
import java.util.ArrayList;
import java.util.List;

public class Algoritmo49 {
    //crie um algoritmo que pergunte?
   /* IO.println("Qual laboratório quer adicionar") */
   /* leia o laboratório do usuário
      o laboratório é String tipo : F03,F05,F07.   
   */
  //Crie um loop 1- adicionar 2-sair
  //mostre no final a quantidade de laboratório adicionados
  //mostre todos os laboratórios
  //List<String> laboratorios = ArrayList<>();
  public static void main(String[] args) {
        
        //ArrayList                          ArrayList
        ArrayList<String> laboratorios = new ArrayList<>();

        int opcao;

        do {
            IO.println("Qual laboratório deseja adicionar?");
            IO.println("F03, F05 ou F07");
            String laboratorio = IO.readln();

            laboratorios.add(laboratorio);

            IO.println("Deseja adicionar outro laboratório?");
            IO.println("1 - Adicionar");
            IO.println("2 - Sair");

            opcao = Integer.parseInt(IO.readln());

        } while (opcao == 1);

        IO.println("Quantidade de laboratórios adicionados: " + laboratorios.size());

        IO.println("Laboratórios adicionados:");

        for (String laboratorio : laboratorios) {
            IO.println(laboratorio);
        }

  }

}
