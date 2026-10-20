public class MainPessoa {
    
    public static void main(String[] args) {
        Pessoa velacio = new Pessoa();
        velacio.definirNome("Velacio Tramontin");
        velacio.definirSexo('M');
        velacio.definirAnoNascimento(2003);

        velacio.cumprimentar();
        System.out.println("Idade: "+velacio.calcularIdade());
    }
}
