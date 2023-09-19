package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double n3 = scanner.nextDouble();
    
        scanner.close();
    
        double valorn1 = 2;
        double valorn2 = 3;
        double valorn3 = 5;
        
        double mediaFinal = (n1 * valorn1 + n2 * valorn2 + n3 * valorn3) / (valorn1 + valorn2 + valorn3);

        System.out.println("A média final do aluno é: " + mediaFinal);
        
    }
}
