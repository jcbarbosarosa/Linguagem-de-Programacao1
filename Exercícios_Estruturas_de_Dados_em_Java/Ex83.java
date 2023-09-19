package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 20;

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");
        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
