package Exercícios_Estruturas_de_Dados_em_Java;
public class Ex77 {
public Ex77() {
}
    public static void main(String[] args) {
    int[] V = {5, 1, 4, 2, 7, 8, 3, 6};
    
    for (int i = 8; i >= 5; i--) {
        int aux = V[i];
        V[i] = V[8 - i + 1];
        V[8 - i + 1] = aux;
    }
    
    V[3] = V[1];
    V[V[3]] = V[V[2]];
    
    for (int num : V) {
        System.out.print(num + " ");
    }
}
}