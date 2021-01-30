package Bank_0130;

public class AccountManager {
	public static void main(String[] args) { 
		BankReader reader = new BankReader();
		BankAccount account = new BankAccount("my_account " , 0);
		BankWriter writer = new BankWriter(account);
		
		AccountController controller = new AccountController(account , writer , reader );
		
		controller.processTransactions();
	}
}
