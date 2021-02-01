package BounceBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BallWriter extends JPanel {
	
	private Ball ball ; 
	private Color balls_color;

	public BallWriter(Ball ball , Color c) {
		this.ball = ball ;
		this.balls_color = c;
	}
	
	public void paint(Graphics g) {
		
		g.setColor(balls_color);
		g.fillOval(ball.getXpos() - ball.getRadius() , ball.getYpos() - ball.getRadius(), ball.getRadius() * 2, ball.getRadius() * 2);
		
	}
}
