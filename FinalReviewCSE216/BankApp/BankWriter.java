package BankApp;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankWriter {
	
	String transaction ; 
	BankAccount account;							// ���� ���� account �� ���Ŵϱ� 
	
	public BankWriter(BankAccount account) {
		this.account = account ;
		
	}
	
	public String  unconvert(int i ) {
		String  answer = new DecimalFormat("0.00").format(i / 100);
		return answer;
	}
	
	public void transaction(String text , int amount) {
		
		transaction = account.name + text +" ó���� �ݾ� " + unconvert(amount) +" ���ܾ� : " +  unconvert(account.getBalance()) ;
		JOptionPane.showMessageDialog(null, transaction );
		
	}
	//if (deposit����)
	
	
	public void transaction(String text) {
		
		transaction = account.name + text + unconvert(account.getBalance()) ; 
		JOptionPane.showMessageDialog(null, transaction);
		
	}
}
