import java.util.Scanner;

public class CalculoEnergia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();
        
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quantidadeKw = entrada.nextDouble();
        
        double valorKw = salarioMinimo * 0.01; 
        double valorTotal = valorKw * quantidadeKw;
        
        System.out.println("Valor de cada quilowatt: R$ " + valorKw);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }
}