package Exercicios_classe_e_objetos;

public class elipse extends figura {
    private double semieixoMaior;
    private double semieixoMenor;

    public elipse(String nome, String cor, double semieixoMaior, double semieixoMenor) {
        super(nome, cor, calcularArea(semieixoMaior, semieixoMenor), semieixoMenor);
        this.semieixoMaior = semieixoMaior;
        this.semieixoMenor = semieixoMenor;
    }

    @Override
    public double calcularPerimetro() {
        double a = semieixoMaior;
        double b = semieixoMenor;
        double h = Math.pow((a - b) / (a + b), 2);
        double perimeter = Math.PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
        return perimeter;
    }

    private static double calcularArea(double semieixoMaior, double semieixoMenor) {
        return Math.PI * semieixoMaior * semieixoMenor;
    }
}
