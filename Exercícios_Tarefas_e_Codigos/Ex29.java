package Exercícios_Tarefas_e_Codigos;

import java.util.Scanner;

public class Ex29 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        scanner.close();

        double somaDosMaiores;

        if (valor1 > valor2 && valor1 > valor3) {
            somaDosMaiores = valor1 + Math.max(valor2, valor3);
        } else if (valor2 > valor1 && valor2 > valor3) {
            somaDosMaiores = valor2 + Math.max(valor1, valor3);
        } else {
            somaDosMaiores = valor3 + Math.max(valor1, valor2);
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
    }
}
