public class Algoritmo34 {

    //ENCAPSULAMENTO
    //public - private - protected - package
    //public - todo mundo acessa
    //private - somente a classe pode acessar
    //protected - apenas as classes autorizadas
    //package - apenas no pacote
    private int primeiroNumero;//atributo
    private int segundoNumero;//atributo
    public void setPrimeiroNumero(int primeiroNumero){
          /* atribuir-receber-guardar "=" */
          this.primeiroNumero=primeiroNumero;
    }
    public int getPrimeiroNumero(){
        return primeiroNumero;
    }
    public void setSegundoNumero(int segundoNumero){
        this.segundoNumero = segundoNumero;
    }
    public int getSegundoNumero(){
        return segundoNumero;
    }
    

}
