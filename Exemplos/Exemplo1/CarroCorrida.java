public class CarroCorrida {
    private double velocidadeAtual;
    private final double VEL_MAX = 200;
    private String nomeEquipe;
    private boolean estado = false;

    public void definirNomeEquipe(String nomeEquipe){
        this.nomeEquipe = nomeEquipe;
    }

    public double pegarVelocidadeAtual(){
        return velocidadeAtual;
    }

    public String pegarNomeEquipe(){
        return nomeEquipe;
    }

    public boolean pegarEstado(){
        return estado;
    }

    public void ligar(){
        estado = true;
    }

    public void desligar(){
        estado = false;
    }

    public void acelerar(){
        if (estado == true) {
            if (this.velocidadeAtual < VEL_MAX) {
                velocidadeAtual += 5;
            }
        }
    }

    public void frear(){
        if (estado == true) {
            if (velocidadeAtual - 10 < 0) 
            {
                velocidadeAtual = 0;
            }
            else
            {
                velocidadeAtual -= 10;
            }
        }
    }
}
