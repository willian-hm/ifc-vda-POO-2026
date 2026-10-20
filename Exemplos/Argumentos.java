public class Argumentos {
    
    public static void main(String[] args) {
        if (args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int soma = a + b;

            System.out.println("Resultado da soma: "+ soma);
        }else{
            System.out.println("Forneça 2 números inteiros como parametro.");
        }
    }
}
