package BankApp;

import javax.swing.JOptionPane;

public class BankAccount {
	
	public String name;
	private int balance;
	
	public BankAccount(String name , int balance) {
		this.name = name;
		if(balance >= 0) {
			this.balance = balance;
		}else {
			JOptionPane.showMessageDialog(null, "잘못된 값을 입력 하였습니다");
			this.balance = 0 ;			
		}
	}
	
	
	public boolean deposit(int amount) {
		if(amount >= 0) {
			balance += amount;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 값을 입력 하셨습니다");
			return false; 
		}
	}
	
	
	public boolean withdraw(int amount) {
		if(amount < 0 || this.balance < amount) {
			JOptionPane.showMessageDialog(null, "출금 불가 , 잔액부족 혹은 값 입력 오류");
			return false;		
		} else {
			balance -= amount;
			return true;
		}
	}
	
	
	public int getBalance()	{
		return balance ;
	}
	
	
	
	
	
	

}
