package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex27 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = scanner.nextInt();

        scanner.close();

        if (valor > 0) {
            System.out.println("É POSITIVO!");
        } else if (valor < 0) {
            System.out.println("É NEGATIVO!");
        } else {
            System.out.println("É ZERO!");
        }
    }
}

