
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
		char command = reader.readCommand("Q / W / D �� ���ϴ� �۾��� �ݾ��� �Է��Ͻÿ�");
		switch(command) {
		case 'Q' : 
			return;
			
		case 'D': //�Աݸ���� ������ �� �ؾ�����
			// �Աݱݾ��� �˾Ƴ����Ѵ� 
			// deposit �Լ��� ȣ���ؾ��Ѵ�. 
			// ���� ���� ���θ� ����ؾ��Ѵ�. 
			amount = reader.readAmount();
			if (account.deposit(amount)) {
				writer.showTransaction("�Ա� ���� ", amount);
			} else {
				writer.showTransaction("�Ա� ����");
			}
			break;
		case 'W': 
			amount = reader.readAmount();
			if(account.withdraw(amount)) {
				writer.showTransaction("��� ���� ", amount);
			}else {
				writer.showTransaction("��� ����");
			}
			break;
			
		default:
			writer.showTransaction("�߸��� ����� �ԷµǾ����ϴ�" + command);
	}
		this.processTransaction(); // ���ȣ��
}
}
