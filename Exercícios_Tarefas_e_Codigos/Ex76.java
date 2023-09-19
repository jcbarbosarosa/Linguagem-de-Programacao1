package Exercícios_Tarefas_e_Codigos;
public class Ex76 {
    public static void main(String[] args) {
        int largura = 60;
        int altura = 10;

        for (int y = 1; y <= altura; y++) {
            for (int x = 1; x <= largura; x++) {
                if (y == 1 || y == altura || x == 1 || x == largura) {
                    System.out.print('+');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
