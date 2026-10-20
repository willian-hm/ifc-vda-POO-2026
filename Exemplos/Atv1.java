import java.util.Scanner;

public class Atv1{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double horas;
        double valorHora;
        double salBruto;
        double salLiq;

        System.out.print("Numero de horas trabalhadas: ");
        horas = teclado.nextDouble();

        System.out.print("Valor da hora trabalhada: ");
        valorHora = teclado.nextDouble();

        salBruto = horas * valorHora;

        salLiq = salBruto - (salBruto * 0.3);

        System.out.println("O salario liquido é: "+ salLiq);
    }
}