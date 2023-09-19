package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 30;

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para contar no vetor: ");
        int numeroContar = scanner.nextInt();

        int contagem = 0;

        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] == numeroContar) {
                contagem++;
            }
        }

        System.out.println("O número " + numeroContar + " aparece " + contagem + " vezes no vetor.");

        scanner.close();
    }
}
