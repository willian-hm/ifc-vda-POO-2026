package Ex5;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Semana da Informática", "20/11/2026");
        Evento evento2 = new Evento("Oficina de Java", "21/11/2026");
        Participante p1 = new Participante("Carlos", "carlos@email.com");
        Participante p2 = new Participante("Marina", "marina@email.com");

        evento1.inscreverParticipante(p1);
        evento1.inscreverParticipante(p2);
        evento1.inscreverParticipante(p1); // Não repete a inscrição.
        evento2.inscreverParticipante(p1); // Pode participar de outro evento.
        evento1.listarParticipantes();
        evento2.listarParticipantes();

        System.out.println("\n--- Cancelando uma inscrição ---");
        evento1.cancelarInscricao("carlos@email.com");
        evento1.cancelarInscricao("inexistente@email.com");
        evento1.listarParticipantes();
        evento2.listarParticipantes(); // A outra inscrição continua existindo.
    }
}
