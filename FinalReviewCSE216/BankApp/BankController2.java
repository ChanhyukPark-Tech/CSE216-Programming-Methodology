package BankApp;

public class BankController2 {
	BankReader reader ;
	BankAccount primary_account ;
	BankWriter primary_writer ; 
	BankAccount secondary_account ;
	BankWriter secondary_writer ; 
	BankAccount account ;
	BankWriter writer ; 
	

	public BankController2(BankReader reader , BankAccount primary_account , BankWriter primary_writer ,BankAccount secondary_account , BankWriter secondary_writer) 
	{
		this.reader = reader; 
		this.primary_account = primary_account;
		this.primary_writer = primary_writer;
		this.secondary_account = secondary_account;
		this.secondary_writer =secondary_writer ;
		
		account = primary_account;
		writer = primary_writer;
		
		
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
		case 'P' : {
			reset(primary_account , primary_writer);
			break;	
		}
		case 'S' : {
			reset(secondary_account , secondary_writer);
			break;	
		}
		}
		this.process();
	}
	
	public void reset(BankAccount new_account , BankWriter new_writer) {
		writer.transaction("��Ȱ��");
		account = new_account;
		writer = new_writer;
		writer.transaction("Ȱ��");
	}
	

}
