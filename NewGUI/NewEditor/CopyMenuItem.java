package NewEditor;

import java.awt.event.ActionEvent;

public class CopyMenuItem extends EditorMenuItem {
	
	EditModel buffer;
	
	public CopyMenuItem(String label , EditModel model) {
		super(label , model);
		buffer = model ;
	}
	
	public void actionPerformed(ActionEvent e ) {
		myModel().copy();
//		buffer.cut();  //								 <<-------- 실험해보기 
		
	}

}
