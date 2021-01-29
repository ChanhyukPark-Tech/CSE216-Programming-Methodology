package BigSmallBall;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;


public class ThrobFrame extends JFrame {
	private ThrobPanel draw;
	private ColorButton button;
	
	
	public ThrobFrame(int size , ThrobPanel b , ColorButton button) {
		this.draw = b;
		this.button = button;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(draw, BorderLayout.CENTER); cp.add(button,BorderLayout.SOUTH);
		setTitle("Throb ball! ");
		setSize(size , size + 40);
		
		setVisible(true);
	
	}
}
