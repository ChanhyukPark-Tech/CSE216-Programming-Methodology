import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankWriter {
	private BankAccount bank;
	private String last_transaction = "";
	
	public BankWriter(BankAccount  b) { 
		bank = b;
	}
	
	public String unconvert(int i) {
		return new DecimalFormat("0.00").format(i / 100.0);
	}
	
	public void showTransaction(String message , int amount) {
		JOptionPane.showMessageDialog(null,message +  bank.account_name + "�� �۾� ���� "+unconvert(amount) + " �� ����"
				+ unconvert(bank.getBalance()) + "is �����ܾ�" );
	}
	
	public void showTransaction(String message) {
		JOptionPane.showMessageDialog(null, message + bank.account_name + "�� �۾� ����");  
	}
}
