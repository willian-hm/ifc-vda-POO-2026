package Exemplos2;
/* Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles. */

import java.util.Scanner;

public class Atv3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        float[] angulos = new float[3];
        float[] lados = new float[3];
        float soma = 0;

        while (true) {
            soma = 0;
            for (int i = 0; i < angulos.length; i++) {
                System.out.println("Digite o " + (i + 1) + " ângulo: ");
                angulos[i] = teclado.nextFloat();
                soma += angulos[i];
            }

            if (soma == 180) {
                break;
            }
        }

        for (int i = 0; i < lados.length; i++) {
            System.out.println("Digite o "+(i+1)+ " lado: ");
            lados[i] = teclado.nextFloat();
        }

        if(lados[0] == lados[1] && lados[1] == lados[2])
        {
            System.out.println("O triângulo é equilátero");
        }
        else if(lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2])
        {
            System.out.println("O triângulo é escaleno");
        }
        else
        {
            System.out.println("O triângulo é isosceles");
        }

        if(angulos[0] < 90 && angulos[1] < 90 && angulos[2] < 90)
        {
            System.out.println("O triangulo é acutangulo");
        }
        else if(angulos[0] == 90 || angulos[1] == 90 || angulos[2] == 90)
        {
            System.out.println("O triangulo é retangulo");
        }
        else
        {
            System.out.println("O triangulo é obtusangulo");
        }

        teclado.close();
    }
}