package Exercicios_classe_e_objetos;
public class triangulo extends figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public triangulo(String nome, String cor, double lado1, double lado2, double lado3) {
        super(nome, cor, calcularArea(lado1, lado2, lado3), lado3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    private static double calcularArea(double lado1, double lado2, double lado3) {
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }
}