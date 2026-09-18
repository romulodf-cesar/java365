public class Algoritmo37 {    
    void main(){
        /*        
           Exemplo Didático
            - Herança
            - super()
            - Redefinição do Construtor
            - Polimorfismo
            - Sobrescrita (override)
            - Sobrecarga        
        */
       Cachorro c = new Cachorro("Rex", 
                         "auau.mp3");
       IO.println("nome:"+c.getNome());
       c.comer();
       c.tocarSom();
       
       Gato g = new Gato("Juliano",
        "miau.mp3");
       IO.println("nome:"+g.getNome()); 
       g.comer();
       g.tocarSom();
    }
}
