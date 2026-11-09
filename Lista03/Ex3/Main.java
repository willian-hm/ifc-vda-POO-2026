package Ex3;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Carlos", "2026001");
        Aluno a2 = new Aluno("Marina", "2026002");
        Curso c1 = new Curso("Programação Orientada a Objetos");
        Curso c2 = new Curso("Banco de Dados");

        a1.matricularCurso(c1);
        a1.matricularCurso(c2);
        c1.matricularAluno(a2); // Também funciona começando pelo curso.
        a1.matricularCurso(c1); // Não permite repetir o mesmo vínculo.

        a1.listarCursos();
        a2.listarCursos();
        c1.listarAlunos();
        c2.listarAlunos();

        System.out.println("\n--- Cancelando uma matrícula ---");
        c1.cancelarMatricula(a1);
        a1.listarCursos();
        c1.listarAlunos();
        a1.cancelarMatricula(c1); // Matrícula que não existe mais.
    }
}
