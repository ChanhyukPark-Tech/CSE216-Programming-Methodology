package Library;

public class Key {
	
	
	private String letter ; 
	private int numbers; 
	
	public Key(String letter , int numbers) {
		this.letter = letter ;
		this.numbers = numbers;
	}
	
	public boolean equals(Key k) {
		
		if(letter.equals(k.getLetter()) && numbers == k.getNumbers()) {
			return true;
		}
		
		return false;
		
	}
	
	public String getLetter() {
		return letter;
	}
	
	public int getNumbers() {
		return numbers;
		
	}
	
	
	
	public String toString() {
		return letter + " : " + numbers;
	}
	
	
	

}
