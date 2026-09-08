import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º ângulo: ");
        double ang1 = entrada.nextDouble();
        System.out.print("Digite o 2º ângulo: ");
        double ang2 = entrada.nextDouble();
        System.out.print("Digite o 3º ângulo: ");
        double ang3 = entrada.nextDouble();

        System.out.print("Digite o 1º lado: ");
        double l1 = entrada.nextDouble();
        System.out.print("Digite o 2º lado: ");
        double l2 = entrada.nextDouble();
        System.out.print("Digite o 3º lado: ");
        double l3 = entrada.nextDouble();

        System.out.println("\n--- Classificação do Triângulo ---");

        if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            System.out.println("Quanto aos ângulos: Retângulo");
        } else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
            System.out.println("Quanto aos ângulos: Obtusângulo");
        } else {
            System.out.println("Quanto aos ângulos: Acutângulo");
        }

        if (l1 == l2 && l2 == l3) {
            System.out.println("Quanto aos lados: Equilátero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Quanto aos lados: Isósceles");
        } else {
            System.out.println("Quanto aos lados: Escaleno");
        }
    }
}