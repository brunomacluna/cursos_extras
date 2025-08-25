package blackJack;

import java.util.Random;

public class Deck {

	private Random rand;	
	Card[] cardArray = new Card[52];
	private int nextCardIndex = 0;
	    
	    Deck(){
	        int suits = 4;
	        int cardType = 13;
	        int cardCount = 0;
	        for(int i = 1; i <= suits; i++)
	            for(int j = 1; j <= cardType; j++){
	                cardArray[cardCount] = new Card(i,j);
	                cardCount++;
	            }//for
	        rand = new Random();
	    }// Constructor

	    public void print(){
	        for(int i = 0; i < cardArray.length; i++)
	            System.out.println(cardArray[i]);
	    }//method
	    
	    public void shuffle() {
	    	for (int i = cardArray.length -1; i > 0; i--) {
	    		int j = rand.nextInt(i + 1);
	    		
	    		Card temp = cardArray[i];
	    		cardArray[i] = cardArray[j];
	    		cardArray[j] = temp;
	    	}//for 	    	
	    }//shuffle
	    
	    public Card dealCard() {
	    	if(nextCardIndex < cardArray.length) {
	    		Card cardToDeal = cardArray[nextCardIndex];
	    		nextCardIndex++;
	    		return cardToDeal;
	    	}//if
	    	else {
	    		System.out.println("Erro: Baralho vazio! Não há mais cartas para distribuir.");
	    		return null;
	    	}//else	    	
	    }//dealCard
	
}//class
