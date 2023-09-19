package Exercícios_Estruturas_de_Dados_em_Java;

import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diasNoAno = 365;

        double[] temperaturas = new double[diasNoAno];

        for (int dia = 0; dia < diasNoAno; dia++) {
            System.out.print("Digite a temperatura média para o dia " + (dia + 1) + ": ");
            temperaturas[dia] = scanner.nextDouble();
        }

        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];

        double somaTemperaturas = 0;

        int diasInferioresMedia = 0;

        for (int dia = 0; dia < diasNoAno; dia++) {
            double temperaturaAtual = temperaturas[dia];
            somaTemperaturas += temperaturaAtual;

            if (temperaturaAtual < menorTemperatura) {
                menorTemperatura = temperaturaAtual;
            }

            if (temperaturaAtual > maiorTemperatura) {
                maiorTemperatura = temperaturaAtual;
            }
        }

        double temperaturaMediaAnual = somaTemperaturas / diasNoAno;

        for (int dia = 0; dia < diasNoAno; dia++) {
            if (temperaturas[dia] < temperaturaMediaAnual) {
                diasInferioresMedia++;
            }
        }

        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias no ano com temperatura inferior à média anual: " + diasInferioresMedia);

        scanner.close();
    }
}
