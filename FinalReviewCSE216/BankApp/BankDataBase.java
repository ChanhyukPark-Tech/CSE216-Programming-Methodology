package BankApp;

public class BankDataBase {
	int number_of_account = 100 ;
	BankAccount[] accounts  ;
	
	public BankDataBase(int number , BankAccount[] accounts) {
		accounts = new BankAccount[number];
		
	}
	

}
