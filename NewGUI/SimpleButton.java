package NewGUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class SimpleButton extends JFrame {
	
	public SimpleButton() {
		
		JButton ok = new JButton("OK");
		JLabel text = new JLabel("Press This");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(ok); cp.add(text);
		setTitle("Simple Button");
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SimpleButton();
		
	}

}
