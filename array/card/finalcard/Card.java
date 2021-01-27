
public class Card {
	public static final String DIAMOND = "diamonds";
	public static final String CLOVER = "clovers";
	public static final String HEART = "hearts";
	public static final String SPACE = "spaces";

	public static final int ONE_SUIT_SIZE = 13;
	public static final int ACE = 1;
	public static final int J = 11;
	public static final int Q = 12;
	public static final int K = 13;
	
	private String suit;
	private int count;
	
	public Card(String s , int count ) { 		// ī�� ����(��ü)���� �׸��� ���� ������ ���ڿ� ���� ������ ������ִ�. 
		suit = s;
		this.count = count; 
	}
	
	public String getSuit() {
		return suit;
	}

	public int getCount() {
		return count;
	}
	
	public String toString() {
		return (suit + "  " + count);
	}
}
