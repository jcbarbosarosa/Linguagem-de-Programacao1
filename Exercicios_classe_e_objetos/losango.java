package Exercicios_classe_e_objetos;

public class losango extends figura {
    private double diagonalMaior;
    private double diagonalMenor;

    public losango(String nome, String cor, double diagonalMaior, double diagonalMenor) {
        super(nome, cor, (diagonalMaior * diagonalMenor) / 2, diagonalMenor);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (diagonalMaior + diagonalMenor);
    }
}