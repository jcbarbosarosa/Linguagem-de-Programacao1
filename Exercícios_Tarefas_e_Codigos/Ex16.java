package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de maçãs compradas: ");
        int quantidadeMacas = scanner.nextInt();

        scanner.close();

        double custoPorMaca;
        
        if (quantidadeMacas < 12) {
            custoPorMaca = 1.30;
        } else {
            custoPorMaca = 1.00;
        }

        double custoTotal = quantidadeMacas * custoPorMaca;

        System.out.println("O custo total da compra é: R$ " + custoTotal);
    }
}
