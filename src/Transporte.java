public abstract class Transporte {

    private String placa;
    public Transporte(){
        super();
    }
    public Transporte(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    public abstract double calcularTarifa();
    
}
