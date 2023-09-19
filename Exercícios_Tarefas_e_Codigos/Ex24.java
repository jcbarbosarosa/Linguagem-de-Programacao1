package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe o valor das vendas efetuadas: ");
        double vendas = scanner.nextDouble();

        scanner.close();

        double comissao;
        
        if (vendas <= 1500) {
            comissao = vendas * 0.03; 
        } else {
            comissao = 1500 * 0.03 + (vendas - 1500) * 0.05;
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
    }
}
