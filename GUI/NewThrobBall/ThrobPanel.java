package NewThrobBall;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ThrobPanel extends JPanel {
	
	private ThrobbingBall ball;
	private int panel_size;
	private Color c = Color.red;
	private int location , ball_size;
	

	public ThrobPanel(ThrobbingBall b , int size) {
		ball = b;
		panel_size = size;
		location = panel_size / 3;
		ball_size = panel_size / 4;
		setSize(panel_size , panel_size);		// �гλ�����
		
	}
	
	public Color getColor() {
		return c;
	}
	
	public void setColor(Color c) {
		this.c = c;
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0,0,panel_size,panel_size);
		
		g.setColor(c);
		if(ball.isLarge()) { // ThrobbingBall ���� ���������������ָ� ��������
			g.fillOval(location, location, ball_size, ball_size);
		} else {
			g.fillOval(location/2, location/2, ball_size/2 , ball_size /2);		// x  y ��ǥ�� �ٲ�����ϳ�? 

		}
	}
}
