import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public void main(){

        int r = 0;
        do{
            try{
                //amanhã - manipular aqui..

            }catch(Exception e){
              IO.print(e.getMessage());
            }

            IO.print("adicionar msg:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());
        }while(r==1);

    }    
}
