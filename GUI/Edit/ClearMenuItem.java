package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearMenuItem extends EditorMenuItem {
	
	
	public ClearMenuItem(String label, EditModel model) {
		super(label, model);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		myModel().clear();
	}

}
