package Exercícios;
public class Ex67 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidade = 0;

        for (int i = 15; i <= 100; i++) {
            soma += i;
            quantidade++;
        }

        double media = (double) soma / quantidade;
        System.out.println("Média aritmética dos números entre 15 e 100: " + media);
    }
}
