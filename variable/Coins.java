// Coins - 9quarters, 2 dimens, no nickels , and 6pennies 를 가지고 있을 때 몇 센트를 가지고 있는지 계산해 주는 프로그램


class Coin{
	public int calculate(int v1 , int v2 , int v3 , int v4) {	
		System.out.print("The total is ");
		System.out.println("For "+ v1 + "quarters, " + v2 + " dimes, " + v3 + " nickels, and " + v4 + " pennies" );
		return v1*25 + v2*10 + v3*5 + v4 ; 
	}
}
public class Coins {
	
	public static void main(String[] args) {
	Coin c1 = new Coin();
	int result = c1.calculate(156, 1, 3, 1);
	System.out.println(result);
	System.out.print("The total is $");
	System.out.print(result/100 + ".");
	System.out.println(result%100);

	}

}
