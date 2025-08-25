package pesoSistemaSolar;

import java.util.Scanner;

public class CalcularPeso {

	public static void main(String[] args) {
		
		double pesoTerra;
		double pesoPlaneta;
		int planetas;
		boolean sair = false;
		
		Scanner scanner = new Scanner(System.in);
						
		System.out.println("CALCULE SEU PESO NO SISTEMA SOLAR!");
		System.out.println();
		System.out.print("Digite seu peso na Terra: ");
		
		pesoTerra = scanner.nextDouble();
		scanner.nextLine();
		
		while (!sair) {
		
		System.out.println("\nDigite o número do planeta para saber seu peso lá!");
		System.out.println("[1] Mercúrio\n[2] Vênus\n[3] Marte\n[4] Júpiter\n[5] Saturno\n[6] Urano\n[7] Netuno\n[8] SAIR");
		System.out.print("Opção: ");
		planetas = scanner.nextInt();
		
		
		switch(planetas) {
			case 1 -> {
				pesoPlaneta = pesoTerra * 0.38;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Mercúrio é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 2 -> {
				pesoPlaneta = pesoTerra * 0.91;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Vênus é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 3 -> {
				pesoPlaneta = pesoTerra * 0.38;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Marte é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 4 -> {
				pesoPlaneta = pesoTerra * 2.36;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Júpiter é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 5 -> {
				pesoPlaneta = pesoTerra * 0.92;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Saturno é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 6 -> {
				pesoPlaneta = pesoTerra * 0.89;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Urano é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 7 -> {
				pesoPlaneta = pesoTerra * 1.13;
				System.out.printf("\nSeu peso na Terra é %.2f kg, mas em Netuno é %.2f kg.%n", pesoTerra, pesoPlaneta);
			}
			case 8 -> {
				System.out.println("\nEncerrando o programa!\nObrigado!");
				sair = true;
				break;
			}				
			default -> {
				System.out.println("Entrada Inválida!");
				break;
			}			
		}//switch
		
	}//while
	scanner.close();		
	}//main
		
}//class
