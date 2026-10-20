import java.util.Scanner;

public class TratamentoErro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int flag = 0;

        do {
            try {
                System.out.println("Escreva o numero para elevar: ");
                int a = teclado.nextInt();

                System.out.println(a * a);
                flag = 1;

                System.out.println("Fim do programa");
            } catch (Exception e) {
                System.out.println("Deu erro!!");
                teclado.nextLine();
            }
        } while (flag != 1);
    }
}