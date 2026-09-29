package br.com.romulo.curso.logica;

public class Algoritmo4A {
    public void main(){
        int diaDaSemana = Integer.parseInt(IO.readln("Digite o dia da semana atual do 1 ao 7: "));

        switch (diaDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }
    
    }
    
}
