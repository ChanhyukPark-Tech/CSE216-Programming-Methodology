package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ThrobPanel extends JPanel {
	private int location;
	private ThrobbingBall ball;
	private Color c = Color.red;
	private int ball_size;
	private int panel_size;
	
	
	
	ThrobPanel(int size , ThrobbingBall ball){
		this.panel_size = size;
		this.ball = ball;
		location = panel_size / 2;
		ball_size = panel_size / 3 ;
		setSize(panel_size , panel_size);
		
	}
	
	public Color getColor() {
		return c;
	}
	
	public void setColor(Color c) {
		this.c = c;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, panel_size, panel_size);
		g.setColor(c);
		if(ball.isLarge()) {
			g.fillOval(location, location, ball_size, ball_size);
		}else {
			g.fillOval(location, location, ball_size / 2, ball_size /2 );
		}
	}
}

























































//