package Ex4;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0 && Double.isFinite(preco)) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! O valor anterior foi mantido.");
        }
    }

    public void exibirProduto() {
        System.out.printf("Produto: %s | Preço: R$ %.2f%n", nome, preco);
    }
}
