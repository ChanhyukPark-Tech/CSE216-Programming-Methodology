// carddeck models a deck of cards
public class CardDeck {
	private int card_count;
	private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
	// 불변식: deck[0] ... deck[card_count-1] 에는 카드가 있다.
	
	private void createSuit(String which_suit) {
			
		for(int i =1; i<=Card.SIZE_OF_ONE_SUIT; i++ ) {
			deck[card_count] = new Card(which_suit,i);
			card_count += 1;
			
		}
		
	}
	
	public CardDeck() {
		createSuit(Card.CLUBS);
		createSuit(Card.DIAMONDS);
		createSuit(Card.HEARTS);
		createSuit(Card.SPADES);
	}
	public Card newCard() {
		Card next_card = null;
		if(card_count == 0 ) {
			System.out.println("CardDeck error : no more cards ");
		} else {
			
			int index = (int)(Math.random() * card_count);
			next_card = deck[index];
		
		
			for( int i = index+1; i != card_count ; i ++ ) {
				deck[i-1] = deck[i];
			}
			card_count = card_count - 1;
		}
		return next_card;

}
	public boolean moreCards() {
		return(card_count > 0);
	}
}


