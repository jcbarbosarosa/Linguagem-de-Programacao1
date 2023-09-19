package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de litros vendidos: ");
        double litros = scanner.nextDouble();
        
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = scanner.next().charAt(0);
        
        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        
        double desconto = 0;
        
        if (tipo == 'A') {
            if (litros <= 20) {
                desconto = litros * 0.03;
            } else {
                desconto = litros * 0.05;
            }
        } else if (tipo == 'G') {
            if (litros <= 20) {
                desconto = litros * 0.04;
            } else {
                desconto = litros * 0.06;
            }
        }
        
        double valorTotal = 0;
        
        if (tipo == 'A') {
            valorTotal = (precoAlcool * litros) - desconto;
        } else if (tipo == 'G') {
            valorTotal = (precoGasolina * litros) - desconto;
        }
        
        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);
        
        scanner.close();
    }
}
