public class Cabeleleila {
    private Cliente[] filaEspera;
    private int posicaoFila; 
    private final static int TAM_FILA = 10;

    public Cabeleleila (String nomeFilial) {
            this.filaEspera = new Cliente[TAM_FILA];
       
    }

    public void cadastrarCliente(String nome, char genero) {
        if (this.posicaoFila < TAM_FILA) {
        Cliente c = new Cliente(nome, genero);
        this.filaEspera[posicaoFila] = c;
        this.posicaoFila++;
        System.out.println("Aguarde " + c.getNome() + " na fila de espera!");
         } else {
            System.out.println("Vaze loco!");
        }
    }

    public boolean chamarProximo() {
        if (posicaoFila>0){
            Cliente c = this.filaEspera[0];
            System.out.println("Sr(a) " + c.getNome() + " chegou a sua vez!");
            this.atualizarFila();
            return true;
        }else {
            return false;
        }
    }

    private void atualizarFila() {
        for (int i = 0; i < posicaoFila-1; i++) {
            filaEspera[i] = filaEspera[i+1];

        }
        this.posicaoFila--;
    }
}