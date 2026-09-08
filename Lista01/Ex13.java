import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        int[] result1 = new int[10];
        int qtdResult1 = 0;

        int[] result2 = new int[10];
        int qtdResult2 = 0;

        System.out.println("Preenchendo o Vetor 1 (10 posições): ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = entrada.nextInt();
        }
        
        System.out.println("\nPreenchendo o Vetor 2 (5 posições): ");
        int somaVetor2 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Posição " + i + ": ");
            vetor2[i] = entrada.nextInt();
            somaVetor2 = somaVetor2 + vetor2[i];
        }

        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) {
                result1[qtdResult1] = vetor1[i] + somaVetor2;
                qtdResult1++;
            } else {
                int divisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
                        divisores++;
                    }
                }
                result2[qtdResult2] = divisores;
                qtdResult2++;
            }
        }

        System.out.println("\n1º Vetor Resultante (Pares de V1 somados a todo V2): ");
        for (int i = 0; i < qtdResult1; i++) {
            System.out.print(result1[i] + "  ");
        }

        System.out.println("\n\n2º Vetor Resultante (Qtd de divisores em V2 para os Ímpares de V1): ");
        for (int i = 0; i < qtdResult2; i++) {
            System.out.print(result2[i] + "  ");
        }
        System.out.println();
    }
}