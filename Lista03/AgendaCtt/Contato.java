import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<Email> emails;
    private List<Telefone> telefones;

    public Contato(String nome) {
        this.nome = nome;
        this.emails = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarEmail(String textoEmail, Rotulo rot) {
        Email email = new Email(textoEmail, rot);
        emails.add(email);
    }

    public void adicionarTelefone(String num, Rotulo rot) {
        Telefone telefone = new Telefone(num, rot);
        telefones.add(telefone);
    }

    public void listarEmails() {
        if (emails.isEmpty()) {
            System.out.println("  Nenhum email cadastrado.");
            return;
        }
        for (Email emailAtual : emails) {
            System.out.print("  - ");
            emailAtual.exibirEmail();
        }
    }

    public void listarTelefones() {
        if (telefones.isEmpty()) {
            System.out.println("  Nenhum telefone cadastrado.");
            return;
        }
        for (Telefone telefoneAtual : telefones) {
            System.out.print("  - ");
            telefoneAtual.exibirTelefone();
        }
    }

    public void removerEmail(String email) {
        for (int i = 0; i < emails.size(); i++) {
            if (emails.get(i).getEmail().equalsIgnoreCase(email)) {
                emails.remove(i);
                System.out.println("Email '" + email + "' removido com sucesso!");
                return;
            }
        }
        System.out.println("O email '" + email + "' não foi encontrado!");
    }

    public void removerTelefone(String numero) {
        for (int i = 0; i < telefones.size(); i++) {
            if (telefones.get(i).getNumero().equalsIgnoreCase(numero)) {
                telefones.remove(i);
                System.out.println("Telefone '" + numero + "' removido com sucesso!");
                return;
            }
        }
        System.out.println("O telefone '" + numero + "' não foi encontrado!");
    }

    public void exibirContato() {
        System.out.println("Contato: " + this.nome);
        System.out.println("Telefones:");
        listarTelefones();
        System.out.println("Emails:");
        listarEmails();
    }
}