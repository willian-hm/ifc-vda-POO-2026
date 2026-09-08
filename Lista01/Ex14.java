import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[] codigos = new int[10];
        double[] saldos = new double[10];

        System.out.println("Cadastro de Contas: ");
        
        for (int i = 0; i < 10; i++) {
            boolean codigoRepetido;
            int codigoDigitado;
            
            do {
                codigoRepetido = false;
                System.out.print("\nDigite o código da " + (i + 1) + "ª conta: ");
                codigoDigitado = entrada.nextInt();
                
                for (int j = 0; j < i; j++) {
                    if (codigos[j] == codigoDigitado) {
                        codigoRepetido = true;
                        System.out.println("Código já existe. Tente outro.");
                        break;
                    }
                }
            } while (codigoRepetido == true);
            
            codigos[i] = codigoDigitado;
            System.out.print("Digite o saldo da conta " + codigos[i] + ": R$ ");
            saldos[i] = entrada.nextDouble();
        }

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n===== MENU BANCÁRIO =====");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar o ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            if (opcao == 1 || opcao == 2) {
                System.out.print("Digite o código da conta: ");
                int codigoConta = entrada.nextInt();
                
                int indiceConta = -1;
                for (int i = 0; i < 10; i++) {
                    if (codigos[i] == codigoConta) {
                        indiceConta = i;
                        break;
                    }
                }

                if (indiceConta == -1) {
                    System.out.println("Conta não encontrada!");
                } else {
                    if (opcao == 1) { // DEPÓSITO
                        System.out.print("Digite o valor do depósito: R$ ");
                        double valorDeposito = entrada.nextDouble();
                        saldos[indiceConta] = saldos[indiceConta] + valorDeposito;
                        System.out.println("Depósito realizado! Novo saldo: R$ " + saldos[indiceConta]);
                    } 
                    else if (opcao == 2) { // SAQUE
                        System.out.print("Digite o valor do saque: R$ ");
                        double valorSaque = entrada.nextDouble();
                        
                        if (saldos[indiceConta] >= valorSaque) {
                            saldos[indiceConta] = saldos[indiceConta] - valorSaque;
                            System.out.println("Saque realizado! Novo saldo: R$ " + saldos[indiceConta]);
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                    }
                }
            } 
            else if (opcao == 3) { // ATIVO BANCÁRIO
                double ativoTotal = 0;
                for (int i = 0; i < 10; i++) {
                    ativoTotal = ativoTotal + saldos[i];
                }
                System.out.println("\nO ativo bancário total (soma de todos os saldos) é: R$ " + ativoTotal);
            } 
            else if (opcao == 4) {
                System.out.println("Finalizando programa...");
            } 
            else {
                System.out.println("Opção inválida!");
            }
        }

    }
}