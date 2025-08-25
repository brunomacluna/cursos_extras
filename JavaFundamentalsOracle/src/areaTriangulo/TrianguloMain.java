package areaTriangulo;

import java.util.Scanner;
import java.util.ArrayList;

public class TrianguloMain {

	public static void main(String[] args) {
	
		double area;
		double base;
		double altura;
		String continuar;
		
		Scanner input = new Scanner(System.in);
		ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>(); 
		
		while (true) {		
		System.out.println("Vamos calcular a área do triangulo!");
		System.out.print("Digite a base do triangulo: ");
		base = input.nextDouble();
		
		System.out.print("Digite a altura do triangulo: ");
		altura = input.nextDouble();
		
		Triangulo triangulo = new Triangulo(base, altura);
		triangulo.calcularTriangulo();
		System.out.println(triangulo.toString());		
		
		triangulos.add(triangulo);
		
		System.out.print("\nDeseja calcular outro triangulo? [s] ou [n]: ");
		continuar = input.next();
		if (continuar.equalsIgnoreCase("s")) {
			System.out.println();
			continue;
		}//if
		else {
			System.out.println("\nObrigado!");
			input.close();
			break;
		}//else
		}//while
		
		for (Triangulo tri : triangulos) {
			System.out.println(tri);
		}//for
		
		
	}//main

}//class
