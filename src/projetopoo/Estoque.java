package projetopoo;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    protected Map<Produto, Integer> produtosEstoque;

    public Estoque() {
        this.produtosEstoque = new HashMap<>();
    }

    public void adicionarProdutoEstoque(Produto produto, int quantidade) {
        produtosEstoque.put(produto, quantidade);
    }

    public void removerProdutoEstoque(Produto produto, int quantidade) {
        int estoqueAtual = produtosEstoque.getOrDefault(produto, 0);
        if (estoqueAtual > quantidade) {
            produtosEstoque.put(produto, estoqueAtual - quantidade);
        } else {
            produtosEstoque.remove(produto);
        }
    }

    public int getQuantidadeEstoque(Produto produto) {
        return produtosEstoque.getOrDefault(produto, 0);
    }
}

