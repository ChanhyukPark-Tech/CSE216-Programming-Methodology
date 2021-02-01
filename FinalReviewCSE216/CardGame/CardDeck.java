package CardGame;

public class CardDeck {
	int count ;
	Card[] deck = new Card[Card.ONE_SUIT_SIZE * 4] ;
	
	public CardDeck() {
		creatsuit(Card.SPADE);
		creatsuit(Card.DIAMOND);
		creatsuit(Card.CLUBS);
		creatsuit(Card.HEART);
	}
	
	public void creatsuit(String shape)
	{
		for(int i = 0 ; i < Card.ONE_SUIT_SIZE ; i++) {
			
			deck[count] = new Card(shape , i);
			count++;
		}
	}
	
	public Card newCard() {
		int index = (int)(Math.random() * count);
		System.out.println(index);
		Card this_card = deck[index];
		
		for(int i = index + 1 ; i < count ; i++) {
			deck[i-1] = deck[i];
		}
			count -- ;
		
		return this_card;
	}

}

