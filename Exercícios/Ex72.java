package Exercícios;
import java.util.Scanner;
public class Ex72 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maiorPreco = Double.MIN_VALUE;
        double somaPrecos = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe o código do produto " + i + ": ");
            int codigo = scanner.nextInt();
            System.out.print("Informe o preço do produto " + i + ": ");
            double preco = scanner.nextDouble();

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
            somaPrecos += preco;
        }

        double mediaPrecos = somaPrecos / 15;

        System.out.println("Maior preço lido: " + maiorPreco);
        System.out.println("Média dos preços dos produtos: " + mediaPrecos);

        scanner.close();
    }
}
