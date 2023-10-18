package Exercicios_classe_e_objetos;

public class quadrado {
    public class Quadrado extends figura {
        private double lado;
    
        public Quadrado(String nome, String cor, double lado) {
            super(nome, cor, lado * lado, lado);
            this.lado = lado;
        }
    
        @Override
        public double calcularPerimetro() {
            return 4 * lado;
        }
    }
}
