package Exemplos2;
/* Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:

• a quantidade de jogadores com idade inferior a 18 anos;
• a média das idades dos jogadores de cada time;
• a média das alturas de todos os jogadores do campeonato;
• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato. */

import java.util.Scanner;

public class Atv5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade = 0;
        int quantIdade = 0;
        int somaIdade = 0;

        for (int i = 0; i < 5; i++) {
            somaIdade = 0;
            for (int j = 0; j < 2; j++) {
                System.out.println("Qual a idade do jogador "+(j+1)+" do time "+(i+1));
                idade = teclado.nextInt();

                System.out.println("");

                if(idade < 18)
                {
                    quantIdade++;
                }

                somaIdade += idade;
            }

            System.out.println("A media das idades dos jogadores do time "+(i+1)+"é: "+(somaIdade/2));
        }

        System.out.println("A quantidade de jogadores com idade < 18 é: "+quantIdade);
    }
}