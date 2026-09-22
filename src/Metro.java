public class Metro extends Transporte {    

    public Metro() {
    }

    public Metro(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa() {
        // TODO Auto-generated method stub
        return 5.50;
    }    
    
}
