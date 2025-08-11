package concursos.java;

public class Enigma1 {
    public static void main(String[] args) {
        int num = 20, conta;
        for (int i = 2; i <= num; i++) {
            conta = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    conta++;
                    break;
                }
            }
            if (conta == 0) {
                System.out.println(i);
            }
        }
    }
}
// Devo fazer esse código na mão e ficar rápido em resolver essas questões