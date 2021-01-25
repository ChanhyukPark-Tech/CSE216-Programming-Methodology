package CardGame;

import java.awt.Shape;

public class CardDeck {
	private Card[] deck= new Card[4 * Card.SIZE_OF_ONE_SUIT];
	private int card_count = 0 ; //how many cards remain in the deck
	 /** Constructor  CardDeck  creates a new card deck with all its cards */
	
	public CardDeck() {
		createsuit(Card.SPADES);
		createsuit(Card.HEARTS);
		createsuit(Card.CLUBS);
		createsuit(Card.DIAMONDS);
		
	}
	
	
	private void createsuit(String shape) {
	for(int i=1; i< Card.SIZE_OF_ONE_SUIT; i++) {
		deck[card_count] = new Card(shape , i);
		card_count ++;
	}
	}
	
	public Card newcard() {
		Card next_card = null;
		if(card_count == 0) {
			System.out.println("CardDeck error no more card");
		}else {
			int index = (int)(Math.random()*card_count);
			next_card = deck[index];
			
			for(int i = index + 1;i<card_count ; i++) {
				deck[i-1] = deck[i];
			}
			card_count --;
		}
		return next_card;
	}
	
	public int getCount() {
		return deck.length;
	}
}
