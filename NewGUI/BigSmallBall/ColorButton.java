package BigSmallBall;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorButton extends JButton implements ActionListener {
	private ThrobPanel view;
	
	public ColorButton(ThrobPanel p , String label) { 		//교수님은 패널만 난 패널 + label
		super(label);
		this.view = p;
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Color c = view.getColor();
		
		if(c == Color.red) {
			view.setColor(Color.blue);
		}	else {
			view.setColor(Color.red);
		}
	}
}
