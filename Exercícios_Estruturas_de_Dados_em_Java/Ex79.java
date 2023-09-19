package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex79 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoTurma = 20;

        double[] notas = new double[tamanhoTurma];

        double somaNotas = 0;
        for (int i = 0; i < tamanhoTurma; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        double mediaTurma = somaNotas / tamanhoTurma;

        int alunosAcimaDaMedia = 0;
        for (int i = 0; i < tamanhoTurma; i++) {
            if (notas[i] > mediaTurma) {
                alunosAcimaDaMedia++;
            }
        }

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Número de alunos com notas acima da média: " + alunosAcimaDaMedia);

        scanner.close();
    }
}
