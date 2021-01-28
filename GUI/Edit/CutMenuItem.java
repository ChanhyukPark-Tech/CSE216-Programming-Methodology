package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CutMenuItem extends EditorMenuItem {
	
	
	public CutMenuItem(String label, EditModel model) {
		super(label, model);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		myModel().cut();
	}

}
