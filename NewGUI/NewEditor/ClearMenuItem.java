package NewEditor;

import java.awt.event.ActionEvent;

public class ClearMenuItem extends EditorMenuItem {
	
	EditModel buffer;
	
	public ClearMenuItem(String label , EditModel model) {
		super(label , model);
		buffer = model ;
	}
	
	public void actionPerformed(ActionEvent e ) {
		myModel().clear();
		//buffer.clear();             <<-------- 실험해보기 
		
	}

}
