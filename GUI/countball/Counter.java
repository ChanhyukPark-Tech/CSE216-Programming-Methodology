package GUI;

public class Counter {
	private int count;
	public Counter(int count) {	
		this.count = count;
	}
	
	public int increment() {
		return count ++;
	}
	
	public int countOf() {
		return count;
	}
	
}
