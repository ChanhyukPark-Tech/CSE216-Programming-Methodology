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
	
	
	public boolean deposit(int amount) {				// amount 는 사용자가 쓴것중에 뒤에 숫자부분
		if(amount >= 0 ) {
			balance = balance + amount;
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, " 올바른 입력값을 입력하세요 ");
			return false;
		}
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0 || amount > balance) {
			JOptionPane.showMessageDialog(null, " 잔고초과이거나 출력값오류 ");
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
