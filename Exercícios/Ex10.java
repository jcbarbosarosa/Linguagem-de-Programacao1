package Exercícios;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        scanner.close();

        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println("O custo final do carro ao consumidor é: " + custoFinal);
    }
}