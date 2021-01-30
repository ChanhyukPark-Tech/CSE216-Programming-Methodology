package NewEditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public abstract class EditorMenuItem extends JMenuItem implements ActionListener {
	
	private EditModel buffer;
	public EditorMenuItem(String label  , EditModel model) {
		super(label);
		buffer = model ;
		addActionListener(this);
		
	}
	
	public EditModel myModel() {
		return buffer; 								// 왜 하는 작업인지 알아보기
	}
	
	public abstract void actionPerformed(ActionEvent e);
	

}
