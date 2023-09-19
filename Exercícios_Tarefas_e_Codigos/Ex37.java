package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidadeMorangos = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double quantidadeMacas = scanner.nextDouble();
        
        double precoMorango = quantidadeMorangos <= 5 ? 2.50 : 2.20;
        double precoMaca = quantidadeMacas <= 5 ? 1.80 : 1.50;
        
        double valorTotal = (precoMorango * quantidadeMorangos) + (precoMaca * quantidadeMacas);
        
        if (quantidadeMorangos + quantidadeMacas > 8 || valorTotal > 25) {
            valorTotal *= 0.9;
        }
        
        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);
        
        scanner.close();
    }
}
