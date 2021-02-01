package BankApp;

public class BankController {
	BankReader reader ;
	BankAccount account ;
	BankWriter writer ; 
	

	public BankController(BankReader reader , BankAccount account , BankWriter writer ) {
		this.reader = reader; 
		this.account = account ;
		this.writer = writer ;
		
	}
	
	
	public void process() {
		char command = reader.readCommand("Q/W/D ���ϴ� �۾��� �ݾ��� �Է��ϼ���");
		switch(command) {
		case 'Q' : {
			return;
		}
		
		case 'W' : { 
			if(account.withdraw(reader.readAmount())) {
				writer.transaction("��ݼ���" , reader.readAmount());
			} else {
				writer.transaction("��ݽ���");
			}
			break;
		}
		
		case 'D' : {
			if(account.deposit(reader.readAmount())) {
				writer.transaction("�Աݼ���" , reader.readAmount());
			} else {
				writer.transaction("�Աݼ���");
			}
			break;
		}
		}
		this.process();
	}
	

}
