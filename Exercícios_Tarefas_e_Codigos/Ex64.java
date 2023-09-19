package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex64 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número: ");
            int numero = scanner.nextInt();
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("Soma dos números menores que 40: " + soma);

        scanner.close();
    }
}
