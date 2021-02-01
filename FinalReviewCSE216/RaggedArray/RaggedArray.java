package RaggedArray;

import javax.swing.JOptionPane;

public class RaggedArray {

	public static void main(String[] args) {
		int max_words = 20;
		char[][] word = new char[max_words][];
		int count = 0 ;
		boolean processing = true ;
		while(processing && count < max_words) {
			String s = JOptionPane.showInputDialog("Please type a word");
			if(s == null) {
				processing = false;
			}
			else {
//				char[] save_i_want = new char[s.length()];
				word[count] = new char[s.length()];
				for(int i=0; i<s.length(); i++) {
					word[count][i] = s.charAt(i);
				}
				count ++ ;
				
			}
		}
		
			for(int i = 0 ; i < 5 ; i++) {
				
				System.out.println(word[0][i]);
			}
		}
	}


