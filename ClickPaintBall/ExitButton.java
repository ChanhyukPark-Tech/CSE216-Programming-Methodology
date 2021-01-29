package ClickPaintBall;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ExitButton extends JButton implements ActionListener {
	
	public ExitButton(String label_name) {
		super(label_name);
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
