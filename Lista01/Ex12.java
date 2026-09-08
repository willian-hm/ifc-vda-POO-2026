import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        
        int[] vetorResultado = new int[20];
        int contadorResultado = 0;

        System.out.println("Digite os 10 números do Vetor 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("\nDigite os 10 números do Vetor 2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor2[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean achouNoOutro = false;
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    achouNoOutro = true;
                    break;
                }
            }
            if (achouNoOutro == false) {
                vetorResultado[contadorResultado] = vetor1[i];
                contadorResultado++;
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean achouNoOutro = false;
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    achouNoOutro = true;
                    break;
                }
            }
            if (achouNoOutro == false) {
                vetorResultado[contadorResultado] = vetor2[i];
                contadorResultado++;
            }
        }

        System.out.println("\n--- Números NÃO COMUNS aos dois vetores ---");
        if (contadorResultado == 0) {
            System.out.println("Todos os números são comuns aos dois vetores!");
        } else {
            for (int i = 0; i < contadorResultado; i++) {
                System.out.print(vetorResultado[i] + "  ");
            }
            System.out.println();
        }
    }
}