package NewGUI;

public class Counter {
	
	int count; 
	
	public Counter(int c) {
		count = c;
	}
	
	public int countOf() {
		return count;
	}
	
	public void increment() {
		count ++;
	}
	
	public String toString() {
		return count + " ";
	}
}
