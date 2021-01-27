package GUI;

import java.awt.event.*;

import javax.swing.*;

public class CountButton extends JButton implements ActionListener {
	private Frame4 view;
	private Counter model;
	public CountButton(String label, Counter m , Frame4 v) {
		super(label);
		model = m ;
		view = v;
		addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e ) {
		model.increment();
		view.update();
		
	}
	
}
