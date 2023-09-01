package Exercícios;
import	java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite o nome do Time 1: ");
            String nomeTime1 = scanner.nextLine();
            
            System.out.print("Digite o número de gols do Time 1: ");
            int golsTime1 = scanner.nextInt();
            
            System.out.print("Digite o nome do Time 2: ");
            scanner.nextLine(); 
            String nomeTime2 = scanner.nextLine();
            
            System.out.print("Digite o número de gols do Time 2: ");
            int golsTime2 = scanner.nextInt();
            
            if (golsTime1 > golsTime2) {
                System.out.println("Vencedor: " + nomeTime1);
            } else if (golsTime2 > golsTime1) {
                System.out.println("Vencedor: " + nomeTime2);
            } else {
                System.out.println("EMPATE");
            }
            
            scanner.close();
        }
}