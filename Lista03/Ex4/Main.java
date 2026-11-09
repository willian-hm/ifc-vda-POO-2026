package Ex4;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 25.00);
        Produto p2 = new Produto("Caneta", 3.50);
        Pedido pedido1 = new Pedido(1);
        Pedido pedido2 = new Pedido(2);

        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.adicionarProduto(p2); // Duas unidades de caneta.
        pedido2.adicionarProduto(p1); // Produto existe fora dos pedidos.
        pedido1.listarProdutos();
        pedido2.listarProdutos();

        System.out.println("\n--- Removendo produtos ---");
        pedido1.removerProduto("Caneta");
        pedido1.removerProduto("Borracha");
        pedido1.listarProdutos();
        p2.exibirProduto(); // Remover do pedido não destrói o produto.
    }
}
