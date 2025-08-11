package concursos.java;

public class CespeSeplag24 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                soma += j * i;
                System.out.print(soma + " ");
            }
        }
        
    }
}
