public class PrincipalTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo();
        Tempo t2 = new Tempo(7);
        Tempo t3 = new Tempo(7, 30);
        Tempo t4 = new Tempo(1, 0, 0);
        Tempo tInvalido = new Tempo(25, 70, 90); // Deve virar 00:00:00

        System.out.println("Tempo 1 (sem parametros): " + t1.toString());
        System.out.println("Tempo 2 (apenas hora): " + t2.toString());
        System.out.println("Tempo 3 (hora e minuto): " + t3.toString());
        System.out.println("Tempo 4 (completo): " + t4.toString());
        System.out.println("Tempo invalido: " + tInvalido.toString());

        System.out.println("\nTempo 4 em segundos: " + t4.tempoEmSegundos());
        System.out.println("Diferenca entre t3 (07:30:00) e t4 (01:00:00): " + t3.diferencaTempo(t4) + " segundos");

        System.out.println("\nAlterando hora de t1 para 10: " + t1.setHora(10));
        System.out.println("Alterando minuto de t1 para 80 (invalido): " + t1.setMinuto(80));
        System.out.println("Tempo 1 atualizado: " + t1.toString());
    }
}
