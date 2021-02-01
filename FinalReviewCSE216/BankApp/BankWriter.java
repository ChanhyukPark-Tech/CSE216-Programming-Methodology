package BankApp;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BankWriter {
	
	String transaction ; 
	BankAccount account;							// 내가 만든 account 를 쓸거니깐 
	
	public BankWriter(BankAccount account) {
		this.account = account ;
		
	}
	
	public String  unconvert(int i ) {
		String  answer = new DecimalFormat("0.00").format(i / 100);
		return answer;
	}
	
	public void transaction(String text , int amount) {
		
		transaction = account.name + text +" 처리된 금액 " + unconvert(amount) +" 총잔액 : " +  unconvert(account.getBalance()) ;
		JOptionPane.showMessageDialog(null, transaction );
		
	}
	//if (deposit성공)
	
	
	public void transaction(String text) {
		
		transaction = account.name + text + unconvert(account.getBalance()) ; 
		JOptionPane.showMessageDialog(null, transaction);
		
	}
}
