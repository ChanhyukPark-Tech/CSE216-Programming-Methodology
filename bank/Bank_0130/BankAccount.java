package Bank_0130;

import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name;
	private int balance ; 
	
	public BankAccount(String name , int balance) {
		account_name = name;
		if(balance >= 0 ) {			
			this.balance = balance; 
		} else {
			this.balance = 0;
		}
	}
	
	
	public boolean deposit(int amount) {				// amount �� ����ڰ� �����߿� �ڿ� ���ںκ�
		if(amount >= 0 ) {
			balance = balance + amount;
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, " �ùٸ� �Է°��� �Է��ϼ��� ");
			return false;
		}
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0 || amount > balance) {
			JOptionPane.showMessageDialog(null, " �ܰ��ʰ��̰ų� ��°����� ");
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	public int getBalance() {
		return balance;
	}

}
