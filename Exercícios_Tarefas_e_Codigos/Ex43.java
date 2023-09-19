package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex43 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        String mensagem;

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                mensagem = "Triângulo Equilátero";
            } else if (a == b || b == c || a == c) {
                mensagem = "Triângulo Isósceles";
            } else {
                mensagem = "Triângulo Escaleno";
            }
        } else {
            mensagem = "Não é possível formar um triângulo";
        }

        System.out.println(mensagem);

        scanner.close();
    }
}
