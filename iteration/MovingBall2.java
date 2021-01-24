
public class MovingBall2 {               // ���� �������� ����ϴ� class �� ��ġ �ӵ��� ���� 
	private int x_pos;
	private int y_pos;
	private int x_velocity = 2;
	private int y_velocity = 5;
	private int radius;
	private Box2 container;				// box ��ü�� ���������� box �� �����ϱ⶧���� �ε����� 
	
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
													//�żӽ� 
		x_pos = x_pos + time_units * x_velocity;   // box Ŭ����������ɾ˰� box class�ȿ� 
		if(container.inHorizontalContact(x_pos)) {   // 
			x_velocity = -x_velocity;
		}
		y_pos = y_pos + time_units * y_velocity;
		if(container.inVerticalContact(y_pos)) {
			y_velocity = -y_velocity;
		}
	}
	// ��� ��� ��� repaint() ��ӱ׸���׸���׸��� 
}
