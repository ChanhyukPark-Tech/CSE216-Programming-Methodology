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
		int index = view.getSelection();				// getSelection 을 통해 지금 item 의 index 반환 왜냐하면 increment해주고싶다
	
		if(index != -1) {
			
			count[index].increment();
			view.update();
		}
		
	}
}
