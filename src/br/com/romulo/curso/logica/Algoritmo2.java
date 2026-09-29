package br.com.romulo.curso.logica;

public class Algoritmo2 {

    void main(){
        //ENTRADA 
        IO.println("Seja bem vindo ao portal Java 360?");
        String usuario =  IO.readln("Qual o seu nome? ");
        IO.println("Olá, " + usuario + "! Bem-vindo ao portal.");
        //mais rapido sem métodos
        //int estrelas = 0; 

        //mais lento com métodos (Classes Wrappers)
        //Integer.parseInt(valor para conversão) 
        int estrelas = 0;
        IO.println("Quem criou o Java?");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg");
        int resp = Integer.parseInt(IO.readln("Digite o número"));
        if(resp  == 1){
            IO.println("Parabéns, você acertou! Ganhou uma estrela.");
            estrelas = estrelas + 1;//variável de incremento
            //estrelas++;
        }else {
            IO.println("Você errou! E não ganhou nenhuma estrela.");
        }
        IO.println("Você obteve " + estrelas + " estrelas.");
    }
    
}
