
import java.util.Scanner;

public class Turma {

    public static void main(String[] args) {
        float[] notas = new float[5];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite uma nota (0 a 10): ");
            notas[i] = teclado.nextFloat();
        }

        float menor = notas[0];
        float maior = notas[0];
        float soma = 0;
        float media = 0;

        for (int i = 0; i < notas.length; i++) {

            if(notas[i] > maior)
            {
                maior = notas[i];
            }

            if(notas[i] < menor)
            {
                menor = notas[i];
            }

            soma += notas[i];
        }

        media = soma/notas.length;

        System.out.println("A maior nota é: "+ maior);
        System.out.println("A menor nota é "+ menor);
        System.out.println("A media é "+ media);

        teclado.close();
    }
}