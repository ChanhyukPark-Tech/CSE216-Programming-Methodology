package Edit;

import java.awt.Font;

import javax.swing.JTextArea;

public class EditModel extends JTextArea {
	public EditModel(String initial_text , int rows , int cols) {
		super(initial_text , rows, cols);
		setLineWrap(true);
		setFont(new Font("Courier" , Font.PLAIN, 14)); // Font font = new Font("Segoe Script", Font.BOLD, 20);
	}
	
	public void clear() {
		setText("");
	}
	
	public int find(String s , int position) {
		int index = getText().indexOf(s,position);
		if(index != -1) {
			setCaretPosition(index + s.length());
			moveCaretPosition(index);
		}
		return index;
		
	}
	public int findFromStart(String s) {
		return find(s,0);
	}
	public int findFromCaret(String s) {
		return find(s, getCaretPosition());
	}
}

