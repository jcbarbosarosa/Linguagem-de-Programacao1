package Exercicio_tratamento_de_excecao;

public class excecao {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            int valor = numeros[3];
            System.out.println("O valor é: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}