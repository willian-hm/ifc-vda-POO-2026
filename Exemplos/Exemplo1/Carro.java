//contexto: jogo de corrida
public class Carro{
    
    private String modelo;
    private String cor;
    private double velocidadeAtual;
    private final double VEL_MAX = 200;

    public void acelerar(double velocidade){
        velocidadeAtual += velocidade;
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }

    public void frear(double velocidade){
        velocidadeAtual -= velocidade;
    }

    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.acelerar(40);
        fusca.acelerar(30);

        Carro kombi = new Carro();
        kombi.acelerar(100);
    }
}