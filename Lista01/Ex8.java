import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = entrada.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = entrada.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Erro: O valor pago é menor que o valor da compra!");
        } else {
            // Converte o troco para centavos inteiros para evitar falhas de precisão do 'double'
            int trocoCentavos = (int) Math.round((valorPago - valorCompra) * 100);
            
            double trocoReais = trocoCentavos / 100.0;
            System.out.println("\nTroco a devolver: R$ " + trocoReais);
            System.out.println("--- Distribuição de Notas e Moedas ---");

            int notas200 = trocoCentavos / 20000;
            trocoCentavos = trocoCentavos % 20000;

            int notas100 = trocoCentavos / 10000;
            trocoCentavos = trocoCentavos % 10000;

            int notas50 = trocoCentavos / 5000;
            trocoCentavos = trocoCentavos % 5000;

            int notas20 = trocoCentavos / 2000;
            trocoCentavos = trocoCentavos % 2000;

            int notas10 = trocoCentavos / 1000;
            trocoCentavos = trocoCentavos % 1000;

            int notas5 = trocoCentavos / 500;
            trocoCentavos = trocoCentavos % 500;

            int notas2 = trocoCentavos / 200;
            trocoCentavos = trocoCentavos % 200;

            int moedas1 = trocoCentavos / 100;
            trocoCentavos = trocoCentavos % 100;

            int moedas50 = trocoCentavos / 50;
            trocoCentavos = trocoCentavos % 50;

            int moedas25 = trocoCentavos / 25;
            trocoCentavos = trocoCentavos % 25;

            int moedas10 = trocoCentavos / 10;
            
            if (notas200 > 0) {
                System.out.println(notas200 + " nota(s) de R$ 200.00");
            }
            
            if (notas100 > 0) {
                System.out.println(notas100 + " nota(s) de R$ 100.00");
            }

            if (notas50 > 0) {
                System.out.println(notas50 + " nota(s) de R$ 50.00");
            }

            if (notas20 > 0) {
                System.out.println(notas20 + " nota(s) de R$ 20.00");
            }

            if (notas10 > 0) {
                System.out.println(notas10 + " nota(s) de R$ 10.00");
            }

            if (notas5 > 0) {
                System.out.println(notas5 + " nota(s) de R$ 5.00");
            }

            if (notas2 > 0) {
                System.out.println(notas2 + " nota(s) de R$ 2.00");
            }
            
            if (moedas1 > 0) {
                System.out.println(moedas1 + " moeda(s) de R$ 1.00");
            }

            if (moedas50 > 0) {
                System.out.println(moedas50 + " moeda(s) de 50 centavos");
            }

            if (moedas25 > 0) {
                System.out.println(moedas25 + " moeda(s) de 25 centavos");
            }

            if (moedas10 > 0) {
                System.out.println(moedas10 + " moeda(s) de 10 centavos");
            }
        }

    }
}