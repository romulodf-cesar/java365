public class Onibus extends Transporte {
    
    
    public Onibus() {
    }

    public Onibus(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa() {
        // TODO Auto-generated method stub
        return 3.80;
    }
    
}
