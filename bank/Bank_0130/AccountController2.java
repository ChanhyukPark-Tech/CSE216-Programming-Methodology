package Bank_0130;

public class AccountController2 {
	
	private BankReader reader;
	private BankAccount primary_account , secondary_account , account ;
	private BankWriter primary_writer , secondary_writer , writer ;
	
	public AccountController2(BankReader reader , BankAccount pa , BankAccount sa , BankWriter pw , BankWriter ps) {
		
		this.reader = reader;
		primary_account = pa;
		secondary_account = sa;
		primary_writer = pw;
		secondary_writer = ps;
		account = primary_account ;
		writer = primary_writer ;
		
	}
	
	public void resetAccount(BankAccount new_account , BankWriter new_writer) {
		writer.showTransaction("비활성");
		account = new_account;
		writer = new_writer; 
		writer.showTransaction("활성");
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
		
		case 'P' : {
			resetAccount(primary_account , primary_writer);
			break ;
		}
		case 'S' : {
			resetAccount(secondary_account , secondary_writer);
			break;
			}
		}
		
		this.processTransactions();
	}
}
