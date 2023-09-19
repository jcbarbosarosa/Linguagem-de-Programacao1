package Exercícios_Tarefas_e_Codigos;
import java.util.Arrays;
import java.util.Scanner;
public class Ex86 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}
