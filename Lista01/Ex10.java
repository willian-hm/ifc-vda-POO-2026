import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int quantidadePrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = entrada.nextInt();

            boolean primo = true;

            if (numero <= 1) {
                primo = false;
            } else {
                for (int j = 2; j < numero; j++) {
                    if (numero % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo == true) {
                quantidadePrimos++;
            }
        }

        System.out.println("\nResumo: Você digitou " + quantidadePrimos + " número(s) primo(s)");
    }
}