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
			System.out.println("���Է¾��� ����");
			return 'Q';
			
		} catch(NullPointerException e) {
			System.out.println("��Ҵ���");
			return 'Q';
		}
	}
	
	public int readAmount() {
		
		try{
			double temp1 = new Double(line.substring(1 , line.length())).doubleValue(); //���������� 
			double temp2 = 100 * temp1; 
			amount = (int)temp2;
			return amount;
		} catch(NumberFormatException e) {
			System.out.println("��ȣ�� �Է��ϰ� �ݾ��� �Է¾��ϼ̽��ϴ�");
			System.exit(0);
			return 0;
		}
	}
	
	

}
