package matematica;

public class Formulas {

	double a, b, c, d, e, f;
	
	public double a (double x) {
		return a = Math.sqrt(Math.pow(x, 2.0) - 6.0) / 4.0;
	}//a
		
	public double b (double x, double y) {
		return b = Math.pow(x, y) - Math.pow(6.0, x);
	}//b
	
	public double c (double x) {
		return c = 4.0 * Math.cos(2.0/5.0) - Math.sin(Math.pow(x, 2.0)); //desconsiderei a situação do angulo radiando. (PS: meu foco agora é Java)
	}//c
	
	public double d (double x, double y) {
		return d = (Math.pow(x, 4.0)) - Math.sqrt((6.0 * x) - Math.pow(y, 3.0));
	}//d
	
	public double e (double x, double y) {
		return e = 1.0 / (y * (1.0 / (x - Math.pow(2.0, y))));
	}//e
	
	public double f (double x) {
		return f = 7.0 * (Math.cos(Math.sqrt(5.0 - Math.sin(Math.sqrt(Math.pow(3.0, x) - 4.0)))));
	}//f

	@Override
	public String toString() {
		return "Formulas [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}
	
	
}//class

