package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex89 {
       public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetorV1 = new int[15];
            int[] vetorV2 = new int[15];
            int cont = 0;

            for (int i = 0; i < 15; i++) {
                System.out.print("Digite o número " + (i + 1) + " para o vetor V1: ");
                vetorV1[i] = scanner.nextInt();
            }

            for (int i = 0; i < 15; i++) {
                System.out.print("Digite o número " + (i + 1) + " para o vetor V2: ");
                vetorV2[i] = scanner.nextInt();
            }

            for (int i = 0; i < 15; i++) {
                if (vetorV1[i] == vetorV2[i]) {
                    cont++;
                }
            }

            System.out.println("Quantidade de números iguais nas mesmas posições nos vetores V1 e V2: " + cont);
        }
    }
}
