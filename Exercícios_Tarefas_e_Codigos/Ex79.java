package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex79 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];
        double soma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 20;
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                contador++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Número de alunos com nota acima da média: " + contador);
    }
}
