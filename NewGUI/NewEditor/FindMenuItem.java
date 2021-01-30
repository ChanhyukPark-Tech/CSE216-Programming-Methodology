package NewEditor;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class FindMenuItem extends EditorMenuItem {
	
	public FindMenuItem(String label , EditModel model ) {
		super(label , model);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = JOptionPane.showInputDialog(this , "Type you want to find"); // this 없애보고 실행해보기
		if(s != null) {
			int index = myModel().findFromCaret(s);
			if(index == -1 ) {
				int p = JOptionPane.showConfirmDialog(this, "can't not found find from start you want?");
				if(p == JOptionPane.OK_OPTION) {
					
					index = myModel().findFromStart(s);
					
					if(index == -1) {
						JOptionPane.showMessageDialog(this, "sorry " + s + " can not be found ");
						
					}
					
				}
			}
		}
	}

}
