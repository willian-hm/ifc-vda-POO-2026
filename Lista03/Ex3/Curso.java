package Ex3;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }

    public void matricularAluno(Aluno aluno) {
        if (aluno == null) {
            System.out.println("Aluno inválido.");
            return;
        }
        // O aluno centraliza a alteração dos dois lados.
        aluno.matricularCurso(this);
    }

    public void cancelarMatricula(Aluno aluno) {
        if (aluno == null) {
            System.out.println("Aluno inválido.");
            return;
        }
        aluno.cancelarMatricula(this);
    }

    // Métodos internos usados por Aluno, sem chamar a matrícula novamente.
    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("O curso " + nome + " não possui alunos matriculados.");
            return;
        }
        System.out.println("\n=== Alunos de " + nome + " ===");
        for (Aluno alunoAtual : alunos) {
            System.out.println(alunoAtual.getNome() + " - " + alunoAtual.getMatricula());
        }
    }
}
