public class Calculadora {

    // Soma de dois inteiros
    public static int somar(int a, int b) {
        return a + b;
    }

    // Soma de dois números reais
    public static double somar(double a, double b) {
        return a + b;
    }

    // Soma de três inteiros
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Soma de todos os elementos de um vetor de inteiros
    public static int somar(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    // Média de dois números reais
    public static double media(double a, double b) {
        return (a + b) / 2.0;
    }

    // Média de todos os elementos de um vetor de inteiros
    public static double media(int[] vetor) {
        if (vetor.length == 0) {
            return 0.0;
        }
        int soma = somar(vetor);
        return (double) soma / vetor.length;
    }
}
