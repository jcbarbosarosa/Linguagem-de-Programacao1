package Exercícios_Tarefas_e_Codigos;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Aluno APROVADO com média " + media);
        } else {
            System.out.println("Aluno REPROVADO com média " + media);
        }
    }
}
    
    
