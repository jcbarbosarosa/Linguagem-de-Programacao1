package Exercícios;
import java.util.Scanner;
public class Ex59 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valor = scanner.nextInt();
            if (valor < 0) {
                negativos++;
            }
        }

        System.out.println("Quantidade de valores negativos: " + negativos);

        scanner.close();
    }
}
