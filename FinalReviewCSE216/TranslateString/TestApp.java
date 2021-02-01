package TranslateString;

import javax.swing.JOptionPane;


public class TestApp {

	public static void main(String[] args) {
		TranslateString m = new TranslateString(1);
		String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요.");
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		JOptionPane.showMessageDialog(null, "원본 : " + original + "\n 암호화 : " + encoded + "\n 복호화 : " + decoded );
			
	}

}
