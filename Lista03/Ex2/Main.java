package Ex2;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Rua das Flores, 100");

        casa.adicionarPeca("Quarto");
        casa.adicionarPeca("Sala");
        casa.adicionarPeca("Banheiro");
        casa.listarPecas();

        System.out.println("\n--- Removendo uma peça ---");
        casa.removerPeca("Sala");
        casa.removerPeca("Garagem"); // Peça que não existe.
        casa.listarPecas();

        System.out.println("\n--- Destruindo a casa ---");
        casa.destruirCasa();
        casa.listarPecas();
        casa.adicionarPeca("Cozinha"); // Casa destruída não recebe peças.
    }
}
