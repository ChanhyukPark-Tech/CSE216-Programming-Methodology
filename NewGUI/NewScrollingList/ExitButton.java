package NewScrollingList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton implements ActionListener{
	
	
	public ExitButton(String label) {
		super(label);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e ) {
		System.exit(0);
	}
}
