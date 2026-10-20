public class MainSoldado {
    public static void main(String[] args) {
        System.out.println("=== CRIANDO O PRIMEIRO SOLDADO ===");
        Soldado s1 = new Soldado();

        // Testando a movimentação
        s1.movimentar(5);  // Vai andar 5 (total: 5)
        s1.movimentar(-1); // Vai cair no padrão de 10 (total: 15)
        s1.movimentar();   // Usando a sobrecarga sem parâmetro, anda +10 (total: 25)

        System.out.println("\n=== ESCOLHENDO ARMA E TENTANDO ATACAR ===");
        s1.escolheArma(2); // Escolhe baioneta
        s1.atacar();       // Vai dar "Não ta podendo", pois só existe 1 soldado

        System.out.println("\n=== RECRUTANDO MAIS 9 SOLDADOS ===");
        for (int i = 0; i < 9; i++) {
            new Soldado(); // Cada new Soldado() aciona o construtor e soma +1 no totalExercito
        }

        System.out.println("Total de soldados agora: " + Soldado.getTotalExercito());

        System.out.println("\n=== TENTANDO ATACAR NOVAMENTE ===");
        s1.atacar(); // Agora tem 10 soldados, então "TA PODENDO!"
    }
}