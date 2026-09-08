import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (;;) {
            System.out.print("Digite o código do produto (1 a 40): ");
            int codigo = entrada.nextInt();

            System.out.print("Digite a quantidade comprada: ");
            int quantidade = entrada.nextInt();

            double precoUnitario = 0;

            if (codigo >= 1 && codigo <= 10) {
                precoUnitario = 10.00;
                break;
            } else if (codigo >= 11 && codigo <= 20) {
                precoUnitario = 15.00;
                break;
            } else if (codigo >= 21 && codigo <= 30) {
                precoUnitario = 20.00;
                break;
            } else if (codigo >= 31 && codigo <= 40) {
                precoUnitario = 40.00;
                break;
            } else {
                System.out.println("Código inválido!");
            }
        }

        double precoTotal = precoUnitario * quantidade;
        double valorDesconto = 0;

        if (precoTotal <= 250.00) {
            valorDesconto = precoTotal * 0.05;
        } else if (precoTotal <= 500.00) {
            valorDesconto = precoTotal * 0.10;
        } else {
            valorDesconto = precoTotal * 0.15;
        }

        double precoFinal = precoTotal - valorDesconto;

        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Preço Total da Nota: R$ " + precoTotal);
        System.out.println("Valor do Desconto: R$ " + valorDesconto);
        System.out.println("Preço Final: R$ " + precoFinal);

    }
}