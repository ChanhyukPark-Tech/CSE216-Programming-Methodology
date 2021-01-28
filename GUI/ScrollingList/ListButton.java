package ScrollingList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListButton extends JButton implements ActionListener {
	String label;
	Counter2[] count;
	ListFrame view;
	
	public ListButton(String label , Counter2[] c , ListFrame v) {
		super(label);
		count = c;
		view = v;	
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int index = view.getSelection();				// getSelection �� ���� ���� item �� index ��ȯ �ֳ��ϸ� increment���ְ�ʹ�
	
		if(index != -1) {
			
			count[index].increment();
			view.update();
		}
		
	}
}
