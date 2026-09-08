import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdeMenores18 = 0;
        double somaAlturaGeral = 0;
        int qtdeMais80kg = 0;
        int totalJogadores = 5 * 11;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nDados do Time: " + time);
            double somaIdadeTime = 0;

            for (int jogador = 1; jogador <= 11; jogador++) {
                System.out.println("Jogador " + jogador + ":");
                
                System.out.print("  Idade: ");
                int idade = entrada.nextInt();
                
                System.out.print("  Peso (kg): ");
                double peso = entrada.nextDouble();
                
                System.out.print("  Altura (m): ");
                double altura = entrada.nextDouble();

                // Processando os dados lidos
                if (idade < 18) {
                    qtdeMenores18++;
                }
                
                if (peso > 80.0) {
                    qtdeMais80kg++;
                }

                somaIdadeTime = somaIdadeTime + idade;
                somaAlturaGeral = somaAlturaGeral + altura;
            }

            double mediaIdadeTime = somaIdadeTime / 11.0;
            System.out.println("Média de idade do Time " + time + ": " + mediaIdadeTime + " anos");
        }

        double mediaAlturaGeral = somaAlturaGeral / totalJogadores;
        double porcentagemMais80kg = ((double) qtdeMais80kg / totalJogadores) * 100.0;

        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + qtdeMenores18);
        System.out.println("Média das alturas de todos os jogadores: " + mediaAlturaGeral + " m");
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemMais80kg + "%");
    }
}