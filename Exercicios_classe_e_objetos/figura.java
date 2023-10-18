package Exercicios_classe_e_objetos;

public abstract class figura {
    private String nome;
    private String cor;
    protected static double area;

    public figura(String nome, String cor, double area, double d) {
        this.nome = nome;
        this.cor = cor;
        figura.area = area;
    }

    public abstract double calcularPerimetro();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + area);
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public double getArea() {
        return area;
    }
}