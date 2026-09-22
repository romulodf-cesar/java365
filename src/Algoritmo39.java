import javax.swing.JOptionPane;

public class Algoritmo39 {
    
    /*
       Revisão: Classe Abstrata, Interfaces , Polimorfismo
       Encapsulamento e Static   
       
       Transporte
       Onibus
       Metro
    */
   public void main(){
        Onibus o1 = new Onibus("PCU 5678");
        Onibus o2 = new Onibus("ZRE 4567");
        Onibus o3 = new Onibus("ABC 5277");
        
        Metro m1 = new Metro("RTS 5634");
        Metro m2 = new Metro("BVF 4534");
        Metro m3 = new Metro("BNH 2345");

        String opcao = JOptionPane.showInputDialog("1-Onibus 2-Metro 3-Sair");
        int op = Integer.parseInt(opcao);
        do{
               
                if(op==1){
                    JOptionPane.showMessageDialog(null,o1.calcularTarifa());
                }else if(op==2){
                    JOptionPane.showMessageDialog(null, m1.calcularTarifa());
                }else{
                    JOptionPane.showMessageDialog(null, "opção inválida");
                }

        }while(op != 3);
     
   }

}
