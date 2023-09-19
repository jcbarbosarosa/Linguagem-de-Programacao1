package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        scanner.close();

        double maior = Math.max(valor1, valor2);

        System.out.println("O maior valor é: " + maior);
    }
}

