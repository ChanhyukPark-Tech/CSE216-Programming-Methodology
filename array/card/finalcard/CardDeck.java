
public class CardDeck {
	
	Card[] deck = new Card[4*Card.ONE_SUIT_SIZE];
	
	int count = 0 ;
	public CardDeck() {
		createsuit(Card.CLOVER);
		createsuit(Card.SPACE);
		createsuit(Card.DIAMOND);
		createsuit(Card.HEART);
	}
	
	public void createsuit(String shape) {
		for(int i=0; i < Card.ONE_SUIT_SIZE; i++) {
			deck[count] = new Card(shape,i);
			count ++;
		}
	}		
	public Card newcard() {
		int index = (int)(Math.random() * count);
		Card new_card = deck[index];
		for(int i = index + 1; i < count ; i++) {
			deck[i-1] = deck[i];
		}
		count --;
		return new_card;
	}
		
		
	}

