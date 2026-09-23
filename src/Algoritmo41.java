public class Algoritmo41 {

    public void main(){
        //matrizes
        //matriz bidimensional (2D)
        //2x2 (matriz quadrada)-mesma qtde de L,C
           //1 bis
        //3 bis
        //Coluna e a Linha
        //X,Y
        //H,W
        //M,N
        //A,B
        //4 bis
        //i,j
        //Júlio Cesar (4 bis)
        //Daniel (2 bis) 
        /*
          i: Identifica o número da linha (horizontal).
          j: Identifica o número da coluna (vertical).
        */       
        int[][] m = {{21,25},{33,35}}; 
        int soma=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                soma += m[i][j];
            }
        }
        IO.print(soma);     
    }
    
}
