package Ex5;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private String data;
    private ArrayList<Participante> participantes;

    public Evento(String nome, String data) {
        this.nome = nome;
        this.data = data;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Participante> getParticipantes() {
        return new ArrayList<>(participantes);
    }

    public void inscreverParticipante(Participante participante) {
        if (participante == null || participante.getEmail() == null
                || participante.getEmail().trim().isEmpty()) {
            System.out.println("Participante ou email inválido.");
            return;
        }
        for (Participante participanteAtual : participantes) {
            if (participanteAtual.getEmail().equalsIgnoreCase(participante.getEmail())) {
                System.out.println("Este email já está inscrito no evento.");
                return;
            }
        }
        participantes.add(participante);
        System.out.println(participante.getNome() + " inscrito em " + nome + ".");
    }

    public void cancelarInscricao(String email) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).getEmail().equalsIgnoreCase(email)) {
                participantes.remove(i);
                System.out.println("Inscrição de '" + email + "' cancelada.");
                return;
            }
        }
        System.out.println("Inscrição não encontrada.");
    }

    public int getTotalInscricoes() {
        return participantes.size();
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("O evento " + nome + " ainda não possui inscrições.");
            return;
        }
        System.out.println("\n=== " + nome + " | " + data + " ===");
        for (Participante participanteAtual : participantes) {
            participanteAtual.exibirParticipante();
        }
        System.out.println("Total de inscrições: " + getTotalInscricoes());
    }
}
