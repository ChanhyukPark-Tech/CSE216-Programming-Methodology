import javax.swing.JOptionPane;

public class RaggedArray {
	
	public static void main(String[] args) {
	int max_count = 20;
	char[][] word = new char[max_count][];
	int count = 0;
	boolean processing = true;
	
	while(processing) {
		String s = JOptionPane.showInputDialog("PLease type a word:" ); 
		if(s == null) {
			processing = false;
		} else {
			
			word[count] = new char[s.length()];
			for(int i=0; i<s.length(); i++) {
				word[count][i] = s.charAt(i);
			}
			count++;
		}
	}
	for (int i=0 ; i< count ; i++) {
		System.out.println(word[i]);
	}

}
}
