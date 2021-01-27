package GUI;

import java.awt.*;

import javax.swing.*;

public class ThrobFrame extends JFrame {
	int size;
	ThrobPanel p; 
	ColorButton b;
	
	
	public ThrobFrame(int size , ThrobPanel p , ColorButton b ) {
		this.size = size;
		this.p = p ;
		this.b = b ; 
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(p , BorderLayout.CENTER);
		cp.add(b, BorderLayout.SOUTH);
		setTitle("Throb"); setSize(size,size+40); setVisible(true);
		
		
	}
}
