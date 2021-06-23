package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        Produto meuProduto = new Produto("Microsoft", Tamanho.GRANDE);

        meuProduto.setNome("Xbox One");
        meuProduto.setValor(500);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso();
        primeiroItemIncluso.setNome("Controle");
        primeiroItemIncluso.setQuantidade(2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso();
        segundoItemIncluso.setNome("Assinatura xbox Live Gold");
        segundoItemIncluso.setQuantidade(1);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso();
        terceiroItemIncluso.setNome("Cabo de energia");
        terceiroItemIncluso.setQuantidade(2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().size());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());


        for (ItemIncluso itematual : meuProduto.getItensInclusos()){
            System.out.println(itematual.getNome());
            System.out.println(itematual.getQuantidade());
        }
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Microsoft" , Tamanho.GRANDE);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getMarca());
        meuProdutoNacional.setValor(30);


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Micrososft", Tamanho.PEQUENO);
        meuProdutoInternacional.setImpostoInternacional(1.32456);
        System.out.println(meuProdutoInternacional.getImpostoInternacional());
        meuProdutoInternacional.setValor(-99.99999);
        System.out.println(meuProdutoInternacional.getValor());


    }
}
