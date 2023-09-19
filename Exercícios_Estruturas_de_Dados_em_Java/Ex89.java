package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex89 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 15;

        int[] V1 = new int[tamanhoVetor];
        int[] V2 = new int[tamanhoVetor];

        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " de V1: ");
            V1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " de V2: ");
            V2[i] = scanner.nextInt();
        }

        int quantidadeIguais = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (V1[i] == V2[i]) {
                quantidadeIguais++;
            }
        }

        System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: " + quantidadeIguais);

        scanner.close();
    }
}
