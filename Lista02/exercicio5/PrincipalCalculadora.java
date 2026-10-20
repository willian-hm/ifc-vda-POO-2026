public class PrincipalCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int[] numeros = {10, 20, 30, 40};

        System.out.println("Soma de 2 inteiros (5 + 3): " + calc.somar(5, 3));
        System.out.println("Soma de 2 reais (2.5 + 4.3): " + calc.somar(2.5, 4.3));
        System.out.println("Soma de 3 inteiros (1 + 2 + 3): " + calc.somar(1, 2, 3));
        System.out.println("Soma do vetor {10, 20, 30, 40}: " + calc.somar(numeros));
        System.out.println("Media de 2 reais (7.0 e 8.0): " + calc.media(7.0, 8.0));
        System.out.println("Media do vetor {10, 20, 30, 40}: " + calc.media(numeros));
    }
}
