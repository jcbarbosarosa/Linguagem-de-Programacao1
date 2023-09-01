package Exercícios;
import java.util.Scanner;
public class Ex71 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de números: ");
        int quantidade = scanner.nextInt();

        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
        }

        double media = (double) soma / quantidade;

        System.out.println("Maior número lido: " + maior);
        System.out.println("Média dos números lidos: " + media);

        scanner.close();
    }
}
