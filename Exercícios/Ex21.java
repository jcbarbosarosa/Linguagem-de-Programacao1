package Exercícios;
import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Informe a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        scanner.close();

        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
}

