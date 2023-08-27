package Exercícios;
public class Ex1 {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        
        A = A + B;
        B = A - B;
        A = A - B;
        
        System.out.println("Valor em A: " + A);
        System.out.println("Valor em B: " + B);
    }
}