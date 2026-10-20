public class Soldado {
    private int deslocamento;
    private String arma;
    private static int totalExercito = 0;

    public Soldado() {
        this.arma = "fuzil";
        this.deslocamento = 0;
        Soldado.totalExercito++;
    }

    public void movimentar() {
        movimentar(10);
    }

    public void movimentar(int num) {
        System.out.println("O movimento é sexy");
        if (num == -1 || num <= 0) {
            deslocamento += 10; // Distância padrão
        } else {
            deslocamento += num; // Usa a distância que você escolheu
        }
        System.out.println("Andemo " + deslocamento + "m no passinho do jamal");
    }

    public void escolheArma(int op) {
        if (op == 1) {
            arma = "fuzil";
        } else if (op == 2) {
            arma = "baioneta";
        } else if (op == 3) {
            arma = "punho";
        } else {
            arma = "fuzil";
        }
        System.out.println("Arma equipada: " + this.arma);
    }

    public void atacar() {
        if (Soldado.totalExercito < 10) {
            System.out.println("Não ta podendo (Exército atual: " + Soldado.totalExercito + "/10 soldados)");
        } else {
            System.out.println("TA PODENDO! Atacando com " + this.arma + "!");
        }
    }

    public static int getTotalExercito() {
        return totalExercito;
    }
}