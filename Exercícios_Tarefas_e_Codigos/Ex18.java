package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.close();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você PODE votar este ano!");
        } else {
            System.out.println("Você NÃO PODE votar este ano!");
        }
    }
}

