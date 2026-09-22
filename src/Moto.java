public class Moto extends Veiculo implements IManutencao,IMeusImpostos {
    
    private  Boolean temBau;
    
    public Moto(String placa, int velocidadeMax, 
        String tipoCombustivel, String cor, Boolean temBau) {
        super(placa, velocidadeMax, 
            tipoCombustivel, cor);
        this.temBau = temBau;
    }

    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    public void mover() {
        // TODO Auto-generated method stub
        IO.print("a moto se moveu!");
    }

    @Override
    public void adicionar() {
        // TODO Auto-generated method stub
        IO.print("Impostos adicionados");
    }

    @Override
    public void revisaoProgramada() {
        // TODO Auto-generated method stub
        IO.println("Faça a revisão com a taxa de:"+IManutencao.TAXA);
    }

    
}
