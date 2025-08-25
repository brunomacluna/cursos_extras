package blackJack;

import java.util.Scanner;

public class BlackJackMain {

	public static void main(String[] args) {
		
		Card card01;
		Card card02;
		Card cardBank01;
		Card cardBank02;
		Card newCard;
		String answer;
		boolean exit = false;
		boolean jogadorEstourouBruto = false;
				
		Deck d = new Deck();
		       
		d.shuffle();
		
		card01 = d.dealCard();
		card02 = d.dealCard();
		
		Hand playerHand = new Hand(card01, card02);
		
		System.out.println("SUA MÃO!!!");
		playerHand.printHand();
		System.out.println("Pontos totais: "+ playerHand.getPointsTotal());	
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		while(!exit) {
			
			if (playerHand.getPointsTotal() <= 21 && playerHand.cardCount < 5) {
							
				System.out.print("Deseja mais uma carta? [S/N]");
				answer = scanner.nextLine().toUpperCase();
				System.out.println();
				
				if(answer.equals("S")) {
					newCard = d.dealCard();
					
					if(newCard != null) {
						playerHand.addCard(newCard);
						playerHand.printHand();
						System.out.println("Pontos totais: "+ playerHand.getPointsTotal());
						System.out.println();
					}//if
					else {
						System.out.println("Não é possivel adicionar mais cartas, o baralho se esgotou!");
						exit = true;
						break;
					}//else
						
				}//if
				else {
					exit = true;
					break;
				}//else
			}//if			
			else {
				jogadorEstourouBruto = true;
				exit = true;
				break;
			}//else
		}//while
		
		int adjustedPoints = playerHand.calculateAdjustedTotal();
		
		if (jogadorEstourouBruto) {
			System.out.println("Você 'ESTOUROU' os pontos, hohohohohoho !!!");
			System.out.println("Pontos totais: "+ adjustedPoints);		
			System.out.println();
		}//if
		else if(playerHand.cardCount == 5){
			System.out.println("Você atingiu o limite de cartas!!!");
			System.out.println("Pontos totais: "+ adjustedPoints);
			System.out.println();
		}//else if
		else if(adjustedPoints == 21) {
			System.out.println("BLACK JACK !!!!");
			System.out.println("Pontos totais: "+ adjustedPoints);
			System.out.println();
		}//else if
		else {
			System.out.println("Você optou por 'PARAR'!!!");
			System.out.println("Pontos totais: "+ adjustedPoints);
			System.out.println();
		}//else
		
		cardBank01 = d.dealCard();
		cardBank02 = d.dealCard();
		Hand bankHand = new Hand(cardBank01, cardBank02);
		
		System.out.println("MÃO da BANCA!!!");
		bankHand.printHand();
		System.out.println("Pontos totais: "+ bankHand.getPointsTotal());	
		System.out.println();
		
		
		while (bankHand.getPointsTotal() <= 16 && bankHand.cardCount < 5) {
			newCard = d.dealCard();
			if (newCard != null) {
				bankHand.addCard(newCard);
				System.out.println("A banca pegou uma carta!");
				System.out.println();
			}//if
			else {
				break;
			}//else
		}//while
		
		int bankAdjustedPoints = bankHand.calculateAdjustedTotal();
		bankHand.printHand();
		System.out.println("Pontos totais: "+ bankAdjustedPoints);
		System.out.println();
		
		if(jogadorEstourouBruto) {
			System.out.println("Você perdeu, Vitoria da Banca. hohohohoho");
			if(bankAdjustedPoints == 21) {
				System.out.println("A Banca fez um BLACK JACK!!! hohohohoho");
			}//if
		}//if
		else if(bankAdjustedPoints > 21) {
			System.out.println("A Banca perdeu, Você Venceu!!!!");
			if(adjustedPoints == 21) {
				System.out.println("Parabéns, você fez um BLACK JACK !!!!");
			}//if
		}//else if
		else {
			 
			if(adjustedPoints < bankAdjustedPoints) {
				System.out.println("Você perdeu, Vitoria da Banca. hohohohoho");
				if(bankAdjustedPoints == 21) {
					System.out.println("A Banca fez um BLACK JACK!!! hohohohoho");
				}//if
			}//if
			else if(adjustedPoints > bankAdjustedPoints) {
				System.out.println("A Banca perdeu, Você Venceu!!!!");
				if(adjustedPoints == 21) {
					System.out.println("Parabéns, você fez um BLACK JACK !!!!");
				}//if
			}//else if
			else {
				System.out.println("Empatou a Bagaça!!!");
			}//else
		}//else
		
		scanner.close();
	}//main

}//class
