public class Algoritmo33 {    
    private int chave; //atributo

    //"Aqui existe um contrutor oculto" Natalia
    // 5
    public void inserirChave(int c){
        chave = c;
    }
    public int retornarChave(){
        return chave;
    }   
    public String abrirPorta(){
        String resposta;
        if(chave==7){
           resposta = "A porta verde-água se abre;";
        }else{
           resposta = "A porta de cobre se abre";
        }
        return resposta;
    }
}
