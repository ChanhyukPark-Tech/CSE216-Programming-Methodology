import javax.swing.JOptionPane;

public class BankReader {
	private String input_line;                // 가장 최근에 입력받은것 순전히 내부용의 변수 이기에 private 으로 선언
	char command;
	
	public char readCommand(String message) {
		input_line = JOptionPane.showInputDialog(message);
		input_line = input_line.toUpperCase();
		command = input_line.charAt(0);
		return command;
	}
	
	public int readAmount() {
//		String s = input_line.substring(1,input_line.length()); // 임시변수 s 도입 
//		int amount = Integer.valueOf(s) * 100;
//		return amount;
		
		String s = input_line.substring(1,input_line.length());
		double dollars_cents = new Double(s).doubleValue();
		return (int)(dollars_cents * 100.0); // 1033
		
	}
}
