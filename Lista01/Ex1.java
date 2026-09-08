import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();
        
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = entrada.nextDouble();
        
        double salarioBruto = horasTrabalhadas * valorHora;
        double imposto = salarioBruto * 0.30;
        double salarioReceber = salarioBruto - imposto;
 
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto (30%): R$ " + imposto);
        System.out.println("Salário a receber: R$ " + salarioReceber);
    }
}