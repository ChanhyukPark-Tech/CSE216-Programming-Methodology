import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name;
	private int balance;
	
	public BankAccount(String name , int initial_balance) {
		account_name = name;
		if(balance >= 0 ) {
			balance = initial_balance;
		} else {
			balance = 0;
		}	
	                                                       }
	
	public int getBalance() {
		return balance; // ȣ��Ǵ� ��ü�� balance ���� ��ȯ		
	}
	public boolean deposit(int amount) {
		
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "wrong number");
			return false;
		}
		else {
			balance = balance + amount;
			return true;
				}		
	}
	public boolean withdraw(int amount) {
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "wrong number");
			return false;
		}else {
			if (amount > balance) {
				JOptionPane.showMessageDialog(null, "�ܰ� �����մϴ�.");
				return false;
			}else {
				balance = balance - amount;
				return true;
			}	
		}
		
	}
}