package Ex2;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private ArrayList<Peca> pecas;
    private boolean destruida;

    public Casa(String endereco) {
        this.endereco = endereco;
        this.pecas = new ArrayList<>();
        this.destruida = false;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isDestruida() {
        return destruida;
    }

    public int getQuantidadePecas() {
        return pecas.size();
    }

    // Composição: não recebemos uma peça pronta de outra casa.
    public void adicionarPeca(String nome) {
        if (destruida) {
            System.out.println("A casa foi destruída. Não é possível adicionar peças.");
            return;
        }
        Peca peca = new Peca(nome);
        pecas.add(peca);
        System.out.println("Peça '" + nome + "' adicionada à casa.");
    }

    public void listarPecas() {
        if (destruida) {
            System.out.println("A casa foi destruída e não possui mais peças.");
            return;
        }
        if (pecas.isEmpty()) {
            System.out.println("A casa ainda não possui peças cadastradas.");
            return;
        }
        System.out.println("\n=== Peças da casa em " + endereco + " ===");
        for (Peca pecaAtual : pecas) {
            pecaAtual.exibirPeca();
        }
    }

    public void removerPeca(String nome) {
        if (destruida) {
            System.out.println("A casa já foi destruída.");
            return;
        }
        for (int i = 0; i < pecas.size(); i++) {
            if (pecas.get(i).getNome().equalsIgnoreCase(nome)) {
                pecas.remove(i);
                System.out.println("Peça '" + nome + "' removida.");
                return;
            }
        }
        System.out.println("Peça '" + nome + "' não encontrada.");
    }

    public void destruirCasa() {
        if (destruida) {
            System.out.println("A casa já foi destruída.");
            return;
        }
        // Destruição no modelo: remove as peças e impede novos cadastros.
        pecas.clear();
        destruida = true;
        System.out.println("Casa destruída junto com todas as suas peças.");
    }
}
