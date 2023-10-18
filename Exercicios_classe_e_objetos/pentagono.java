package Exercicios_classe_e_objetos;

public class pentagono extends figura {
    private double lado;

    public pentagono(String nome, String cor, double lado) {
        super(nome, cor, calcularArea(lado), lado);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }

    private static double calcularArea(double lado) {
        double numerador = 5 * Math.pow(lado, 2);
        double denominador = 4 * Math.tan(Math.PI / 5);
        double area = numerador / denominador;
        return area;
    }
}
