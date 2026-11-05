public class Email {
    private String email;
    private Rotulo rotulo;

    public Email (String email) {
        this.email = email;
        this.rotulo = Rotulo.PESSOAL;
    }

    public Email(String email, Rotulo rotulo) {
        this.email = email;
        this.rotulo = rotulo;
    }

    public String getEmail() {
        return email;
    }

    public Rotulo getRotulo() {
        return rotulo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRotulo(Rotulo rotulo) {
        this.rotulo = rotulo;
    }

    public void exibirEmail () {
        System.out.println("Email: " + this.email + " ("+this.rotulo+")");
    }
}
