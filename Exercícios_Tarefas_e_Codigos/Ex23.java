package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex23 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a altura da pessoa: ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o sexo da pessoa (M ou F): ");
        char sexo = scanner.next().charAt(0);

        scanner.close();

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
            return;
        }

        System.out.println("O peso ideal para " + nome + " é: " + pesoIdeal + " kg.");
    }
}
