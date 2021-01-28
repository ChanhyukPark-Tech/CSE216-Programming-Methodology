package Edit;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class FindMenuItem extends EditorMenuItem {
	public FindMenuItem(String label , EditModel model) {
		super(label, model);
	}
	
	// 이벤트 처리를 해줘야한다 ! 
	
	public void actionPerformed(ActionEvent e) {
		String s = JOptionPane.showInputDialog(this , "Type string to be found");		//다이얼 로그가 어떤 frame 에 나타나게 될 것인지 정해주는 변수
		if(s != null) {																	//Ex.) null
			int index = myModel().findFromCaret(s);
			if(index == -1) {
				int response = JOptionPane.showConfirmDialog(this, 
					      "String " + s + " not found.  Restart search from beginning of buffer?");
					if(response == JOptionPane.YES_OPTION) {
						if(myModel().findFromStart(s) == -1) {
							JOptionPane.showMessageDialog(this, s + " is not Found");
					}
				}
			}
		}
	}

}
