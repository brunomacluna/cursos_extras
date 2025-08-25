package mensagemSecreta;

import java.util.Scanner;

public class MensagemSecreta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
				
		String[] mensagem = new String[10];
		
		System.out.println("Digite 10 números entre [1] e [7]: ");		
		
		for(int i=0; i < mensagem.length; i++) {		
			
			System.out.print("Digite o "+(i+1)+"º número: ");
			numero = scanner.nextInt();
			scanner.nextLine();
			
			switch (numero) {
			    case 1 -> mensagem[i] = "D";
			    case 2 -> mensagem[i] = "W";
			    case 3 -> mensagem[i] = "E";
			    case 4 -> mensagem[i] = "L";
			    case 5 -> mensagem[i] = "H";
			    case 6 -> mensagem[i] = "O";
			    case 7 -> mensagem[i] = "R";
			    default -> {
			        System.out.println("\nEntrada Inválida!");
			        System.out.println("\nDigite 10 números entre [1] e [7]: \n");
			        i--; 
			    }//default
			}//switch	
		}//for
		
		System.out.println("\nMensagem Decodificada!");
		for (String letra : mensagem) {
			System.out.print(letra);
		}//for		
		
		scanner.close();
	}//main

}//class
