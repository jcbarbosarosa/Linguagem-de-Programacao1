package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex82 {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] vetorA = new double[10];
            double[] vetorM = new double[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
                vetorA[i] = scanner.nextDouble();
            }

            System.out.print("Digite o valor de X: ");
            double x = scanner.nextDouble();

            for (int i = 0; i < 10; i++) {
                vetorM[i] = vetorA[i] * x;
            }

            System.out.println("Vetor M (elementos de A multiplicados por " + x + "):");
            for (int i = 0; i < 10; i++) {
                System.out.println(vetorM[i]);
            }
        }
    }
}
