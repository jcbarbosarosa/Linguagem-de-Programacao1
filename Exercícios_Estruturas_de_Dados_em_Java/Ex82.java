package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;

        double[] A = new double[tamanhoVetor];
        double[] M = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            A[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        for (int i = 0; i < tamanhoVetor; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Vetor M (A multiplicado por X):");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(M[i]);
        }

        scanner.close();
    }

}
