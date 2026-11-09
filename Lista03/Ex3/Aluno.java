package Ex3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Curso> cursos;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Curso> getCursos() {
        // A cópia impede que alguém altere só um lado da associação.
        return new ArrayList<>(cursos);
    }

    public void matricularCurso(Curso curso) {
        if (curso == null) {
            System.out.println("Curso inválido.");
            return;
        }
        if (cursos.contains(curso)) {
            System.out.println("O aluno já está matriculado neste curso.");
            return;
        }
        cursos.add(curso);
        curso.adicionarAluno(this);
        System.out.println(nome + " matriculado em " + curso.getNome() + ".");
    }

    public void cancelarMatricula(Curso curso) {
        if (!cursos.contains(curso)) {
            System.out.println("Matrícula não encontrada.");
            return;
        }
        cursos.remove(curso);
        curso.removerAluno(this);
        System.out.println("Matrícula de " + nome + " cancelada em " + curso.getNome() + ".");
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nome + " não está matriculado em nenhum curso.");
            return;
        }
        System.out.println("\n=== Cursos de " + nome + " ===");
        for (Curso cursoAtual : cursos) {
            System.out.println("Curso: " + cursoAtual.getNome());
        }
    }
}
