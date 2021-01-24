import java.awt.Color;
import java.awt.Graphics;

public class BallWriter2 {
	private MovingBall2 ball;		// ball �� �������� ����Ͽ� �װ��� �̿��Ͽ� �� �׷��ش�
	private Color balls_color;     // ���� ���⼭ color �� ����������ϳ�? 
										//�ִ� �װ� String ó�� �ִ°� color
	
	public BallWriter2(MovingBall2 x, Color c) {
		ball = x;
		balls_color = c;
	}										// ballwriter �� 
							// �̷��� �� ���콺 ��ǥ ���� 
	
	public void paint(Graphics g) { 			// paint �������̵� graphics g ����
		g.setColor(balls_color);				// ���� �������� 
		int radius = ball.radius();				// �������� �Ʊ� ball ���� radius �޼��� ����
		g.fillOval(ball.xPosition() - radius , ball.yPosition() - radius , radius * 2 , radius * 2);		// ���������� ���ͽ���
	}
}
// ball ���� xposition

