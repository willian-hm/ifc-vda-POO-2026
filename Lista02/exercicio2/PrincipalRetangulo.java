public class PrincipalRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(5.0);
        Retangulo r3 = new Retangulo(4.0, 6.0);

        System.out.println("--- Objeto 1 ---");
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
        System.out.println("Eh quadrado? " + r1.ehQuadrado());

        System.out.println("\n--- Objeto 2 ---");
        System.out.println(r2.toString());
        System.out.println("Area: " + r2.calcularArea());
        System.out.println("Perimetro: " + r2.calcularPerimetro());
        System.out.println("Eh quadrado? " + r2.ehQuadrado());

        System.out.println("\n--- Objeto 3 ---");
        System.out.println(r3.toString());
        System.out.println("Area: " + r3.calcularArea());
        System.out.println("Perimetro: " + r3.calcularPerimetro());
        System.out.println("Eh quadrado? " + r3.ehQuadrado());
    }
}
