import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linhas = 0;

        while (true) {
            System.out.print("Digite um número (<= 0 para sair): ");
            double valor = entrada.nextDouble();

            if (valor <= 0) {
                System.out.println("Programa encerrado");
                break;
            }

            if (linhas % 20 == 0) {
                System.out.println("-------------------------------------------------");
                System.out.println("VALOR\t|\tCUBO\t|\tRAIZ QUADRADA");
                System.out.println("-------------------------------------------------");
            }

            double cubo = valor * valor * valor;
            double raiz = Math.sqrt(valor);

            System.out.println(valor + "\t|\t" + cubo + "\t|\t" + raiz);
            
            linhas++;
        }
    }
}