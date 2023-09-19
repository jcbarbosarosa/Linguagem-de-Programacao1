package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex90 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[30];

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número para contar as ocorrências: ");
        int numeroContar = scanner.nextInt();
        int cont = 0;

        for (int i = 0; i < 30; i++) {
            if (vetor[i] == numeroContar) {
                cont++;
            }
        }

        System.out.println("Número de ocorrências de " + numeroContar + " no vetor: " + cont);
    }
}
