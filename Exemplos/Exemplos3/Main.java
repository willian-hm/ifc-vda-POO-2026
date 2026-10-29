public class Main {
    public static void main(String[] args) {
        Cabeleleila salao = new Cabeleleila("Videira Centro");

        salao.cadastrarCliente("Calebe", 'M');
        salao.cadastrarCliente("Igor", 'M');
        salao.cadastrarCliente("Karyne", 'F');
        salao.cadastrarCliente("Calebe", 'M');

        salao.chamarProximo();
        salao.chamarProximo();
        salao.chamarProximo();
        salao.chamarProximo();
    }
}
