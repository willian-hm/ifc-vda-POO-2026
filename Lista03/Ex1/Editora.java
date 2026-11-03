package Ex1;

public class Editora {
    private int cnpj;
    private String nome;

    public Editora(String nome, int cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getEditora() {
        return nome;
    }

    public void setEditora(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}