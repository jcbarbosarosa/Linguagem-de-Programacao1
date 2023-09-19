package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex81 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 20;

        double[] Q = new double[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            do {
                System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                Q[i] = scanner.nextDouble();
            } while (Q[i] < 0);
        }

        double maiorElemento = Q[0];
        int posicaoMaior = 0;
        for (int i = 1; i < tamanhoVetor; i++) {
            if (Q[i] > maiorElemento) {
                maiorElemento = Q[i];
                posicaoMaior = i;
            }
        }

        double menorElemento = Q[0];
        int posicaoMenor = 0;
        for (int i = 1; i < tamanhoVetor; i++) {
            if (Q[i] < menorElemento) {
                menorElemento = Q[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O maior elemento de Q é " + maiorElemento);
        System.out.println("Ele ocupa a posição " + (posicaoMaior + 1) + " no vetor.");
        System.out.println("O menor elemento de Q é " + menorElemento);
        System.out.println("Ele ocupa a posição " + (posicaoMenor + 1) + " no vetor.");

        scanner.close();
    }
}
