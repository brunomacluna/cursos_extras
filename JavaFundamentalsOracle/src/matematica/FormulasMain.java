package matematica;

import java.util.ArrayList;
import java.util.Scanner;

public class FormulasMain {

	public static void main(String[] args) {
		
		double x, y;
		
		Scanner input = new Scanner(System.in);
		ArrayList<Formulas> calculo = new ArrayList<Formulas>();

		while (true) {
			
			System.out.println("Qual método você deseja chamar?");
			System.out.print("[A], [B], [C], [D], [E], [F] ou [SAIR]: ");
			
			String metodos = input.nextLine();
			
			switch (metodos.toUpperCase()){				
				case "A":
					metodos = "A";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					Formulas metA = new Formulas();
					System.out.println(metA.a(x));				
					calculo.add(metA);
					break;
				
				case "B":	
					metodos = "B";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					System.out.print("Insira valor de y: ");
					y = input.nextDouble();
					input.nextLine();
					Formulas metB = new Formulas();				
					System.out.println(metB.b(x, y));	
					calculo.add(metB);				
					break;
					
				case "C":
					metodos = "C";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					Formulas metC = new Formulas();
					System.out.println(metC.c(x));				
					calculo.add(metC);
					break;
					
				case "D":
					metodos = "D";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					System.out.print("Insira valor de y: ");
					y = input.nextDouble();
					input.nextLine();
					Formulas metD = new Formulas();				
					System.out.println(metD.d(x, y));				
					calculo.add(metD);
					break;
					
				case "E":
					metodos = "E";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					System.out.print("Insira valor de y: ");
					y = input.nextDouble();
					input.nextLine();
					Formulas metE = new Formulas();				
					System.out.println(metE.e(x, y));				
					calculo.add(metE);
					break;
					
				case "F":
					metodos = "F";
					System.out.print("Insira valor de x: ");
					x = input.nextDouble();
					input.nextLine();
					Formulas metF = new Formulas();
					System.out.println(metF.f(x));				
					calculo.add(metF);
					break;
					
				case "SAIR":
					System.out.println("Obrigado!!!");
					break;
					
				default:
					
					System.out.println("Opção inválida. Tente novamente.");
					
				}//switch
			
			if (metodos.equalsIgnoreCase("SAIR")) {
				break;
				}			
		}//while
		
		for (Formulas imprime : calculo) {
			System.out.println(imprime);
		}
	}//main

}//class
