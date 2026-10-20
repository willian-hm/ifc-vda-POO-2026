public class Pessoa {
    
    private String nome;
    private char sexo; //M (masculino), F (feminino), N (não informado)
    private int anoNascimento;

    public void definirNome(String nome){
        this.nome = nome;
    }

    public void definirSexo(char sexo){
        this.sexo = sexo;
    }

    public  void definirAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void cumprimentar(){
        if (sexo == 'M')
        {
            System.out.println("Olá "+ nome +". Seja bem-vindo!");
        }
        else if (sexo == 'F') 
        {
            System.out.println("Olá "+ nome +". Seja bem-vinda!");
        }
        else if (sexo == 'N')
        {
            System.out.println("Olá "+ nome +". Seja bem-vindo(a)!");
        }
    }

    public int calcularIdade(){
        return 2026 - anoNascimento;
    }
}
