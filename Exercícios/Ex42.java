package Exercícios;
import java.util.Scanner;
public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int idade = java.time.Year.now().getValue() - anoNascimento;
        int tempoTrabalho = java.time.Year.now().getValue() - anoIngresso;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Idade: " + idade);
            System.out.println("Tempo de Trabalho: " + tempoTrabalho);
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Idade: " + idade);
            System.out.println("Tempo de Trabalho: " + tempoTrabalho);
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}
