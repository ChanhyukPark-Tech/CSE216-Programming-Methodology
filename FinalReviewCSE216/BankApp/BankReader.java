package BankApp;

import javax.swing.JOptionPane;

public class BankReader {
	
	private String line ;
	private int amount;
	
	public char readCommand(String text) {
		try {
			line = JOptionPane.showInputDialog(text);
			line = line.toUpperCase();
			char command = line.charAt(0);
			return command ;	
		} catch(StringIndexOutOfBoundsException e ) {
			System.out.println("값입력없이 종료");
			return 'Q';
			
		} catch(NullPointerException e) {
			System.out.println("취소누름");
			return 'Q';
		}
	}
	
	public int readAmount() {
		
		try{
			double temp1 = new Double(line.substring(1 , line.length())).doubleValue(); //공백을무시 
			double temp2 = 100 * temp1; 
			amount = (int)temp2;
			return amount;
		} catch(NumberFormatException e) {
			System.out.println("기호만 입력하고 금액을 입력안하셨습니다");
			System.exit(0);
			return 0;
		}
	}
	
	

}
