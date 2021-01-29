package BigSmallBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ThrobPanel extends JPanel {
	
	private int panel_size;
	private int location;
	private int ball_size;
	private Color c = Color.red;
	private ThrobBall ball ;
	
	
	public ThrobPanel(int size , ThrobBall b) {
		panel_size = size;
		location = panel_size / 2;
		ball_size = panel_size /3 ;
		ball =b ;
		setSize(panel_size,panel_size);
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
		if(ball.is_Large) {
			g.fillOval(location, location, ball_size, ball_size);
		} 	else {
			g.fillOval(location, location, ball_size/3, ball_size/3);
		}
	}

}
