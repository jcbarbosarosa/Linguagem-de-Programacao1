package Exercícios;
public class Ex2C {
    public static void main(String[] args) {
       int A = 10;
        int B = 20;
        int C = A;
        
        A = B;
        B = C; 
        
        A = B;
        B = C; 
        
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}
