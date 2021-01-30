package NewEditor;

import java.awt.event.ActionEvent;

public class PastMenuItem extends EditorMenuItem {
	
	EditModel buffer;
	
	public PastMenuItem(String label , EditModel model) {
		super(label , model);
		buffer = model ;
	}
	
	public void actionPerformed(ActionEvent e ) {
		myModel().paste();
//		buffer.cut();  //								 <<-------- 실험해보기 
		
	}

}
