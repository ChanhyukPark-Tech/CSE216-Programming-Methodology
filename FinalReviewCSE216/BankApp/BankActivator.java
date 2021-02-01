package BankApp;

public class BankActivator {
	
	

	public static void main(String[] args) {

		BankAccount account = new BankAccount("my account " , 0);
		BankReader reader = new BankReader();
		BankWriter writer = new BankWriter(account);
		BankController controller = new BankController(reader , account , writer);
		
		controller.process();
		
	}

}
