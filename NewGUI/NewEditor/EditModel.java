package NewEditor;
import java.awt.Font;

import javax.swing.JTextArea;

public class EditModel extends JTextArea {
	
	public EditModel(String initial_text , int row , int col) {
		super(initial_text , row , col );
		setLineWrap(true);
		setFont(new Font("Segoe Script" , Font.BOLD,20) );
		
	}
	
	public void clear() {
		setText("");
	}
	
	public int find(String s , int where_start_to_find) {
		int index = getText().indexOf(s, where_start_to_find);
		if(index != -1) {
			setCaretPosition(index + s.length());
			moveCaretPosition(index);
		}
		return index ;
	}
	
	public int findFromStart(String s) {
		return find(s , 0);
	}
	
	public int findFromCaret(String s) {
		return find(s , getCaretPosition());
	}

}
