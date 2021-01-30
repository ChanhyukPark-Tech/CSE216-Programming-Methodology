package NewScrollingList;

public class Counter {
	
	private int count,my_index;
	
	Counter(int count , int my_index ){
		this.count = count ;
	}
	
	public void increment() {
		count++;
	}
	
	public int countOf() {
		return count;
	}

	public String toString() {
		return (my_index + " has " + count );
	}
}
