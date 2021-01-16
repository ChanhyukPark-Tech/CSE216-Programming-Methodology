
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
		writer.showTransaction("��Ȱ��");
		account = new_account;
		writer = new_writer;
		writer.showTransaction("Ȱ��");
	}
	public void processTransactions() {
		char command = reader.readCommand("��� P/S/D/W/Q�� �ݾ��� �Է��Ͻÿ�");
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
				writer.showTransaction("�Ա� $", amount);		
			} else { 
				writer.showTransaction("�Ա� ����", amount);				
			}
			break;
		}
		case 'W' : {
			int amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("��� $", amount);
			} else {
				writer.showTransaction("��� ����", amount);				
			}
			break;
			}
		default : {
			writer.showTransaction("�߸��� ��� : " + command);
		}	
	}
		this.processTransactions();
	}
}

