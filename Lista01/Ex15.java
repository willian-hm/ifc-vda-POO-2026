import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[][] matriz = new int[7][7];
        int[] maioresLinhas = new int[7];
        int[] menoresColunas = new int[7];

        System.out.println("--- Preenchimento da Matriz 7x7 ---");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 7; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 7; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maioresLinhas[i] = maior;
        }

        for (int j = 0; j < 7; j++) {
            int menor = matriz[0][j]; 
            for (int i = 1; i < 7; i++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
            menoresColunas[j] = menor;
        }

        System.out.println("\nRESULTADOS: ");
        
        System.out.println("\nMatriz Gerada:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }

        System.out.println("\nMaior elemento de cada linha:");
        for (int i = 0; i < 7; i++) {
            System.out.println("Linha " + i + ": " + maioresLinhas[i]);
        }

        System.out.println("\nMenor elemento de cada coluna:");
        for (int j = 0; j < 7; j++) {
            System.out.println("Coluna " + j + ": " + menoresColunas[j]);
        }
    }
}