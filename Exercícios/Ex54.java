package Exercícios;
import java.util.Scanner;
public class Ex54 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Informe um valor N (maior que 0): ");
            N = scanner.nextInt();
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
