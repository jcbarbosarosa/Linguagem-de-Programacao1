package Exercícios_Tarefas_e_Codigos;

import java.util.Scanner;

public class Ex25 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta do cliente: ");
        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Informe o débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Informe o crédito: ");
        double credito = scanner.nextDouble();

        scanner.close();

        double saldoAtual = saldo - debito + credito;

        System.out.println("O saldo atual é: R$ " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}
