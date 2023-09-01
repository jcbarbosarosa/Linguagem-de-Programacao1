package Exercícios;
import java.util.Scanner;
public class Ex61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / 10;
        System.out.println("Média aritmética dos valores: " + media);

        scanner.close();
    }
}
