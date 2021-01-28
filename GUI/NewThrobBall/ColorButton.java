package NewThrobBall;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorButton extends JButton implements ActionListener {
	
	ThrobPanel panel ;
	
	public ColorButton(ThrobPanel p) {
		super("OK");
		panel = p;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Color c = panel.getColor();
		if(c==Color.red) {
			panel.setColor(Color.blue);
		} else {
			panel.setColor(Color.red);
		}
	}
}
