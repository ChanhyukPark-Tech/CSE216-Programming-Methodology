
public class AccountManager {

	public static void main(String[] args) {
		//create the application's objects:
		BankReader reader = new BankReader();
		BankAccount account = new BankAccount("myaccount" , 0);
		BankWriter writer = new BankWriter(account);
		AccountController controller = new AccountController(reader , writer , account);
		
		//start the controller:
		controller.processTransaction();
		
	}

}
