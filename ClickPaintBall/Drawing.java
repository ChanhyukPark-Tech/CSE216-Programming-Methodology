package ClickPaintBall;

import javax.swing.*;
import java.awt.*;


public class Drawing extends JPanel{
	
	Counter count ;
	
	public Drawing(Counter c) {
		count = c; 
	setSize(200,80);					// ¿Ö ´Æ?
		 
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 500,500); 			// ³×¸ðÄ­ 
		g.setColor(Color.red);
		int x=0,y=0;
		int ball_size =20;
		for(int i=0 ; i < count.countOf() ; i++) {
			g.fillOval(x * 25, y * 25, ball_size, ball_size);
			x++; if(x>7) {
				x=0;y++;
			}
		}
	}
	

}
