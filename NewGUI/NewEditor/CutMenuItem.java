package NewEditor;

import java.awt.event.ActionEvent;

public class CutMenuItem extends EditorMenuItem {
	
	EditModel buffer;
	
	public CutMenuItem(String label , EditModel model) {
		super(label , model);
		buffer = model ;
	}
	
	public void actionPerformed(ActionEvent e ) {
		myModel().cut();
//		buffer.cut();  //								 <<-------- 실험해보기 
		
	}

}
