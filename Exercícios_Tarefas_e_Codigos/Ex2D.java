package Exercícios_Tarefas_e_Codigos;
public class Ex2D {
    public static void main(String[] args) {   
        int A = 10;
        int B = A + 1;
        A = B + 1;
        B = A + 1;
        
        System.out.println("A: " + A);
        A = B + 1;
        System.out.println("A: " + A);
        System.out.println("B: " + B + 1);
        System.out.println("A: " + A + ", B: " + B);
    }
}