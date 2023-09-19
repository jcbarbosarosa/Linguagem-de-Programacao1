package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = scanner.nextInt();
            somaTotal += numero;
        }

        System.out.println("Soma total dos números: " + somaTotal);

        scanner.close();
    }
}
