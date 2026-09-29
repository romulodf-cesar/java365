package br.com.romulo.curso.colecoes;
public class Algoritmo48 {
     void main(){

       int conjunto [][] = 
       {{81,2,3},
        {4,82,5},
        {6,7,83}};

        for(int i = 0; i< conjunto.length; i++){
            for (int j = 0; j< conjunto.length; j++){                
                if ( conjunto[i] == conjunto[j]){
                    IO.println(conjunto[i][j]);
                }
           }  
        }
     }    
   
}
