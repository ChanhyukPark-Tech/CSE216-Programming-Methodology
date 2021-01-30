package Bank_0130;

import javax.swing.JOptionPane;

public class BankReader {
	private String input_line;
	char command;
	
	
	
	public char readCommand(String message) {
		
//		try{
			input_line = JOptionPane.showInputDialog(message);
			input_line = input_line.toUpperCase();
			command = input_line.charAt(0);
			return command;
//		} catch(NullPointerException e) {
//			System.out.println("취소");
//		}
//		return command;
	}
	
	public int readAmount() {
		int money = 0 ;
		
		String temp1 = input_line.substring(1, input_line.length());
		if(temp1.length() > 0) {	
			double temp2 = new Double(temp1).doubleValue();	
			money = (int)temp2;
		} else {
			JOptionPane.showMessageDialog(null, "금액을 입력하지 않아 0으로 처리합니다");
		}
		return money;
		
	}

}
