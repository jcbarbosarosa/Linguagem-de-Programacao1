package Exercicios_classe_e_objetos;

public class hexagono extends figura {
    private double lado;

    public hexagono(String nome, String cor, double lado) {
        super(nome, cor, lado, lado);
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }
}
