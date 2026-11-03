package Ex1;

public class Livro {
    private String nome;
    private Autor autor;
    private Editora editora;
    private String dataPublicacao;

    public Livro(String nome, Autor autor, Editora editora, String dataPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }

    public void exibirLivro() {
        System.out.println("Livro: " + this.nome);
        System.out.println("Ano de Publicação: " + this.dataPublicacao);
        System.out.println("Autor: " + this.autor.getAutor());
        System.out.println("Editora: " + this.editora.getEditora() + " (CNPJ: " + this.editora.getCnpj() + ")");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}