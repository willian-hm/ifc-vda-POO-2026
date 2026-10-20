public class MainCarroCorrida {
    public static void main(String[] args) {
        CarroCorrida c1 = new CarroCorrida();
        c1.definirNomeEquipe("EquipeA");

        c1.acelerar();
        System.out.println("Nova velocidade: "+c1.pegarVelocidadeAtual());

        c1.frear();
        System.err.println("Nova velocidade: "+c1.pegarVelocidadeAtual());
    }
}
