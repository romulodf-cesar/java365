package br.com.romulo.curso.logica;

//pacote   
//www.jp.com.br   -->   br.com.jp.www
import java.net.InterfaceAddress;
import java.util.List;

public class Algoritmo19A {
    void main(){
              // Notificação de mensagens não lidas
        //Coleções - API Collections (Java 5)
        //Lista, Lista LINK, Mapas e Dicionários (Classe,Classe Abstrata, Interface, Static)
        List<String> contatos = List.of("Javinha", "Bruno", "Kaloi", "Carla", "Diego");
        // n -> ...    parametros -> ação
        contatos.forEach(n -> System.out.println(n));

    }
}
