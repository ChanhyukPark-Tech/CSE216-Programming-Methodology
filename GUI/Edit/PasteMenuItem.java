package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasteMenuItem extends EditorMenuItem {
	
	
	public PasteMenuItem(String label, EditModel model) {
		super(label, model);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		myModel().paste();
	}

}
