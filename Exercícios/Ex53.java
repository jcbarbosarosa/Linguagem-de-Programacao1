package Exercícios;
import java.util.Scanner;
public class Ex53 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
