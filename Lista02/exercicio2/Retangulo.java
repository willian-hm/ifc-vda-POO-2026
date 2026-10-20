public class Retangulo {
    private double largura;
    private double altura;

    // Construtor 1: sem parâmetros (cria retângulo 1x1)
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    // Construtor 2: um parâmetro lado (cria um quadrado)
    public Retangulo(double lado) {
        this.largura = lado;
        this.altura = lado;
    }

    // Construtor 3: dois parâmetros (largura e altura)
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public boolean ehQuadrado() {
        return this.largura == this.altura;
    }

    public String toString() {
        return "Retangulo [largura=" + this.largura + ", altura=" + this.altura + "]";
    }
}
