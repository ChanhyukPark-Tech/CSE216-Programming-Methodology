package BankApp;

public class BankData {
	
	

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("my account1 " , 0);
		BankAccount account2 = new BankAccount("my account2 " , 0);
		BankReader reader = new BankReader();
		BankWriter writer1 = new BankWriter(account1);
		BankWriter writer2 = new BankWriter(account2);
		BankController2 controller = new BankController2(reader , account1 , writer1, account2, writer2);
		
		controller.process();
		
	}

}
