package Exercícios;
import java.util.Scanner;
public class Ex56 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Informe um valor inteiro entre 1 e 10: ");
            valor = scanner.nextInt();
        } while (valor < 1 || valor > 10);

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
