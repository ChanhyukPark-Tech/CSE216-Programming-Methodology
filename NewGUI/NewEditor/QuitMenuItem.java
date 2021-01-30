package NewEditor;

import java.awt.event.*;
import javax.swing.*;

public class QuitMenuItem extends JMenuItem implements ActionListener {
	
	public QuitMenuItem(String label) {
		super(label);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
