
public class AccountController2 {
	private BankReader reader;
	private BankAccount account , primary_account , secondary_account;
	private BankWriter writer , primary_writer, secondary_writer;
	
	public AccountController2(BankReader r , BankAccount a1, BankWriter w1, BankAccount a2, BankWriter w2) {
		this.reader = r;
		this.primary_account = a1;
		this.primary_writer = w1;
		this.secondary_account = a2;
		this.secondary_writer = w2;
		
		// default setting
		account = primary_account;
		writer = primary_writer;	
	}
	
	public void resetAccount(BankAccount new_account , BankWriter new_writer) {
		writer.showTransaction("비활성");
		account = new_account;
		writer = new_writer;
		writer.showTransaction("활성");
	}
	public void processTransactions() {
		char command = reader.readCommand("명령 P/S/D/W/Q와 금액을 입력하시오");
		switch(command) {
		case 'P' : {
			resetAccount(primary_account,primary_writer);
			break;
		}
		case 'S' : {
			resetAccount(secondary_account,secondary_writer);
			break;
		}
		case 'Q' :
			return;
		case 'D' :
		{
			int amount = reader.readAmount();
			if(account.deposit(amount)) {
				writer.showTransaction("입금 $", amount);		
			} else { 
				writer.showTransaction("입금 오류", amount);				
			}
			break;
		}
		case 'W' : {
			int amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("출금 $", amount);
			} else {
				writer.showTransaction("출금 오류", amount);				
			}
			break;
			}
		default : {
			writer.showTransaction("잘못된 명령 : " + command);
		}	
	}
		this.processTransactions();
	}
}

