package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valor = scanner.nextInt();

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("Maior valor lido: " + maior);
        System.out.println("Menor valor lido: " + menor);

        scanner.close();
    }
}
