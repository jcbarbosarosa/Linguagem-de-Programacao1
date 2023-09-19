package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores (N): ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " de A: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " de B: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        System.out.println("Vetor Soma:");
        for (int i = 0; i < N; i++) {
            System.out.println(Soma[i]);
        }

        scanner.close();
    }
}
