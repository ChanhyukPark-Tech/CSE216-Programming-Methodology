import javax.swing.JOptionPane;

public class BankAccount {
	public String account_name;
	public int balance;
//	public boolean processing   					// boolean 값을 처음부터 변수로하고 성공이면 true 로 실패면 false 로 바꿔도될까? 
	public BankAccount(String name, int initial_balance) {
		account_name = name;
		if(initial_balance >= 0) {                      //Balance 가 0 이상이면 그 값 사용 0 보다 작으면 0 으로 강제해주는 작업
			balance = initial_balance;
		}else {
			balance = 0; 
		}
	}
	
	public int getBalance() {							// 바깥에서 사용해야하니 당연히 public 으로 정의해줘야한다
		return balance;
	}
	
	public boolean deposit(int amount) {				// 항상 성공만한다면 뭐하로 boolean type 으로 반환하겠어요
														// 예외상황을 false 로 처리해주기위해서 boolean 값으로 반환 
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "입금하려는 금액이 음수일 가능성이있습니다." + amount );
			return false;
		} else {
			balance += amount;
			return true;
		}	
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0) {
			JOptionPane.showMessageDialog(null, "출금하려는 금액이 음수일 가능성이있습니다." + amount );
			return false;
		} else {
			if(amount > balance){
				JOptionPane.showMessageDialog(null, "출금하려는 금액이 현재 잔고보다 많을 가능성이있습니다." + amount );
				return false;
			} else {
				balance -= amount;
				return true;
			}
		}
	}
}
