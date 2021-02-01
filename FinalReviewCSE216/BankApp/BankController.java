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
		char command = reader.readCommand("Q/W/D 원하는 작업과 금액을 입력하세요");
		switch(command) {
		case 'Q' : {
			return;
		}
		
		case 'W' : { 
			if(account.withdraw(reader.readAmount())) {
				writer.transaction("출금성공" , reader.readAmount());
			} else {
				writer.transaction("출금실패");
			}
			break;
		}
		
		case 'D' : {
			if(account.deposit(reader.readAmount())) {
				writer.transaction("입금성공" , reader.readAmount());
			} else {
				writer.transaction("입금성공");
			}
			break;
		}
		}
		this.process();
	}
	

}
