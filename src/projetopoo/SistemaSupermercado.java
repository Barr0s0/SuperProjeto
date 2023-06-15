package projetopoo;

public abstract class SistemaSupermercado {
    protected Carrinho carrinhoDeCompras;
    protected Cliente cliente;
    protected Estoque estoque;

    public SistemaSupermercado(Cliente cliente, Estoque estoque) {
        this.carrinhoDeCompras = new Carrinho();
        this.cliente = cliente;
        this.estoque = estoque;
    }
    
    public abstract void adicionarProduto(Produto produto);

    public abstract void removerProduto(Produto produto);

    public abstract double calcularTotal();

    public abstract double finalizarCompra(double valorPago);

    public abstract void estoqueAtual();
}
