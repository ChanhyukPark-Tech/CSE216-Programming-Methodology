package TranslateString;

import javax.swing.JOptionPane;


public class TestApp {

	public static void main(String[] args) {
		TranslateString m = new TranslateString(1);
		String original = JOptionPane.showInputDialog("��ȣȭ�� ������ �Է��ϼ���.");
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		JOptionPane.showMessageDialog(null, "���� : " + original + "\n ��ȣȭ : " + encoded + "\n ��ȣȭ : " + decoded );
			
	}

}
