import java.util.Random;

public class ContaCorrente {
    
    private String nome;
    private String cpf;
    private String telefone;
    private int agencia;
    private int numeroConta;
    private double saldo;

    public ContaCorrente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = "";
        this.agencia = 100;
        this.saldo = 0;
        this.numeroConta = gerarNumeroCC();
    }

    public ContaCorrente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.telefone = "";
        this.agencia = 100;
        this.saldo = 0;
        this.numeroConta = gerarNumeroCC();
    }

    private int gerarNumeroCC(){
        Random r = new Random();

        return r.nextInt(99999);
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf.substring(0, 5) + "...........";
    }

    public String getTelefone(){
        return this.telefone;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public int getNumeroCC(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void depositar(double valor){
        //validação humana
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, ContaCorrente destino){
        if(valor <= saldo){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

}