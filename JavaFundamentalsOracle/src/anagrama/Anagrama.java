package anagrama;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String escrita;
		String escrita_2;
				
		System.out.print("Digite a 1º palavra ou frase: ");
		escrita = scanner.nextLine();
		escrita = escrita.toUpperCase().strip().replace(" ", "").replace(".", "").replace(",", "").replace("?", "").replace("!", "");
		
		System.out.print("Digite a 2º palavra ou frase: ");
		escrita_2 = scanner.nextLine();
		escrita_2 = escrita_2.toUpperCase().strip().replace(" ", "").replace(".", "").replace(",", "").replace("?", "").replace("!", "");
				
		char[] arrayEscrita = escrita.toCharArray();
		char[] arrayEscrita_2 = escrita_2.toCharArray();
		
		Arrays.sort(arrayEscrita);
		Arrays.sort(arrayEscrita_2);
		
		System.out.println("\nPrimeira frase/palavra ordenada: " + Arrays.toString(arrayEscrita));
		System.out.println("Segunda frase/palavra ordenada: " + Arrays.toString(arrayEscrita_2));
		
		if (Arrays.equals(arrayEscrita, arrayEscrita_2)) {
			System.out.println("\nAs frases/palavras são anagramas!");
		}
		else {
			System.out.println("\nAs frases/palavras NÃO são anagramas.");
		}//if else
		
	}//main

}//class
