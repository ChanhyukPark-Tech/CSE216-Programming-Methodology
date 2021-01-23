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
		JOptionPane.showMessageDialog(null,message +  bank.account_name + "에 작업 성공 "+unconvert(amount) + " 가 들어가서"
				+ unconvert(bank.getBalance()) + "is 최종잔액" );
	}
	
	public void showTransaction(String message) {
		JOptionPane.showMessageDialog(null, message + bank.account_name + "에 작업 실패");  
	}
}
