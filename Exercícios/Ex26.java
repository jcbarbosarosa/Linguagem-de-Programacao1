package Exercícios;
import java.util.Scanner;
public class Ex26 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Informe a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Informe a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();

        scanner.close();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
