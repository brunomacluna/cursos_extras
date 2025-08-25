package galToLit;

import java.util.Scanner;

public class GalToLit {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*double galoes;
		double litros;
		final double CADAGALAO = 3.785;		
		
		System.out.print("Digite quantos galões você quer converter para litros: ");
		galoes = scanner.nextDouble();
		System.out.println("");
		
		litros = galoes * CADAGALAO;
		
		System.out.println(String.format("%.2f galões equivalem a %.2f litros.", galoes, litros));
		*/
		
		/*System.out.print("What grade are you in? ");
		int grade = scanner.nextInt();
		scanner.nextLine();
		
		switch(grade) {
			case 9 -> System.out.print("You are a freshman");
			case 10 -> System.out.print("You are a sophomore");
			case 11 -> System.out.print("You are a junior");
			case 12 -> System.out.print("You are a senior");
			default -> System.out.print("Invalid grade");
		}//switch
		*/
		
		/*System.out.println();
		System.out.println();
		
		int x = 5; 
		String y = x <= 7 ? "sim" : "não";
		System.out.println(y);
		*/
		double resposta;
		System.out.print("Digite um número: ");
		double num1 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Digite outro número: ");		
		double num2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Digite o operador [+], [-], [*], [/], [%]: ");
		String operador = scanner.nextLine();
		
		switch (operador){
			case "+" -> {  
				resposta = num1 + num2;
				System.out.println("Soma: "+ resposta);
			}
			case "%" -> {
				resposta = num1 % num2;
				System.out.println("Mod "+ resposta);
			}
			case "-" -> {
				resposta = num1 - num2;
				System.out.println("Subtração: "+ resposta);
			}
			case "*" -> {
				resposta = num1 * num2;
				System.out.println("Produto: "+ resposta);
			}
			case "/" -> {
				resposta = num1 / num2;
				System.out.println("divisão: "+ resposta);
			}
			default -> System.out.println("Entrada Inválida!");
		}//switch
		
		System.out.println();
		
		if(operador.equalsIgnoreCase("+")) {
			resposta = num1 + num2;
			System.out.println("Soma: "+ resposta);
		}
		else if(operador.equalsIgnoreCase("-")) {
			resposta = num1 - num2;
			System.out.println("Subtração: "+ resposta);
		}
		else if(operador.equalsIgnoreCase("*")) {
			resposta = num1 * num2;
			System.out.println("Produto: "+ resposta);
		}
		else if(operador.equalsIgnoreCase("/")) {
			resposta = num1 / num2;
			System.out.println("divisão: "+ resposta);
		}
		else if(operador.equalsIgnoreCase("%")) {
			resposta = num1 % num2;
			System.out.println("Mod "+ resposta);
		}
		else {
			System.out.println("Entrada Inválida!");
		}//if else
		
	}//main

}//class
