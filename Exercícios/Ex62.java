package Exercícios;
import java.util.Scanner;
public class Ex62 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de alunos: ");
        int numAlunos = scanner.nextInt();
        double somaNotas = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Informe a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double mediaNotas = somaNotas / numAlunos;
        System.out.println("Média das notas dos alunos: " + mediaNotas);

        scanner.close();
    }
}
