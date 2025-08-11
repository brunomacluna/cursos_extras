package concursos.java;

public class Euclides {
    public static void main(String[] args) {
        int a = 78, b = 117, r = 1;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r > 0);
        System.out.println("Valor = " + a);
    }
}
