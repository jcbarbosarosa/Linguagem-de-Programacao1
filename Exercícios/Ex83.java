package Exercícios;
import java.util.Scanner;
public class Ex83 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números lidos na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
