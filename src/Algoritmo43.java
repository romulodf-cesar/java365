public class Algoritmo43 {

    public void main(){
        //vetor:
                      //   0  1  2  3  4
        double[] notas = {100,70,80,50,40};
        IO.println(notas[0]);
        IO.println(notas[3]);
        IO.println(notas.length);
        int soma =0;
        for(int i=0;i<notas.length;i++){
           soma+=  notas[i];
        }
        IO.print(soma);

                       
    }
    
}
