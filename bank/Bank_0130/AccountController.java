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
				writer.showTransaction("입금성공", amount);
			}else {
				writer.showTransaction("입금실패" + amount);
			}
			break;	
		}
		
		case 'W' : {
			int amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("출금성공", amount);
			}else {
				writer.showTransaction("출금실패" + amount);
			}
			break;
		}
		
		
		}
		this.processTransactions();
	}
}
