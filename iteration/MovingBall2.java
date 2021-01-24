
public class MovingBall2 {               // 공의 움직임을 기술하는 class 공 위치 속도에 따른 
	private int x_pos;
	private int y_pos;
	private int x_velocity = 2;
	private int y_velocity = 5;
	private int radius;
	private Box2 container;				// box 객체를 만든이유는 box 랑 교감하기때문에 부딪히고 
	
	public MovingBall2(int x_position, int y_position, int radius , Box2 c) {
		x_pos = x_position;
		y_pos = y_position;
		this.radius = radius;
		container = c;
	}
	
	public int xPosition() {
		return x_pos;
	}
	public int yPosition() {
		return y_pos;
	}
	public int radius() {
		return radius;
	}
	
	public void move(int time_units) {     			 // time_units
													//거속시 
		x_pos = x_pos + time_units * x_velocity;   // box 클래스를만들걸알고 box class안에 
		if(container.inHorizontalContact(x_pos)) {   // 
			x_velocity = -x_velocity;
		}
		y_pos = y_pos + time_units * y_velocity;
		if(container.inVerticalContact(y_pos)) {
			y_velocity = -y_velocity;
		}
	}
	// 찍고 찍고 찍고 repaint() 계속그리고그리고그리고 
}
