package classeObjetosMetodos;

import java.util.Scanner;

public class ClasseObjetosMetodos {

	public static void main(String[] args) {
		
		/* exercícios 2 e 3
		Animal a1 = new Animal();
		Animal a2 = new Animal(15, 5, 3);
		
		System.out.println("Animal #1 tem uma velocidade de"+ a1.getSpeed());
		System.out.println("Animal #2 tem uma velocidade de"+ a2.getSpeed());
		*/
		/* exercício 4, 5 e 6
		Student e1 = new Student("Mary Jones", 14, 46);
		Student e2 = new Student("John Stiner", 60, 173);
		Student e3 = new Student("Ari Samala", 31, 69);
		
		e3.atualizarMedia(13, 52);
		*/
		
		Card[] maoJogador = new Card[5];
		int contaCard = 0;
		
		int suitNumber = (int)(Math.random()*4.0+1);
		int faceNumber = (int)(Math.random()*13.0+1);
		Card newCard = new Card(suitNumber,faceNumber);
		System.out.println(newCard);
		maoJogador[0] = newCard;
		contaCard++;
		
		int suitNumber02 = (int)(Math.random()*4.0+1);
		int faceNumber02= (int)(Math.random()*13.0+1);
		Card newCard02 = new Card(suitNumber02,faceNumber02);
		System.out.println(newCard02);
		maoJogador[1] = newCard02;
		contaCard++;		
		
		String name01 = newCard.getName(faceNumber);				
		int pontos01 = newCard.getPoints(name01);
		
		String name02 = newCard02.getName(faceNumber02);				
		int pontos02 = newCard02.getPoints(name02);
		
		int maoAtual = pontos01 + pontos02;
		System.out.println("Mão Atual: "+ maoAtual +" pontos.");
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		String resposta;
		boolean sair = false;
		
		while (contaCard < 5 && maoAtual <= 21) {			
					
			System.out.print("Deseja mais uma carta? [s/n]: ");
			resposta = scanner.nextLine().toUpperCase();
			
			if (resposta.equals("S")) {
				
				int suitNumberWhile = (int)(Math.random()*4.0+1);
				int faceNumberWhile = (int)(Math.random()*13.0+1);
				maoJogador[contaCard] = new Card(suitNumberWhile, faceNumberWhile);								
				System.out.println(maoJogador[contaCard]);
				String nameWhile = maoJogador[contaCard].getName(faceNumberWhile);
				int pontosWhile = maoJogador[contaCard].getPoints(nameWhile);
				maoAtual += pontosWhile;
				System.out.println("Mão Atual: "+ maoAtual +" pontos.");
				contaCard++;
				System.out.println();
				
				if (maoAtual > 21) {
					System.out.println("Mão estourada com "+ maoAtual +" pontos auhauhauhauha");
				}//if
				
			}//if
			else {
				System.out.println("Certo, Boa Sorte!!!");
				sair = true;
				break;
			}//else
		}//while
		
		scanner.close();
	}//main

}//class
