package concursos.java;

public class SomaMisteriosa {

    private static void somaTres(int x[]) {
        x[0] += 3;
    }

    private static void somaDois(int x) {
        x += 2;
    }

    public static void main(String args[]) {
        int x = 0;
        int y[] = { 0 };
        somaDois(x);
        somaTres(y);
        somaDois(y[0]);
        System.out.print(x + " * " + y[0]);
    }
}
