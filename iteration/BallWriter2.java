import java.awt.Color;
import java.awt.Graphics;

public class BallWriter2 {
	private MovingBall2 ball;		// ball 의 반지름을 사용하여 그것을 이용하여 원 그려준다
	private Color balls_color;     // 굳이 여기서 color 를 지정해줘야하나? 
										//있는 그거 String 처럼 있는게 color
	
	public BallWriter2(MovingBall2 x, Color c) {
		ball = x;
		balls_color = c;
	}										// ballwriter 지 
							// 이렇게 밑 라디우스 좌표 색깔 
	
	public void paint(Graphics g) { 			// paint 오버라이딩 graphics g 관례
		g.setColor(balls_color);				// 색깔 뭘로할지 
		int radius = ball.radius();				// 반지름은 아까 ball 에서 radius 메서드 정의
		g.fillOval(ball.xPosition() - radius , ball.yPosition() - radius , radius * 2 , radius * 2);		// 왼쪽위에서 부터시작
	}
}
// ball 에서 xposition

