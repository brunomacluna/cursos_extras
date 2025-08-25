package classeObjetosMetodos;

public class Shape {

	private int numSides;
	private boolean regular;
	
	public Shape() {
		
	}//constructor

	public Shape(int numSides, boolean regular) {
		super();
		this.numSides = numSides;
		this.regular = regular;
	}//constructor

	public int getNumSides() {
		return numSides;
	}//method

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}//method

	public boolean isRegular() {
		return regular;
	}//method

	public void setRegular(boolean regular) {
		this.regular = regular;
	}//method	
	
}//class
