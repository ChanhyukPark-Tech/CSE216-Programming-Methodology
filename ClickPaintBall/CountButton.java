package ClickPaintBall;

import java.awt.event.*;

import javax.swing.*;

public class CountButton extends JButton implements ActionListener {
	Counter count ;
	Frame view ; 
	public CountButton(String label_name , Counter count , Frame view) {
		super(label_name);
		this.count = count;
		this.view = view;
				
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e ) {
		count.increment();
//		view.update();
		view.update();
	}
}
