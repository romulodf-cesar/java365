import javax.swing.JOptionPane;

public class Algoritmo38 {


    /*
       Básica:
          Objeto
          Classe
          Métodos Workers
          Construtor
          GET e SET
       Avançado
          Herança
          Classe Abstrata
          Encapsulamento
          Interfaces
          Comparativo
          Static         
    */
    public void main(){
       JOptionPane.showMessageDialog(null, "Agência SenaiCar");
       Carro c = new Carro("PWP 4567", 
        220, 
        "hibrido flex",
        "Azul",4);
       JOptionPane.showMessageDialog(null, c.getPlaca()); 
       JOptionPane.showMessageDialog(null, c.getCor()); 
       JOptionPane.showMessageDialog(null, c.getTipoCombustivel()); 
       JOptionPane.showMessageDialog(null, c.getNumPortas()); 
       JOptionPane.showMessageDialog(null, c.getVelocidadeMax()); 
       c.mover();
    }
    
}
