package Exercícios;
import java.util.Scanner;
public class Ex81 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetorQ = new double[20];
        double menor = Double.MAX_VALUE;
        int posicao = -1;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
            double numero = scanner.nextDouble();

            if (numero < menor) {
                menor = numero;
                posicao = i;
            }

            vetorQ[i] = numero;
        }

        System.out.println("Menor elemento: " + menor);
        System.out.println("Posição do menor elemento: " + posicao);
    }
}
