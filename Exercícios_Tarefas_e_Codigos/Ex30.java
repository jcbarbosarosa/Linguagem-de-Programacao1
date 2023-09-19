package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        scanner.close();

        if (valor1 <= valor2 && valor1 <= valor3) {
            System.out.print(valor1 + ", ");
            if (valor2 <= valor3) {
                System.out.print(valor2 + ", " + valor3);
            } else {
                System.out.print(valor3 + ", " + valor2);
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            System.out.print(valor2 + ", ");
            if (valor1 <= valor3) {
                System.out.print(valor1 + ", " + valor3);
            } else {
                System.out.print(valor3 + ", " + valor1);
            }
        } else {
            System.out.print(valor3 + ", ");
            if (valor1 <= valor2) {
                System.out.print(valor1 + ", " + valor2);
            } else {
                System.out.print(valor2 + ", " + valor1);
            }
        }
    }
}
