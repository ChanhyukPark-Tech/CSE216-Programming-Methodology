package NewThrobBall;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class ThrobFrame extends JFrame {
	
	public ThrobFrame(int size , ThrobPanel p , ColorButton b) {
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(p,BorderLayout.CENTER);
		cp.add(b,BorderLayout.SOUTH);
		setTitle("Throb");setSize(size,size);setVisible(true);
		
	}
}
