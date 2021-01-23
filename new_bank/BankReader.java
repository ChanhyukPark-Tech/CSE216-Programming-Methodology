import javax.swing.JOptionPane;

public class BankReader {
	private String input_line;                // ���� �ֱٿ� �Է¹����� ������ ���ο��� ���� �̱⿡ private ���� ����
	char command;
	
	public char readCommand(String message) {
		input_line = JOptionPane.showInputDialog(message);
		input_line = input_line.toUpperCase();
		command = input_line.charAt(0);
		return command;
	}
	
	public int readAmount() {
//		String s = input_line.substring(1,input_line.length()); // �ӽú��� s ���� 
//		int amount = Integer.valueOf(s) * 100;
//		return amount;
		
		String s = input_line.substring(1,input_line.length());
		double dollars_cents = new Double(s).doubleValue();
		return (int)(dollars_cents * 100.0); // 1033
		
	}
}
