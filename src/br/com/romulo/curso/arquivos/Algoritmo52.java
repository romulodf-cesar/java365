package br.com.romulo.curso.arquivos;
import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public void main(){ //arquivo inicial

        int r = 0; // 1 - continuar o loop 0 - sair do loop
        do{ // inicio do loop

            // 1️⃣ O formato do carimbo: dia/mês/ano às hora:minuto:segundo
            DateTimeFormatter formato = 
                           DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
            //Código para mostrar a mensagem para  o usuário       
                      
            IO.println("Digite uma dúvida?");
            // É uma variável para armazenar a dúvida.
            String duvida = IO.readln();
            // 2️⃣ Carimbo capturado no momento do registro
            //Hora do sistema
            String carimbo = LocalDateTime.now().format(formato); //Dia/Mes/Ano/Hora/Minuto/Segundo
            //  Classe      objeto       Construtor             Nome do Arquivo     Adicionar
            try(FileWriter arquivo = new FileWriter("registro.txt",true)){                
                    arquivo.write("[" + carimbo + "] " + duvida + "\n");      // 3️⃣ carimbo + mensagem + pula linha
                    IO.println("✅ Registrado: [" + carimbo + "] " + duvida);
                    IO.println("Deseja registrar nova mensagem  1-sim 0-não: ");
                    r = Integer.parseInt(IO.readln());
            }catch(IOException e){
               IO.println(" Erro ao salvar a sua dúvida: " + e.getMessage());
            }          

        }while(r==1);

    }    
}
