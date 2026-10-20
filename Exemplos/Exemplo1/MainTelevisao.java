import java.util.Scanner;

public class MainTelevisao {
    public static void main(String[] args) {

        int op = 0;

        Scanner teclado = new Scanner(System.in);
        Televisao tv1 = new Televisao("LG");

        while(2>1){
            System.out.println("Escolha uma opção: \n1 - Ligar/Desligar\n2 - Aumentar volume\n3 - Diminuir Volume\n4 - Aumentar Canal\n5 - Diminuir Canal\n6 - Escolher canal\n7 - Exibir tela");
            op = teclado.nextInt();

            if(op == 1){
                tv1.ligaDesliga();
            }
            else if(op == 2){
                tv1.aumentarVolume();
            }
            else if(op == 3){
                tv1.diminuirVolume();
            }
            else if(op == 4){
                tv1.aumentarCanal();
            }
            else if(op == 5){
                tv1.diminuirCanal();
            }
            else if(op == 6){
                System.out.println("Qual canal vc quer?\n");
                int canal = teclado.nextInt();
                tv1.setCanal(canal);
            }
            else if(op == 7){
                tv1.exibirTela();
            }
        }
    }
}