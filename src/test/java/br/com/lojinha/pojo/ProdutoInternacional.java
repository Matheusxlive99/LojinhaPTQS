package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double impostoInternacional;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor){
        if (novoValor > -100) {
            this.valor = novoValor;
        }
        else{
            throw new IllegalArgumentException("Valores devem ser maiores do que -100");    //Exceção de argumento inválido
        }
    }

    public double getImpostoInternacional() {
        return this.impostoInternacional;
    }

    public void setImpostoInternacional(double novoimpostoInternacional){
        this.impostoInternacional = novoimpostoInternacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + "e " + this.getValor();
    }
}
