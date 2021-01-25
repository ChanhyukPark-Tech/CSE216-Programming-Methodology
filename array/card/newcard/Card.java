package CardGame;

public class Card {
	//definition that one can use to describe the value of a card
	// we want to use constant value so use the static final
	public static final String SPADES = "spades";
	public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds";
	public static final String CLUBS = "clubs";
	
	public static final int SIZE_OF_ONE_SUIT = 13;		 // 한문양당 13개의 카드가 있다.
	
	public static final int ACE = 1;
	public static final int J = 11;
	public static final int Q = 12;
	public static final int K = 13;                                //special case;
	
	//These are the card's attributes
	
	private String suit;
	private int count;									// number on the card;
	
	public Card(String shape , int count) {
		suit = shape;
		this.count = count;
	}
	
	public String suitOf() {
		return suit;
	}
	
	public int countOf() {
		return count;
	}
	public String toString() {
		return (suit + " : " + this.count);
	}
	
	
	
}
