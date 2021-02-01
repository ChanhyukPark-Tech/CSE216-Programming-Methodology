package BounceBall;

import java.awt.Color;
import java.awt.Graphics;

public class BoxWriter {
	Box box ;  
	
	
	public BoxWriter(Box box) {
		this.box = box; 
		
	}

	
	public void paint(Graphics g) {
		int size = box.sizeOf();
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.black);
		g.drawRect(0,0,size,size);	
	}
}


