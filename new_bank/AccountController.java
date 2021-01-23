
public class AccountController {
	private BankReader reader;
	private BankWriter writer;
	private BankAccount account;
	
	public AccountController(BankReader r , BankWriter w , BankAccount a) {
		reader = r;
		writer = w;
		account = a;
	}
	
	public void processTransaction() {
		int amount;
		char command = reader.readCommand("Q / W / D 중 원하는 작업과 금액을 입력하시오");
		switch(command) {
		case 'Q' : 
			return;
			
		case 'D': //입금명령이 들어왔을 때 해야할일
			// 입금금액을 알아내야한다 
			// deposit 함수를 호출해야한다. 
			// 성공 실패 여부를 출력해야한다. 
			amount = reader.readAmount();
			if (account.deposit(amount)) {
				writer.showTransaction("입금 성공 ", amount);
			} else {
				writer.showTransaction("입금 오류");
			}
			break;
		case 'W': 
			amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("출금 성공 ", amount);
			}else {
				writer.showTransaction("출금 오류");
			}
			break;
			
		default:
			writer.showTransaction("잘못된 명령이 입력되었습니다" + command);
	}
		this.processTransaction(); // 재귀호출
}
}
