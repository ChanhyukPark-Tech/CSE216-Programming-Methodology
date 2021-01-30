package Bank_0130;

public class AccountManager2 {

	public static void main(String[] args) {
		BankReader reader = new BankReader();
		BankAccount primary_account = new BankAccount("°èÁÂ1 " , 0);
		BankAccount secondary_account = new BankAccount("°èÁÂ2 " , 0);
		BankWriter primary_writer = new BankWriter(primary_account);
		BankWriter secondary_writer = new BankWriter(secondary_account);
		
		AccountController2 controller2 = new AccountController2(reader ,primary_account,secondary_account,primary_writer,secondary_writer );
		controller2.processTransactions();
	}

}