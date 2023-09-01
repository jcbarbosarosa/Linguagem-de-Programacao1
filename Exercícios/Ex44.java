package Exercícios;
import java.util.Scanner;
public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, resultado;

        do {
            System.out.print("Informe o primeiro valor: ");
            valor1 = scanner.nextDouble();

            System.out.print("Informe o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();

            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO. O segundo valor não pode ser zero.");
            }
        } while (valor2 == 0);

        resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}
