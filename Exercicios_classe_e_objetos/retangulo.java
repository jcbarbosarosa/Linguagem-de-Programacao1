package Exercicios_classe_e_objetos;

    public class retangulo extends figura {
        private double comprimento;
        private double largura;
    
        public retangulo(String nome, String cor, double comprimento, double largura) {
            super(nome, cor, comprimento * largura, largura);
            this.comprimento = comprimento;
            this.largura = largura;
        }
    
        @Override
        public double calcularPerimetro() {
            return 2 * (comprimento + largura);
        }
}

