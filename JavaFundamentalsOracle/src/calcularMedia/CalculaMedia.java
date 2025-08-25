package calcularMedia;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota;
		double somaDasNotas = 0;
		double media;
		
		double[] notasTestes = new double[5];
		
		for (int i = 0; i < notasTestes.length; i++) {
			
			System.out.print("Digite a nota do teste "+ (i+1) +": ");
			nota = scanner.nextDouble();
			scanner.nextLine();
			
			notasTestes[i] = nota;
			
			somaDasNotas += notasTestes[i];
			
		}//for
		
		media = somaDasNotas / notasTestes.length;
		
		System.out.println("\nSua notas foram: " + (notasTestes[0]) +", "+ (notasTestes[1]) +", "
		+ (notasTestes[2]) +", "+ (notasTestes[3]) +", "+ (notasTestes[4]));
		System.out.print("Sua média foi: "+ media);
		
		scanner.close();
	}//main

}//class
