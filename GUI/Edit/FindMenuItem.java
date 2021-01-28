package Edit;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class FindMenuItem extends EditorMenuItem {
	public FindMenuItem(String label , EditModel model) {
		super(label, model);
	}
	
	// �̺�Ʈ ó���� ������Ѵ� ! 
	
	public void actionPerformed(ActionEvent e) {
		String s = JOptionPane.showInputDialog(this , "Type string to be found");		//���̾� �αװ� � frame �� ��Ÿ���� �� ������ �����ִ� ����
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
