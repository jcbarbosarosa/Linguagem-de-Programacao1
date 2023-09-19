package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex73 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHabitantes = 0;
        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;
        int salarioMenor150 = 0;

        System.out.print("Informe o salário do habitante (negativo para encerrar): ");
        double salario = scanner.nextDouble();

        while (salario >= 0) {
            totalHabitantes++;
            somaSalarios += salario;

            System.out.print("Informe o número de filhos do habitante: ");
            int filhos = scanner.nextInt();
            somaFilhos += filhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 150) {
                salarioMenor150++;
            }

            System.out.print("Informe o salário do próximo habitante (negativo para encerrar): ");
            salario = scanner.nextDouble();
        }

        double mediaSalarios = somaSalarios / totalHabitantes;
        double mediaFilhos = (double) somaFilhos / totalHabitantes;
        double percentualMenor150 = (double) salarioMenor150 / totalHabitantes * 100;

        System.out.println("Média de salário da população: " + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: " + maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentualMenor150 + "%");

        scanner.close();
    }
}
