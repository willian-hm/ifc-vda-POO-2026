package Ex4;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<Produto> produtos;

    public Pedido(int numero) {
        this.numero = numero;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public ArrayList<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public void adicionarProduto(Produto produto) {
        if (produto == null) {
            System.out.println("Produto inválido.");
            return;
        }
        // Cada adição representa uma unidade do produto.
        produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado ao pedido.");
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
                System.out.println("Uma unidade de '" + nome + "' foi removida.");
                return;
            }
        }
        System.out.println("Produto '" + nome + "' não encontrado no pedido.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produtoAtual : produtos) {
            total = total + produtoAtual.getPreco();
        }
        return total;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O pedido " + numero + " está vazio.");
            return;
        }
        System.out.println("\n=== Produtos do pedido " + numero + " ===");
        for (Produto produtoAtual : produtos) {
            produtoAtual.exibirProduto();
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}
