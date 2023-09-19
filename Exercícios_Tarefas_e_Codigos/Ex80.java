package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex80 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetorQ = new double[20];
        double maior = Double.MIN_VALUE;
        int posicao = -1;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
            double numero = scanner.nextDouble();

            if (numero > maior) {
                maior = numero;
                posicao = i;
            }

            vetorQ[i] = numero;
        }

        System.out.println("Maior elemento: " + maior);
        System.out.println("Posição do maior elemento: " + posicao);
    }
}
