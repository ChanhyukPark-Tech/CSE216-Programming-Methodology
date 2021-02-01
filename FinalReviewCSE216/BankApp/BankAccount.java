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
			JOptionPane.showMessageDialog(null, "�߸��� ���� �Է� �Ͽ����ϴ�");
			this.balance = 0 ;			
		}
	}
	
	
	public boolean deposit(int amount) {
		if(amount >= 0) {
			balance += amount;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� ���� �Է� �ϼ̽��ϴ�");
			return false; 
		}
	}
	
	
	public boolean withdraw(int amount) {
		if(amount < 0 || this.balance < amount) {
			JOptionPane.showMessageDialog(null, "��� �Ұ� , �ܾ׺��� Ȥ�� �� �Է� ����");
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
