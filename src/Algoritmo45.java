import java.util.List;

public class Algoritmo45 {
    public void main(){
        //Java Collections
        //Java 5
        /*
           List (Interface) ---> ArrayList(Classe Implementa)
         
        */
       List<String> tarefas = List.of("teste mesa","algoritmos","oo");
       for(String tarefa:tarefas){
          //singular - elemento
          //plural - coleção
          IO.println(tarefa);   
       }
    }
}
