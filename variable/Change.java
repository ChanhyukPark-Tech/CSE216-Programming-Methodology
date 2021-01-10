import javax.swing.JOptionPane;

// 잔돈을 큰 단위부터 최대한 많이 분배하는 알고리즘
public class Change {

	public static void main(String[] args) {
		String result = JOptionPane.showInputDialog("put in your change(cents)");
		int change = Integer.parseInt(result);

		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		
		int quarters_number = (change/quarters);
		int quarters_remain = (change%quarters);
		int dimes_number = (quarters_remain/dimes);
		int dimes_remain = (quarters_remain%dimes);
		int nickels_number = (dimes_remain/nickels);
		int nickels_remain = (dimes_remain%nickels);
		int pennies_number = (nickels_remain/pennies);
		int pennies_remain = (nickels_remain%pennies);
		
		int hownumber[] = {quarters_number,dimes_number,nickels_number,pennies_number};
		
		for(int i=0; i < hownumber.length; i++) {
			System.out.println(hownumber[i]);
		}
		
		
		
		
		
		
				
		
	}

}
