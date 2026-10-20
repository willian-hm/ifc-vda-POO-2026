public class PrincipalAluno {
    public static void main(String[] args) {
        // Criando aluno com o primeiro construtor
        Aluno a1 = new Aluno("Joao Silva", "2026001");
        a1.lancarNota(0, 8.0);
        a1.lancarNota(1, 7.5);
        a1.lancarNota(2, 12.0); // Nota inválida (deve dar erro e manter 0)
        a1.lancarNota(2, 6.5);  // Lançando nota válida na posição 2

        // Criando aluno com o segundo construtor (passando as 3 notas em um vetor)
        double[] notasMaria = {5.0, 6.0, 4.0};
        Aluno a2 = new Aluno("Maria Souza", "2026002", notasMaria);

        System.out.println("--- Aluno 1 ---");
        a1.exibirBoletim();
        a1.exibirBoletim(false);

        System.out.println("\n--- Aluno 2 ---");
        a2.exibirBoletim(true);
        a2.exibirBoletim(false);
    }
}
