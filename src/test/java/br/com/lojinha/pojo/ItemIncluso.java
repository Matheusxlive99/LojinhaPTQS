package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nomeItem;
    private int quantidade;


    public String getNome(){
    return this.nomeItem;
    }

    public void setNome(String novoNomeItem){
    this.nomeItem = novoNomeItem;
    }

    public int getQuantidade(){
    return this.quantidade;
    }

    public void setQuantidade(int novaQuantidade){
    this.quantidade = novaQuantidade;
    }

}