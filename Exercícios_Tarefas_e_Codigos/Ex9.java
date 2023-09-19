package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salario mensal: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        scanner.close();

        double reajuste = salarioAtual * (percentualReajuste / 100);

        double novoSalario = salarioAtual + reajuste;

        System.out.println("O valor do reajuste é: " + reajuste);
        System.out.println("O novo salário é: " + novoSalario);
    }
}