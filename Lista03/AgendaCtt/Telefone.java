public class Telefone {
    private String numero;
    private Rotulo rotulo;

    public Telefone(String numero) {
        this.numero = numero;
        this.rotulo = Rotulo.PESSOAL;
    }

    public Telefone(String numero, Rotulo rotulo) {
        this.numero = numero;
        this.rotulo = rotulo;
    }

    public String getNumero() {
        return numero;
    }

    public Rotulo getRotulo() {
        return rotulo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setRotulo(Rotulo rotulo) {
        this.rotulo = rotulo;
    }

    public void exibirTelefone() {
        System.out.println("Telefone: " + this.numero + " ("+this.rotulo+")");
    }
}
