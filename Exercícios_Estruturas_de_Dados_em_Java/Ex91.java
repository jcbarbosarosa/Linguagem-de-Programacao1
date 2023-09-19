package Exercícios_Estruturas_de_Dados_em_Java;
import java.util.Scanner;
public class Ex91 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor = 50;

        int[] VET = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            VET[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanhoVetor - 1; i++) {
            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (VET[i] == VET[j]) {
                    System.out.println("Número repetido: " + VET[i]);
                    System.out.println("Posições: " + i + " e " + j);
                }
            }
        }

        scanner.close();
    }
}
