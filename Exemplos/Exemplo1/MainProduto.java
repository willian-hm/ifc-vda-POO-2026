public class MainProduto {
    
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.definirNome("Controle de datashow");
        p1.definirQuantidade(20);
        p1.definirValor(30);

        System.out.println(p1);

        p1.alterarEstoque(25);
        System.out.println("Nova quantidade: "+p1.pegarQuantidade());

        p1.alterarEstoque(-35);
        System.out.println("Nova quantidade: "+p1.pegarQuantidade());

        p1.alterarEstoque(-25);
        System.out.println("Nova quantidade: "+p1.pegarQuantidade());
    }
}
