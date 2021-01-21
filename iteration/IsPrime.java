
public class IsPrime {
	public static int isPrime(int n) {
		
		if (n<2) 
			throw new RuntimeException("error : invalid " + n );
		boolean found = false; // 인수를 찾았니?
		int c = n/2 ;
		
		while (!found && c>1) {
			if(n%c == 0) {
				found = true;
			} else {
				c = c - 1;
			}
		}
		
		if(!found) {
			return 1; 
		}
		
		return c;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(27));
	}

}
