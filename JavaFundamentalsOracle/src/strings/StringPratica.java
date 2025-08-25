package strings;

import java.util.Scanner;

public class StringPratica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = "";
		
		string3 = "How are you ".concat(string2);
		
		System.out.println("string3: " + string3);
		System.out.println("length: " + string1.length());		
		System.out.println("Sub: " + string3.substring(0, 5));		
		System.out.println("upper: " + string3.toUpperCase());
		
		System.out.println();
		
		String s1 = "This is a ";
		String s2 = "string";
		String s3 = s1 + s2;
		String s4 = "This is a " + s2;
		//String s1 += s2;
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		
		System.out.println();
		
		String f1 = "Isso é um exemplo de escape.\n"
				+ "E agora estamos em uma nova linha. \n \t Isso é uma tabulação.";
		String f2 = "\"This is a quote\"";
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		
		System.out.println();
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.equals(s4));
		
		System.out.println();
		
		String h1 = "This is a string.";
		int n = h1.length();
		System.out.println(n);
		
		System.out.println();
		
		String g1 = "I eat apples";
		String g2 = "Bananas are my favorite fruit";
		System.out.println(g1.substring(6) + " " + g2.substring(8, 23));
		
		System.out.println();
		
		System.out.println(g1.indexOf("a"));
		System.out.println(g1.charAt(3));
		
		System.out.println();
		
		String domain = "";
		String email = "brunomacluna@gmail.com";
		int position = email.indexOf("@");
		domain = email.substring(position);
		System.out.println(domain);
		
		System.out.println();
		
		String k1 = "ABC";
		String k2 = new String("DEF");
		String k3 = "AB" + "C";
		System.out.println("a. " + k1.compareTo(k2));
		System.out.println("b. " + k2.equals(k3));
		System.out.println("c. " + (k3 == k1));
		System.out.println("d. " + k2.compareTo(k3));
		System.out.println("e. " + k3.equals(k1));
		
		System.out.println();
		
		String primeiraString = "Olá"; 
		String segundaString = " Mundo!"; 		
		String stringConcatenada = primeiraString + segundaString;
		System.out.println(stringConcatenada); 
		
		
		PalindromoTeste palindromo = new PalindromoTeste();
		
		palindromo.palindromoTeste("Arara");
	}//main

}//class
