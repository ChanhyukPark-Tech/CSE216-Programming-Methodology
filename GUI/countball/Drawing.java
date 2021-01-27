package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Drawing extends JPanel {
	private Counter count;
	public Drawing(Counter model) {
		count = model;
		setSize(200,80);		
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0,0,200,80);
		g.setColor(Color.red);
		int x=0, y=0;
		for(int i=0; i<count.countOf(); i++) {
			g.fillOval(x*25,y*25,20,20);
			x++;
			if(x>7) {
				x=0;
				y++;
			}
		}
	}

}
