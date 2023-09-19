package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 10;

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanhoVetor - 1; i++) {
            for (int j = 0; j < tamanhoVetor - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nDigite o novo número a ser inserido: ");
        int novoNumero = scanner.nextInt();

        int posicaoInsercao = 0;
        while (posicaoInsercao < tamanhoVetor && novoNumero > vetor[posicaoInsercao]) {
            posicaoInsercao++;
        }

        for (int i = tamanhoVetor - 1; i > posicaoInsercao; i--) {
            vetor[i] = vetor[i - 1];
        }

        vetor[posicaoInsercao] = novoNumero;

        System.out.println("Vetor com o novo número inserido:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
