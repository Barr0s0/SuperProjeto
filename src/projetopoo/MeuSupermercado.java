package projetopoo;

public class MeuSupermercado{
    protected Carrinho carrinhoDeCompras;
    protected Cliente cliente;
    protected Estoque estoque;

    public MeuSupermercado(Cliente cliente, Estoque estoque) {
        this.carrinhoDeCompras = new Carrinho();
        this.cliente = cliente;
        this.estoque = estoque;
    }
    
    public void adicionarProduto(Produto produto) {
        if (estoque.getQuantidadeEstoque(produto) > 0) {
            carrinhoDeCompras.adicionarProduto(produto);
            estoque.removerProdutoEstoque(produto, 1);
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
        } else {
            System.out.println("Desculpe, o produto está fora de estoque: " + produto.getNome());
        }
    }
    
    public void removerProduto(Produto produto) {
        carrinhoDeCompras.removerProduto(produto);
        estoque.adicionarProdutoEstoque(produto, 1);
        System.out.println("Produto removido do carrinho: " + produto.getNome());
    }
    

    public double calcularTotal() {
        return carrinhoDeCompras.calcularTotal();
    }

    public double finalizarCompra(double valorPago) {
        Pagamento pagamento = new Pagamento(valorPago);
        double valorTotal = calcularTotal();
        double troco = pagamento.calcularTroco(valorTotal);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Valor pago: R$ " + valorPago);
        System.out.println("Troco: R$ " + troco);
        return troco;
    }

    public void estoqueAtual() {
        System.out.println("Estoque atual:");
        for (Produto produto : estoque.produtosEstoque.keySet()) {
            int quantidade = estoque.produtosEstoque.get(produto);
            System.out.println(produto.getNome() + ": " + quantidade);
        }
    }
}
