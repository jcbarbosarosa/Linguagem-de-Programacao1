package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex88 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = new int[20];

            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            System.out.print("Digite o número a ser removido: ");
            int numeroRemover = scanner.nextInt();

            int posicaoRemocao = -1;

            for (int i = 0; i < 20; i++) {
                if (vetor[i] == numeroRemover) {
                    posicaoRemocao = i;
                    break;
                }
            }

            if (posicaoRemocao >= 0) {
                int[] novoVetor = new int[19];
                int novoIndice = 0;

                for (int i = 0; i < 20; i++) {
                    if (i != posicaoRemocao) {
                        novoVetor[novoIndice] = vetor[i];
                        novoIndice++;
                    }
                }

                System.out.println("Vetor com o número removido:");
                for (int i = 0; i < 19; i++) {
                    System.out.println(novoVetor[i]);
                }
            } else {
                System.out.println("Número não encontrado no vetor.");
            }
        }
    }
}
