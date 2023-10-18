package Exercicios_classe_e_objetos;

    public class circulo extends figura {
        private double raio;
    
        public circulo(String nome, String cor, double raio) {
            super(nome, cor, Math.PI * raio * raio, raio);
            this.raio = raio;
        }
    
        @Override
        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }
}
