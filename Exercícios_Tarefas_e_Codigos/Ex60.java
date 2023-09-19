package Exercícios_Tarefas_e_Codigos;
import java.util.Scanner;
public class Ex60 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            int valor = scanner.nextInt();
            if (valor >= 10 && valor <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Valores dentro do intervalo [10, 20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo [10, 20]: " + foraIntervalo);

        scanner.close();
    }
}
