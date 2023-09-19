package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex88 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 20;

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para verificar se existe no vetor: ");
        int numeroVerificar = scanner.nextInt();

        boolean numeroExiste = false;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetor[i] == numeroVerificar) {
                numeroExiste = true;
                break;
            }
        }

        if (numeroExiste) {
            int[] novoVetor = new int[tamanhoVetor - 1];
            int novoIndice = 0;
            for (int i = 0; i < tamanhoVetor; i++) {
                if (vetor[i] != numeroVerificar) {
                    novoVetor[novoIndice] = vetor[i];
                    novoIndice++;
                }
            }

            System.out.println("O número " + numeroVerificar + " existe no vetor.");
            System.out.println("Novo vetor sem o número:");
            for (int i = 0; i < tamanhoVetor - 1; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número " + numeroVerificar + " não existe no vetor.");
        }

        scanner.close();
    }
}
