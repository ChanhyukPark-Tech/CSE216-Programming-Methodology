package CardGame;

public class Dealer {
	
	
	public static void main(String[] args) {
		
		CardDeck card_deck = new CardDeck();
		for(int i=0 ; i<Card.ONE_SUIT_SIZE*4  ; i ++) {
			
			System.out.println(card_deck.newCard());
//			System.out.println(Math.random());
		}
	}
	

}
