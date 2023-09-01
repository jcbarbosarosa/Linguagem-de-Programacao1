package Exercícios;
import java.util.Scanner;
public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        System.out.println("Total: " + total);
        System.out.println("Desconto: " + desconto);
        System.out.println("Total a Pagar: " + totalAPagar);

        scanner.close();
    }
}
