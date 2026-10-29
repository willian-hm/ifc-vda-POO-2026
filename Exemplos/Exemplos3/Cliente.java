public class Cliente {
    private String nome;
    private char genero;

    public Cliente(String nome, char genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() { 
        return nome; 
    }
    
    public char getGenero() { 
        return genero; 
    }
}