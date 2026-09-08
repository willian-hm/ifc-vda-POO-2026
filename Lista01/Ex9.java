import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        boolean primo = true; 

        if (numero <= 1) {
            primo = false; 
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break; 
                }
            }
        }

        if (primo == true) {
            System.out.println("O número " + numero + " É PRIMO.");
        } else {
            System.out.println("O número " + numero + " NÃO É PRIMO.");
        }

    }
}