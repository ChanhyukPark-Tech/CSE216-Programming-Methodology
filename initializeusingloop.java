
public class initializeusingloop {

	public static void main(String[] args) {
		int[] r = new int[12];
		
		r[0] = 1;
		r[1] = 1;
		
		for(int i=2; i<r.length;i++) {
			r[i] = r[i-1] + r[i-2];
			System.out.print(r[i] + " ");
		}
	}

}
