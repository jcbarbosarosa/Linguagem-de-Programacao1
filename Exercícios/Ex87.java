package Exercícios;
import java.util.Arrays;
import java.util.Scanner;
public class Ex87 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[11];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.print("Digite um número a ser inserido: ");
        double novoNumero = scanner.nextDouble();

        int posicaoInsercao = Arrays.binarySearch(vetor, novoNumero);

        if (posicaoInsercao < 0) {
            posicaoInsercao = -posicaoInsercao - 1;
        }

        for (int i = 10; i > posicaoInsercao; i--) {
            vetor[i] = vetor[i - 1];
        }

        vetor[posicaoInsercao] = novoNumero;

        System.out.println("Vetor com novo número inserido:");
        for (int i = 0; i < 11; i++) {
            System.out.println(vetor[i]);
        }
    }
}
