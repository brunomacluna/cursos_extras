package polimorfismo;

public class Fatorial {

	private static int num;
		

	public int getFatorial() {
		int fatorial = 1;
			for(int i = num; i > 0; i--) {
				fatorial *= i;					
			}//for
		return fatorial;
	}//getFatorial()


	@Override
	public String toString() {
		String impressao = "";
		for (int i = 1; i <= num; i++) {			
			impressao += (i == num) ? i : i + " * ";			
		}//for
		return "Fatorial: "+ num +"! = " + impressao + " = "+ getFatorial();						
	}//toString


	public static int getNum() {
		return num;
	}


	public static void setNum(int num) {
		Fatorial.num = num;
	}
	
	
	
	
}//class
