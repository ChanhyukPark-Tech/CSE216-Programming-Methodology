package Edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ReplaceMenuItem extends JMenuItem implements ActionListener {
	private ReplaceFrame view;
	
	public ReplaceMenuItem(String label , ReplaceFrame view) {
		super(label);
		this.view = view;
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		this.view.setVisible(true);
		
	}
	}

