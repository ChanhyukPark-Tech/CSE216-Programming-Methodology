
public class CardManager {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		for(int i=0; i< Card.ONE_SUIT_SIZE*4 ; i++) {
			System.out.println(deck.newcard());
			System.out.println(i);
		}
	}

}
