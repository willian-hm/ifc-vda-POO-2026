public class Televisao {
    private boolean ligada;
    private String modeloMarca;
    private int volume;
    private final int VOL_MIN;
    private final int VOL_MAX;
    private int[] canais;
    private final int QUANT_CANAIS;
    private int iCanalAtual;

    //metodo contrutor (public *Nome da classe*): não tem retorno e public, pode ter parametros ou nao
    public Televisao(String modeloMarca){
        this.ligada = false;
        this.modeloMarca = modeloMarca;
        this.volume = 25;
        this.VOL_MIN = 0;
        this.VOL_MAX = 100;
        this.QUANT_CANAIS = 50;
        this.canais = new int[QUANT_CANAIS]; // cria um array de 50 canais 0
        this.iCanalAtual = 0; //indice do canal atual (no array)
        iniciarCanais(); // inicializa o array com canais reais
    }

    private void iniciarCanais(){ // metodo que nao precisa ser acessado pelo usuario, é importante que seja private, só acessada pela propria classe (encapsulamento)
/*         this.canais[0] = 4;
        this.canais[1] = 10;
        this.canais[2] = 12;
        this.canais[3] = 15;
        this.canais[4] = 27; */
        for (int i = 0; i < canais.length; i++) {
            this.canais[i] = i+1;
        } 
    }

    public void ligaDesliga(){
        ligada = !ligada;
    }

    public boolean isLigada(){
        return ligada;
    }

    public void aumentarVolume(){
        if(isLigada() && volume < VOL_MAX){
            volume++;
        }
    }

    public void diminuirVolume(){
        if(isLigada() && volume > VOL_MIN){
            volume--;
        }
    }

    public void aumentarCanal(){
        if(isLigada() && iCanalAtual < (QUANT_CANAIS-1)){
            iCanalAtual++;
        }
        else if(isLigada() && iCanalAtual == (QUANT_CANAIS-1)){
            iCanalAtual = 0;
        }
    }

    public void diminuirCanal(){
        if(isLigada() && iCanalAtual > 0){
            iCanalAtual--;
        }
        else if(isLigada() && iCanalAtual == 0){
            iCanalAtual = QUANT_CANAIS-1;
        }
    }

    public void setCanal(int canal){
        if(isLigada()){
            for (int i = 0; i < canais.length; i++) {
                if (canal == canais[i]){
                    this.iCanalAtual = i;
                }
            }
        }
    }

    public void exibirTela(){
        if(isLigada()){
            System.err.println("Minha TV: "+modeloMarca);
            System.out.println("Ligada: "+ligada);
            System.out.println("Canal atual: "+canais[iCanalAtual]);
            System.out.println("Volume: "+volume);
        }
        else
        {
            System.out.println("Como assim exibir a tela com a tv desligada!?");
        }
    }
}