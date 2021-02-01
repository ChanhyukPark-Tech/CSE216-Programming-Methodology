package CardGame;

public class Card {
	
	public static final int ONE_SUIT_SIZE = 13;
	
	public static final String SPADE = "spades";
	public static final String DIAMOND = "diamonds";
	public static final String CLUBS = "clubs";
	public static final String HEART = "hearts";
	
	
	private static final int ACE = 1;
	private static final int J = 11;
	private static final int Q = 12;
	private static final int K = 13;
	
	String shape;
	int number;
	
	public Card(String shape , int number) {
		
		this.shape = shape;
		this.number = number;

	}
	
	public String toString() {
		return ("[" + shape + " 모양의  " + number + " 번째 카드 ]");
	}
}
