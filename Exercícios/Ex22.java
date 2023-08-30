package Exercícios;
import java.util.Scanner;
public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int horasSemanais = 40;
        final int semanasPorMes = 4;

        System.out.print("Informe o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Informe o salário por hora: ");
        double salarioHora = scanner.nextDouble();

        scanner.close();

        double salarioTotal;
        
        if (horasTrabalhadas > horasSemanais * semanasPorMes) {
            int horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
            double valorHoraExtra = salarioHora * 1.5; // 50% de acréscimo
            
            salarioTotal = (horasSemanais * semanasPorMes * salarioHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }
}
