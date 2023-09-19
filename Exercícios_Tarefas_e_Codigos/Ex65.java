package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();

        int soma = 0;
        for (int i = valor1; i <= valor2; i++) {
            soma += i;
        }

        System.out.println("Soma dos inteiros entre os valores: " + soma);

        scanner.close();
    }
}
