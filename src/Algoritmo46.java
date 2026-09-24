import java.util.List;
import java.util.ArrayList;

public class Algoritmo46 {

    public void main(){

        //List (Lista)  - 100,40,50,56
        //Dictionary (Dicionário) - 100:Maria,40:JP,50:Daniel,56:Cassio
        //Pesquisa:
        /*
           GPT ou Google (Collections Java)
           4 Interfaces - 4 Classes
        
        */
       //ArrayList implementa List(lista)
       //HashMap implementa Map (chave → valor)
       //HashSet implementa Set (conjunto)
       //LinkedList implementa Queue (fila)

       List<String> frutas = new ArrayList<>();

       frutas.add("Goiaba");
       frutas.add("Amora");
       frutas.add("Melancia");
       frutas.add("Mamão");
       

       IO.println("primeira fruta:"+frutas.get(0));
       IO.println(frutas);
       frutas.set(1,"Uva");
       IO.println(frutas);
       for(String fruta:frutas){
         IO.println("elemento:"+fruta);
       }
       IO.println("Total de frutas:"+frutas.size());
       frutas.remove("Mamão");
       frutas.remove("Goiaba");
       frutas.remove("Melancia");
       IO.println("Total de frutas:"+frutas.size());
       IO.println("lista"+frutas);
       frutas.add("Laranja");
       frutas.add("Morango");
       IO.println("lista"+frutas);
       frutas.remove(1);
       IO.println("lista"+frutas);
    }
    
}
