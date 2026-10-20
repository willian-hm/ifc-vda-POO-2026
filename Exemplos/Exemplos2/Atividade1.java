package Exemplos2;
import java.util.Scanner;

public class Atividade1{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Entre com o 1o operando: ");
        int num1 = teclado.nextInt();

        System.out.print("Entre com o 2o operando: ");
        int num2 = teclado.nextInt();

        System.out.print("Entre com o operador: ");
        teclado.nextLine();
        String ope = teclado.nextLine();

        if(ope.equals("+"))
        {
            System.out.println(num1 + ope + num2 + " = " + (num1 + num2));
        }
        else if (ope.equals("*")) 
        {
            System.out.println(num1 + ope + num2 + " = " + (num1 * num2));
        }
        else if (ope.equals("-"))
        {
            System.out.println(num1 + ope + num2 + " = " + (num1 - num2));
        }
        else if (ope.equals("/"))
        {
            System.out.println(num1 + ope + num2 + " = " + (num1 / num2));
        }
        else
        {
            System.out.println("Operação inválida!");
        }

        teclado.close();
    }
}