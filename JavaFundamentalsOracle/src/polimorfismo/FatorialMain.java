package polimorfismo;

import java.util.Scanner;

public class FatorialMain {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numMain;
		
		Fatorial f = new Fatorial();
		
		System.out.print("Qual número você deseja fatorar? ");
		numMain = scanner.nextInt();
		scanner.nextLine();
		 
		f.setNum(numMain);		
				
		System.out.println(f.toString());		
		
	}//main
			
}//class
