package Ex1;

import java.util.ArrayList;

public class Livraria {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Editora> listaEditoras;
    private ArrayList<Autor> listaAutores;

    public Livraria() {
        this.listaLivros = new ArrayList<>();
        this.listaEditoras = new ArrayList<>();
        this.listaAutores = new ArrayList<>();
    }

    // ================= CREATE (Adicionar) =================
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        System.out.println("O livro '" + livro.getNome() + "' foi adicionado com sucesso!");
    }

    public void adicionarAutor(Autor autor) {
        listaAutores.add(autor);
        System.out.println("O autor '" + autor.getAutor() + "' foi adicionado com sucesso!");
    }

    public void adicionarEditora(Editora editora) {
        listaEditoras.add(editora);
        System.out.println("A editora '" + editora.getEditora() + "' foi adicionada com sucesso!");
    }

    // ================= READ (Listar) =================
    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("A livraria ainda não possui livros cadastrados.");
            return;
        }
        System.out.println("\n=== Catálogo de Livros ===");
        for (Livro livroAtual : listaLivros) {
            livroAtual.exibirLivro();
            System.out.println("-------------------------------");
        }
    }

    // ================= UPDATE (Atualizar) =================
    public void atualizarEditoraDoLivro(String nomeDoLivro, Editora novaEditora) {
        for (Livro livroAtual : listaLivros) {
            if (livroAtual.getNome().equalsIgnoreCase(nomeDoLivro)) {
                livroAtual.setEditora(novaEditora);
                System.out.println("A editora do livro '" + nomeDoLivro + "' foi atualizada para '" + novaEditora.getEditora() + "'!");
                return;
            }
        }
        System.out.println("Livro '" + nomeDoLivro + "' não encontrado para atualização.");
    }

    // ================= DELETE (Remover) =================
    public void removerLivro(String nomeDoLivro) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getNome().equalsIgnoreCase(nomeDoLivro)) {
                listaLivros.remove(i);
                System.out.println("O livro '" + nomeDoLivro + "' foi removido da livraria.");
                return;
            }
        }
        System.out.println("Livro '" + nomeDoLivro + "' não encontrado para remoção.");
    }

    // ================= GETTERS DAS LISTAS (Para o Select na Main) =================
    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public ArrayList<Editora> getListaEditoras() {
        return listaEditoras;
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }
}