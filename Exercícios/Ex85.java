package Exercícios;
import java.util.Scanner;
public class Ex85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[365];
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 365; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        double mediaAnual = soma / 365;
        int abaixoMedia = 0;

        for (int i = 0; i < 365; i++) {
            if (temperaturas[i] < mediaAnual) {
                abaixoMedia++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menor);
        System.out.println("Maior temperatura do ano: " + maior);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura abaixo da média anual: " + abaixoMedia);
    }
}
