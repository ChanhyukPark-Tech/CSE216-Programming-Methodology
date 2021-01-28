package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyMenuItem extends EditorMenuItem {
	
	
	public CopyMenuItem(String label, EditModel model) {
		super(label, model);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		myModel().copy();
	}

}
