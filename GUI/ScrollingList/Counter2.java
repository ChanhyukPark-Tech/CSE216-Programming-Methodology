package ScrollingList;

public class Counter2 {
	public int count , index;
	
	public Counter2(int count , int index) {
		this.count = count;
		this.index = index;
	}
	
	public int countOf() {
		return count;
	}
	
	public void increment() {
		count++;
	}
	
	public String toString() {
		return ("index " + this.index + "'s count is " + countOf());
	}

}
