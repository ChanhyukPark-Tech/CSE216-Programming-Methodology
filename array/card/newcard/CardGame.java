package CardGame;

public class CardGame {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		
		for(int i = 0 ; i < deck.getCount(); i++) {
			System.out.println(deck.newcard());
			
		}
		
	}

}
