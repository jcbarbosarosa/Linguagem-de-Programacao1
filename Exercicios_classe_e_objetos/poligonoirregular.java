package Exercicios_classe_e_objetos;

public class poligonoirregular extends figura {
    private double[] lados;

    public poligonoirregular(String nome, String cor, int numeroLados, double[] lados) {
        super(nome, cor, calcularArea(numeroLados, lados), area);
        this.lados = lados;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0.0;
        for (double lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }

    private static double calcularArea(int numeroLados, double[] lados) {
        if (numeroLados < 3) {
            return 0.0; 
        }
    
        double area = 0.0;
    
        for (int i = 0; i < numeroLados; i++) {
            int j = (i + 1) % numeroLados; 
            area += (lados[i] * lados[j]) / 2.0; 
        }
    
        return Math.abs(area); 
    }
}
