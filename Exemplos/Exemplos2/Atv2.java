package Exemplos2;
/* Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência; */

import java.util.Scanner;

public class Atv2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salMin = 0;
        int quantQ = 0;
        double valor = 0;
        double valorTotal = 0;

        System.out.println("Salario minimo: ");
        salMin = teclado.nextDouble();

        System.out.println("Quantidade de quilowatts: ");
        quantQ = teclado.nextInt();

        valor = salMin * 0.01;
        valorTotal = quantQ * valor;

        System.out.println("Valor do quilowatt: "+ valor);
        System.out.println("Valor a pagar da residencia: "+ valorTotal);
    }
}