package br.com.romulo.curso.logica;

public class Algoritmo11A {
    public void main(){
        String nome = IO.readln("digite seu nome: ");
        
        if(nome.equalsIgnoreCase("gabriel")){
            IO.println("olá, seja bem vindo: "+nome);
        }
        else {
             IO.println("Você não é o Gabriel, você não tem permissão para entrar.");
        }   

        IO.println("********fim do programa********");
    }
    
}
