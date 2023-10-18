package Exercicios_classe_e_objetos;

public class trapezio extends figura {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public trapezio(String nome, String cor, double baseMaior, double baseMenor, double altura) {
        super(nome, cor, altura, altura);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        double ladoNaoParalelo = Math.sqrt(Math.pow((baseMaior - baseMenor) / 2, 2) + Math.pow(altura, 2));
        double perimetro = baseMaior + baseMenor + 2 * ladoNaoParalelo;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = (baseMaior + baseMenor) * altura / 2;
        return area;
    }
}
