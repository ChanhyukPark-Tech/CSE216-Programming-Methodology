package NewScrollingList;

public class Activator {
	
	public static void main(String[] args) {
		int number = 8;
		Counter[] count = new Counter[number];
		
		for(int i = 0 ; i < number;  i++ ) {
			count[i] = new Counter(0 , i);
		}
		new ListFrame(count);
		
	}

}
