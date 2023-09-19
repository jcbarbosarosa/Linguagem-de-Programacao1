package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex48 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        char novoCalculo;

        do {
            System.out.print("Informe a primeira nota (0 a 10): ");
            nota1 = scanner.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("VALOR INVÁLIDO. A nota deve estar entre 0 e 10.");
                System.out.print("Informe a primeira nota novamente: ");
                nota1 = scanner.nextDouble();
            }

            System.out.print("Informe a segunda nota (0 a 10): ");
            nota2 = scanner.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.println("VALOR INVÁLIDO. A nota deve estar entre 0 e 10.");
                System.out.print("Informe a segunda nota novamente: ");
                nota2 = scanner.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno: " + media);

            System.out.print("NOVO CÁLCULO (S/N)? ");
            novoCalculo = scanner.next().charAt(0);
        } while (novoCalculo == 'S' || novoCalculo == 's');

        scanner.close();
    }
}
