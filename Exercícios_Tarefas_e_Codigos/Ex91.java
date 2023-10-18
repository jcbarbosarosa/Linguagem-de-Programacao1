package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex91 {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vetor = new int[50];

            for (int i = 0; i < 50; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            boolean[] repetidos = new boolean[50];
            boolean temRepetido = false;

            for (int i = 0; i < 50; i++) {
                if (!repetidos[i]) {
                    for (int j = i + 1; j < 50; j++) {
                        if (vetor[i] == vetor[j]) {
                            repetidos[i] = true;
                            repetidos[j] = true;
                            temRepetido = true;
                            break;
                        }
                    }
                }
            }

            if (temRepetido) {
                System.out.println("Números repetidos e suas posições:");

                for (int i = 0; i < 50; i++) {
                    if (repetidos[i]) {
                        System.out.println("Número " + vetor[i] + " na posição " + i);
                    }
                }
            } else {
                System.out.println("Não há números repetidos no vetor.");
            }
        }
    }
}
