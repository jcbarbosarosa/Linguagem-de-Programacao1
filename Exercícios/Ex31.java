package Exercícios;
import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();
        
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Formam um triângulo.");
        } else {
            System.out.println("Não formam um triângulo.");
        }
        
        scanner.close();
    }
}

