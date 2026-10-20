public class Produto {
    
    private String nome;
    private double valor;
    private int quantidade;

    public void definirNome(String nome){
        this.nome = nome;
    }

    public void definirValor(double valor){
        this.valor = valor;
    }
    
    public void definirQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int pegarQuantidade(){
        return  quantidade;
    }

    public String toString(){
        String texto = "Nome: "+nome+
                        "\nValor: "+valor+
                        "\nQuantidade: "+quantidade;
        return texto;
    }

    public double calcularValorTotal(){
        return quantidade * valor;
    }

    public void alterarEstoque(int quantidade){
        if (quantidade<0 && (this.quantidade+quantidade>=0))
        {
            this.quantidade += quantidade;
        }
        else if (quantidade>0)
        {
            this.quantidade += quantidade;
        }
    }
}