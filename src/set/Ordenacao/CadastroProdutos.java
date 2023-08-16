package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributos

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosSet.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(10L, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(24L, "Produto 2", 125d, 155);
        cadastroProdutos.adicionarProduto(25L, "Produto 3", 166d, 503);
        cadastroProdutos.adicionarProduto(62L, "Produto 4", 163d, 5204);
        cadastroProdutos.adicionarProduto(22L, "Produto 5", 925d, 535);
        cadastroProdutos.adicionarProduto(84L, "Produto 6", 732d, 1535);
    }
}
