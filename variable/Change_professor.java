// MakeChange- dollars 와 cents가 주어지면 이에 해당하는 동전 수를 계산한다.
public class Change_professor {

	public static void main(String[] args) {
		int dollars = 3;
		int cents = 46;
		int money = (dollars * 100) + cents ;
		System.out.println("quarters = " + (money / 25 ));
		money = money % 25;
		System.out.println("dimes = " + (money / 10 ));
		money = money % 10;
		System.out.println("nikels= " + (money / 5));
		money = money % 5;
		System.out.println("cents = " + (money / 1 ));
		
	}

}
