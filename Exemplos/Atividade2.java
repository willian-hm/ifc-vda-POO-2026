import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args){
        String[] alunos = new String[5];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < alunos.length; i++){
            System.out.print("Digite um nome: ");
            alunos[i] = teclado.next();
        }

        System.out.println("============== Alunos =================");

        for (String nome : alunos) {
            System.out.println("Nome: " + nome);
        }

        teclado.close();
    }
}