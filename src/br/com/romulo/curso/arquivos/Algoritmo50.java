package br.com.romulo.curso.arquivos;
public class Algoritmo50 {
    void main(){ // método main 
       try{ //certo
           int idade = Integer.parseInt(
           IO.readln("Qual a sua idade"));
           String resultado = (idade >= 18) ? "maior" : "Menor";
           IO.print(resultado);
       }catch(NumberFormatException e){
          //erro 
          //e.getMessage() -- quanto estiver na web use print( ) console( )
          IO.println("valor inválido.digite um número");
       }finally{
          //conclusão (independe se deu certo ou errado)
          //Janelinha Windows (do lado 'fn') "."
          IO.println("😁- Encerrando SystemSys!");
       }
    }
}
