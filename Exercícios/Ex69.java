package Exercícios;
import java.util.Scanner;
public class Ex69 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaValores = 0;
        int numMercadorias = 0;

        char maisMercadorias = 'S';
        while (maisMercadorias == 'S' || maisMercadorias == 's') {
            System.out.print("Informe o valor da mercadoria: ");
            double valor = scanner.nextDouble();
            somaValores += valor;
            numMercadorias++;

            System.out.print("MAIS MERCADORIAS (S/N)? ");
            maisMercadorias = scanner.next().charAt(0);
        }

        if (numMercadorias > 0) {
            double mediaValores = somaValores / numMercadorias;
            System.out.println("Valor total em estoque: " + somaValores);
            System.out.println("Média de valor das mercadorias: " + mediaValores);
        } else {
            System.out.println("Nenhuma mercadoria foi informada.");
        }

        scanner.close();
    }
}
