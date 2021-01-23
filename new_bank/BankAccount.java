import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name;
	public int balance;
//	public boolean processing   					// boolean ���� ó������ �������ϰ� �����̸� true �� ���и� false �� �ٲ㵵�ɱ�? 
	public BankAccount(String name, int initial_balance) {
		account_name = name;
		if(initial_balance >= 0) {                      //Balance �� 0 �̻��̸� �� �� ��� 0 ���� ������ 0 ���� �������ִ� �۾�
			balance = initial_balance;
		}else {
			balance = 0; 
		}
	}
	
	public int getBalance() {							// �ٱ����� ����ؾ��ϴ� �翬�� public ���� ����������Ѵ�
		return balance;
	}
	
	public boolean deposit(int amount) {				// �׻� �������Ѵٸ� ���Ϸ� boolean type ���� ��ȯ�ϰھ��
														// ���ܻ�Ȳ�� false �� ó�����ֱ����ؼ� boolean ������ ��ȯ 
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "�Ա��Ϸ��� �ݾ��� ������ ���ɼ����ֽ��ϴ�." + amount );
			return false;
		} else {
			balance += amount;
			return true;
		}	
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "����Ϸ��� �ݾ��� ������ ���ɼ����ֽ��ϴ�." + amount );
			return false;
		} else {
			if(amount > balance){
				JOptionPane.showMessageDialog(null, "����Ϸ��� �ݾ��� ���� �ܰ��� ���� ���ɼ����ֽ��ϴ�." + amount );
				return false;
			} else {
				balance -= amount;
				return true;
			}
		}
	}
}
