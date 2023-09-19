package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex68 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número total de mercadorias no estoque: ");
        int numMercadorias = scanner.nextInt();

        double somaValores = 0;

        for (int i = 1; i <= numMercadorias; i++) {
            System.out.print("Informe o valor da mercadoria " + i + ": ");
            double valor = scanner.nextDouble();
            somaValores += valor;
        }

        double mediaValores = somaValores / numMercadorias;
        System.out.println("Valor total em estoque: " + somaValores);
        System.out.println("Média de valor das mercadorias: " + mediaValores);

        scanner.close();
    }
}
