
public class AccountController {
	private BankReader reader;
	private BankWriter writer;
	private BankAccount account;
	
	public AccountController(BankReader r , BankWriter w , BankAccount a) {
		this.reader = r;
		this.writer = w;
		this.account = a;		
	}
	
	public void processTransaction(){
		char command = reader.readCommand("��� D/W/Q�� �ݾ��� �Է��Ͻÿ�");
		switch(command) {
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
		this.processTransaction();	
	}
}
