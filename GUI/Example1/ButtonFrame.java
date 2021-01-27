package GUI;

import java.awt.*;
import javax.swing.*;

public class ButtonFrame extends JFrame {
	public ButtonFrame() {
		JLabel label = new JLabel("Press this");
		JButton button = new JButton("OK");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label);
		c.add(button);
		setSize(200,100);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new ButtonFrame();
	}
}
