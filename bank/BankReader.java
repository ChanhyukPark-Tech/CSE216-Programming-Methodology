import javax.swing.JOptionPane;

public class BankReader {
	
	private String input_line;
	
	public char readCommand(String message) {
		input_line = JOptionPane.showInputDialog(message);
		input_line = input_line.toUpperCase(); //d100 > D 100
		return input_line.charAt(0);
	}
	public int readAmount() {
		// input_line = "D 10.33" -> 1033
		if(input_line.length() == 1) {
			JOptionPane.showMessageDialog(null, "금액을 입력하지 않아서 0 으로 처리합니다");
			return 0;
		} else {
			
		}
		String s = input_line.substring(1, input_line.length()); // "10.33"
		double dollars_cents = new Double(s).doubleValue(); // 10.33
//		double -> int
		return	(int)(dollars_cents * 100.0); // 1033 
	}
}
