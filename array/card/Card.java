
public class Card {
	
	public static final String SPADES = "spades";
	public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds";
	public static final String CLUBS = "clubs";
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	
	public static final int SIZE_OF_ONE_SUIT = 13;  //  How many cards in one suit
	
	private String suit;
	private int count;
	
	public Card(String s , int c) {
		suit = s;
		count = c;
	}
	
	public String toString() {
		return(suit + " : " + count);
	}
	
	public String getsuit() {
		return suit;
	}
	
	public int getcount() {
		return count;
	}
	
	
	

}
