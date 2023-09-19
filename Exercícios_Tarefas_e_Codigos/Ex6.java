package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
    }
}