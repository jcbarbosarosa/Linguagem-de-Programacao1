package Exercícios_Tarefas_e_Codigos;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double valor2 = scanner.nextDouble();
        
        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }
        
        scanner.close();
    }
}