import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int inicio, fim;
        if (num1 < num2) {
            inicio = num1;
            fim = num2;
        } else {
            inicio = num2;
            fim = num1;
        }

        System.out.println("\n Fatoriais entre " + inicio + " e " + fim);

        for (int i = inicio; i <= fim; i++) {
            double fatorial = 1;

            for (int j = 1; j <= i; j++) {
                fatorial = fatorial * j;
            }
            
            System.out.println("Fatorial de " + i + "! = " + fatorial);
        }
    }
}