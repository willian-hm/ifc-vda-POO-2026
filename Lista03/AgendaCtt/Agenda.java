import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Recebe o objeto Contato já com seus telefones e emails
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato '" + contato.getNome() + "' adicionado à agenda.");
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                contatos.remove(i);
                System.out.println("O contato '" + nome + "' foi removido da agenda.");
                return;
            }
        }
        System.out.println("Contato '" + nome + "' não encontrado para remoção.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("\nA agenda está vazia.");
            return;
        }
        System.out.println("\n========= AGENDA DE CONTATOS =========");
        for (Contato c : contatos) {
            c.exibirContato();
            System.out.println("--------------------------------------");
        }
    }
}