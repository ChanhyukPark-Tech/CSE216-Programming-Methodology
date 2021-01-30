package Bank_0130;

public class AccountController {
	
	BankAccount account ;
	BankWriter writer ;
	BankReader reader ;
	
	public AccountController(BankAccount account , BankWriter writer , BankReader reader) {
		this.account = account ; 
		this.writer = writer ;
		this.reader = reader ;
	}
	
	public void processTransactions() {
		char command = reader.readCommand("Q/D/W/ SELECT");
		switch(command) {
		case 'Q' : {
			return;
		}
		case 'D' : {
			int amount = reader.readAmount();
			if(account.deposit(amount)) {
				writer.showTransaction("�Աݼ���", amount);
			}else {
				writer.showTransaction("�Աݽ���" + amount);
			}
			break;	
		}
		
		case 'W' : {
			int amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("��ݼ���", amount);
			}else {
				writer.showTransaction("��ݽ���" + amount);
			}
			break;
		}
		
		
		}
		this.processTransactions();
	}
}
