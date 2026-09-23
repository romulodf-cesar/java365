public class Algoritmo40{

    public void main(){
        //vetor - matriz unidimensional
        // acadêmico - programação simples básico
        /*
         tabela - matriz bidimensional
         //banco de dados, planilha Excel

         3D - matriz tridimensional
         //Cinema,Séries,Desenhos,Animações,Games (GTA 6)
         //AutoCAD , Revit, SketchUP 
         //Humanoide - Softwares 3D Simulação
         //Minecraft X, Y e Z  (jogar)     
        */
         //vetor ou matriz unidimesional
         //https://www.somatematica.com.br/emedio/matrizes/matrizes2.php
         //matriz linha ou matriz coluna
         //             0 1 2  3 4 
         int[] notas = {7,9,5,10,6};
         int maior = notas[0];
         IO.println(maior);
         // Muito útil para Big Data
         for(int i=1;i<notas.length;i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
         }
         IO.println("Maior nota:"+maior);

    }
}