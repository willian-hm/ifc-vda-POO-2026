public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    // Construtor 1: nome e matrícula (notas iniciam com 0)
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
        this.notas[0] = 0.0;
        this.notas[1] = 0.0;
        this.notas[2] = 0.0;
    }

    // Construtor 2: nome, matrícula e vetor com as 3 notas
    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
        for (int i = 0; i < 3; i++) {
            if (i < notas.length && notas[i] >= 0 && notas[i] <= 10) {
                this.notas[i] = notas[i];
            } else {
                this.notas[i] = 0.0;
            }
        }
    }

    // Sobrecarga extra caso as 3 notas sejam passadas separadamente
    public Aluno(String nome, String matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
        lancarNota(0, n1);
        lancarNota(1, n2);
        lancarNota(2, n3);
    }

    public boolean lancarNota(int posicao, double nota) {
        if (posicao >= 0 && posicao <= 2 && nota >= 0.0 && nota <= 10.0) {
            this.notas[posicao] = nota;
            return true;
        } else {
            System.out.println("Erro: Posicao ou nota invalida! (Posicao: " + posicao + ", Nota: " + nota + ")");
            return false;
        }
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (int i = 0; i < 3; i++) {
            soma = soma + this.notas[i];
        }
        return soma / 3.0;
    }

    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }

    public void exibirBoletim() {
        System.out.println("=== Boletim Completo ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nota 1: " + this.notas[0]);
        System.out.println("Nota 2: " + this.notas[1]);
        System.out.println("Nota 3: " + this.notas[2]);
        System.out.println("Media: " + calcularMedia());
        System.out.println("Situacao: " + getSituacao());
    }

    public void exibirBoletim(boolean detalhado) {
        if (detalhado) {
            exibirBoletim();
        } else {
            System.out.println("=== Boletim Resumido ===");
            System.out.println("Nome: " + this.nome + " | Situacao: " + getSituacao());
        }
    }
}
