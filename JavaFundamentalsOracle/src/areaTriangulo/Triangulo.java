package areaTriangulo;

public class Triangulo {

	private double area;
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}//constructor
	
	
	public double calcularTriangulo() {
		area = (base * altura) / 2;		
		return area;
	}//calcularTriangulo
		
	@Override
	public String toString() {
		return "Triangulo [area = " + area + ", base = " + base + ", altura = " + altura + "]";
	}//toString


	public double getArea() {
		return area;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}//getters e setters	
	
}//class
