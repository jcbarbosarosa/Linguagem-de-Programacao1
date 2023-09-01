package Exercícios;
import java.util.Scanner;
public class Ex78 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Informe um nome para busca: ");
        String nomeBusca = scanner.nextLine();

        boolean achou = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equals(nomeBusca)) {
                achou = true;
                break;
            }
        }

        if (achou) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
