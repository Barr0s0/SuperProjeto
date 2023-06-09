package projetopoo;


public class ProjetoPoo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Rua Principal, 123", "123456789");
        Estoque estoque = new Estoque();

        Produto arroz = new Produto("Arroz", 10.99);
        Produto feijao = new Produto("Feijão", 5.99);
        Produto macarrao = new Produto("Macarrão", 4.49);

        estoque.adicionarProdutoEstoque(arroz, 10);
        estoque.adicionarProdutoEstoque(feijao, 5);
        estoque.adicionarProdutoEstoque(macarrao, 8);
        
        
        CaixaRegistradora caixa = new CaixaRegistradora(cliente, estoque);
        caixa.adicionarProduto(arroz);
        caixa.adicionarProduto(feijao);
        caixa.adicionarProduto(macarrao);

        double total = caixa.calcularTotal();
        System.out.println("Total da compra: R$ " + total);

        double troco = caixa.finalizarCompra(30.0);
        System.out.println("Troco: R$ " + troco);
        
        caixa.estoqueAtual();
    }
}


