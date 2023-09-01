package Exercícios;

import java.util.Scanner;

public class Ex84 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite o tamanho dos vetores A e B: ");
        n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorSoma = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor Soma:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorSoma[i]);
        }
    }
}
