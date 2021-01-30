package Bank_0130;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankWriter {
	
	private BankAccount account ;
	private String last_transaction;
	
	public BankWriter(BankAccount account) {
		this.account = account;
	}
	
	private String unconvert(int i) {
		return new DecimalFormat("0.00").format(i/100.0);
		
	}
	
	public void showTransaction(String message, int amount) {
		last_transaction = message + " " + unconvert(amount);
		System.out.println(account.account_name + " : " + last_transaction);
		System.out.println("Current balance $ " + unconvert(account.getBalance()));
	}
	
	public void showTransaction(String message) {
		
		last_transaction = message ; 
		System.out.println(account.account_name + " : " + last_transaction );
		
	}

}
