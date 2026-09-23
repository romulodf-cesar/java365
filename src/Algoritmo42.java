
import java.util.List;
import java.util.ArrayList;
public class Algoritmo42 {
    public void main(){
        //Java 5
        //James Gosling
        //Coleção/Coleções (figurinhas)
        //Collections
        //Antes do Java 5 - calça normal
        //A partir do  Java 5 - Calça Lycra
        //Primera voz (Bruno):Interface (contrato)
        //Segunda voz (Marrone):Classe (implementa)
        //List<String> nomes = new ArrayList<>();
        //< > -Genérics
        List<String> linguagens = 
          List.of("Rust","Python","GO","Java","C","C++","C#");
        for(String linguagem:linguagens){
            IO.println(linguagem);
        }
    }    
}
