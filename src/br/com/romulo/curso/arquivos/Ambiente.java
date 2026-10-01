package br.com.romulo.curso.arquivos;
public class Ambiente {
    private String chave;
    private String descricao;   
    private String dataHora;

    public Ambiente() {
    }
    public Ambiente(String chave, String descricao,String dataHora) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }
    public String getChave() {
        return chave;
    }
    public void setChave(String chave) {
        this.chave = chave;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    
}
