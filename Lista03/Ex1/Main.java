package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Livraria livraria = new Livraria();

        // ================= DADOS INICIAIS PRÉ-CADASTRADOS =================
        Autor a1 = new Autor("Machado de Assis");
        Autor a2 = new Autor("Clarice Lispector");
        Autor a3 = new Autor("J.R.R. Tolkien");
        livraria.getListaAutores().add(a1);
        livraria.getListaAutores().add(a2);
        livraria.getListaAutores().add(a3);

        Editora e1 = new Editora("Companhia das Letras", 11222333);
        Editora e2 = new Editora("Rocco", 44555666);
        Editora e3 = new Editora("HarperCollins", 77888999);
        livraria.getListaEditoras().add(e1);
        livraria.getListaEditoras().add(e2);
        livraria.getListaEditoras().add(e3);

        // Um livro inicial para testar a listagem de cara
        livraria.getListaLivros().add(new Livro("Dom Casmurro", a1, e1, "1899"));

        int op = -1;

        while (op != 0) {
            System.out.println("\n===== SISTEMA DA LIVRARIA =====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Atualizar Editora de um Livro");
            System.out.println("4 - Remover Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            op = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer

            switch (op) {
                case 1:
                    System.out.println("\n--- CADASTRO DE LIVRO ---");
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = entrada.nextLine();

                    System.out.print("Digite o ano de publicação: ");
                    String anoPublicacao = entrada.nextLine();

                    // 1. SELECT DE AUTOR (i + 1 para exibir, opAutor - 1 para buscar)
                    System.out.println("\nSelecione o Autor:");
                    for (int i = 0; i < livraria.getListaAutores().size(); i++) {
                        System.out.println((i + 1) + " - " + livraria.getListaAutores().get(i).getAutor());
                    }
                    System.out.println("0 - Cadastrar um NOVO Autor");
                    System.out.print("Sua escolha: ");
                    int opAutor = entrada.nextInt();
                    entrada.nextLine();

                    Autor autorEscolhido;
                    if (opAutor == 0) {
                        System.out.print("Digite o nome do novo Autor: ");
                        String nomeNovoAutor = entrada.nextLine();
                        autorEscolhido = new Autor(nomeNovoAutor);
                        livraria.adicionarAutor(autorEscolhido);
                    } else if (opAutor > 0 && opAutor <= livraria.getListaAutores().size()) {
                        autorEscolhido = livraria.getListaAutores().get(opAutor - 1);
                    } else {
                        System.out.println("Opção de autor inválida! Cadastro cancelado.");
                        break;
                    }

                    // 2. SELECT DE EDITORA (i + 1 para exibir, opEditora - 1 para buscar)
                    System.out.println("\nSelecione a Editora:");
                    for (int i = 0; i < livraria.getListaEditoras().size(); i++) {
                        Editora ed = livraria.getListaEditoras().get(i);
                        System.out.println((i + 1) + " - " + ed.getEditora() + " (CNPJ: " + ed.getCnpj() + ")");
                    }
                    System.out.println("0 - Cadastrar uma NOVA Editora");
                    System.out.print("Sua escolha: ");
                    int opEditora = entrada.nextInt();
                    entrada.nextLine();

                    Editora editoraEscolhida;
                    if (opEditora == 0) {
                        System.out.print("Digite o nome da nova Editora: ");
                        String nomeNovaEditora = entrada.nextLine();
                        System.out.print("Digite o CNPJ (apenas números): ");
                        int cnpjNovaEditora = entrada.nextInt();
                        entrada.nextLine();

                        editoraEscolhida = new Editora(nomeNovaEditora, cnpjNovaEditora);
                        livraria.adicionarEditora(editoraEscolhida);
                    } else if (opEditora > 0 && opEditora <= livraria.getListaEditoras().size()) {
                        editoraEscolhida = livraria.getListaEditoras().get(opEditora - 1);
                    } else {
                        System.out.println("Opção de editora inválida! Cadastro cancelado.");
                        break;
                    }

                    // 3. CRIA E SALVA O LIVRO
                    Livro novoLivro = new Livro(nomeLivro, autorEscolhido, editoraEscolhida, anoPublicacao);
                    livraria.adicionarLivro(novoLivro);
                    break;

                case 2:
                    livraria.listarLivros();
                    break;

                case 3:
                    System.out.println("\n--- ATUALIZAR EDITORA DE UM LIVRO ---");
                    if (livraria.getListaLivros().isEmpty()) {
                        System.out.println("Não há livros cadastrados para atualizar.");
                        break;
                    }

                    System.out.print("Digite o nome do livro que deseja atualizar: ");
                    String livroParaAtualizar = entrada.nextLine();

                    System.out.println("\nSelecione a NOVA Editora:");
                    for (int i = 0; i < livraria.getListaEditoras().size(); i++) {
                        Editora ed = livraria.getListaEditoras().get(i);
                        System.out.println((i + 1) + " - " + ed.getEditora() + " (CNPJ: " + ed.getCnpj() + ")");
                    }
                    System.out.println("0 - Cadastrar uma NOVA Editora");
                    System.out.print("Sua escolha: ");
                    int opNovaEd = entrada.nextInt();
                    entrada.nextLine();

                    Editora novaEditoraEscolhida;
                    if (opNovaEd == 0) {
                        System.out.print("Digite o nome da nova Editora: ");
                        String nomeNovaEd = entrada.nextLine();
                        System.out.print("Digite o CNPJ (apenas números): ");
                        int cnpjNovaEd = entrada.nextInt();
                        entrada.nextLine();

                        novaEditoraEscolhida = new Editora(nomeNovaEd, cnpjNovaEd);
                        livraria.adicionarEditora(novaEditoraEscolhida);
                    } else if (opNovaEd > 0 && opNovaEd <= livraria.getListaEditoras().size()) {
                        novaEditoraEscolhida = livraria.getListaEditoras().get(opNovaEd - 1);
                    } else {
                        System.out.println("Opção inválida! Atualização cancelada.");
                        break;
                    }

                    livraria.atualizarEditoraDoLivro(livroParaAtualizar, novaEditoraEscolhida);
                    break;

                case 4:
                    System.out.println("\n--- REMOVER LIVRO ---");
                    if (livraria.getListaLivros().isEmpty()) {
                        System.out.println("Não há livros cadastrados para remover.");
                        break;
                    }

                    System.out.print("Digite o nome do livro que deseja remover: ");
                    String livroParaRemover = entrada.nextLine();
                    livraria.removerLivro(livroParaRemover);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        entrada.close();
    }
}