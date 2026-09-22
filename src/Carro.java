public class Carro extends Veiculo{
    private int numPortas;
    public Carro() {
        super();
    }
    public Carro(String placa, int velocidadeMax, 
        String tipoCombustivel, String cor, 
        int numPortas) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    @Override
    public void mover() {
        // TODO Auto-generated method stub
        IO.print("Carro movendo!");
    }
    
    

    
}
