import java.awt.Color;
import java.awt.Graphics;

public class BallWriter {
	private MovingBall ball;
	private Color balls_color;
	
	public BallWriter(MovingBall x , Color c) {
		this.ball = x;
		balls_color = c;
	}
	public void paint(Graphics g) {
		g.setColor(balls_color);
		int radius = ball.radiusOf();
		g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius * 2, radius * 2);
	}

}
