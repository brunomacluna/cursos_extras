package blackJack;

public class Hand {

	Card[] handArray = new Card[5];
	
	int pointsTotal;
	int cardCount = 0;
	
	public Hand(Card carta1, Card carta2) {
		handArray[0] = carta1;
		handArray[1] = carta2;
		cardCount = 2;		
	}//constructor
	
	public void addCard(Card card) {
		if(cardCount < 5) {
			handArray[cardCount] = card;
			cardCount++;
		}//if		
	}//method

	public int getPointsTotal() {
		int currentTotal = 0;
		for(int i = 0; i < cardCount; i++) {
			currentTotal += handArray[i].points;
		}//for		
		return currentTotal;
	}//getPointsTotal

	public void printHand() {
		 
		for(int i = 0; i < cardCount; i++)
            System.out.println(handArray[i]);
	}//printHand
	
	public int calculateAdjustedTotal() {
		int adjustedTotal = getPointsTotal();
		int aceCount = 0;
		for(int i = 0; i < cardCount; i++) {
			if(handArray[i].name.equals("Ace")) {
				aceCount++;				
			}//if					
		}//for
		while (adjustedTotal > 21 && aceCount != 0) {
			adjustedTotal -= 10;
			aceCount--;
		}//while
		return adjustedTotal;
	}//calculateAdjustedTotal
	
	
}//class
