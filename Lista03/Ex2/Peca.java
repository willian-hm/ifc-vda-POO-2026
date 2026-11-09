package Ex2;

public class Peca {
    private String nome;

    // A casa cria suas próprias peças.
    Peca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirPeca() {
        System.out.println("Peça: " + this.nome);
    }
}
