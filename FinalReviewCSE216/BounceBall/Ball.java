package BounceBall;

public class Ball {
	private int x_pos;
	private int y_pos;
	private int radius;
	private int x_velocity = 2;  // 0.00000000000000000000000001  20000
	private int y_velocity = 5;			// 변수로 받아도되는지
	
	public Box box;  
	
	public Ball(Box b , int x_pos , int y_pos , int radius) {
		
		box = b;
		this.x_pos = x_pos;
		this.y_pos = y_pos;
		this.radius = radius;
	}
	
//	public void change_position(int time_units) {
//		x_pos = x_pos + x_velocity*time_units;
//		y_pos = y_pos + y_velocity*time_units;
//	}
//	
//	public void x_change_velocity() {
//		if(box.x_is_it_collision(x_pos)) {
//			x_velocity = -(x_velocity + 100);
//		}
//	}
//	
//	public void y_change_velocity() {
//		if(box.y_is_it_collision(y_pos)) {
//			y_velocity = -(y_velocity+100);
//		}
//	}
	
	public void move(int time_units) {
		x_pos = x_pos + x_velocity * time_units;
		if(box.x_is_it_collision(x_pos))
		x_velocity = -x_velocity;
		
		y_pos = y_pos + y_velocity * time_units;
		if(box.y_is_it_collision(y_pos))
		y_velocity = -y_velocity;
	}
	
	
	
	public int getXpos() {
		return x_pos;
	}

	public int getYpos() {
		return y_pos;
	}
	
	public int getRadius() {
		return radius;
		
	}
}
