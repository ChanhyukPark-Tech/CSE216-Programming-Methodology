package BounceBall;

public class Box {
	int box_size ;
	Ball ball ; 
	
	
	
	
	public Box(int size) {
		box_size = size ;
	}
	
	public int getBox_size() {
		return box_size; 
	}
	
	public boolean x_is_it_collision(int x_pos) {
		boolean x_collision = false; 
		if(x_pos <= 0 || x_pos >= box_size) {
			x_collision =true;
			return x_collision;
		}else {
			return x_collision;
		}
	}
	
	public boolean y_is_it_collision(int y_pos) {
		boolean y_collision = false; 
		if(y_pos <= 0 || y_pos >= box_size) {
			y_collision =true;
			return y_collision;
		}else {
			return y_collision;
		}
	}
	
	public int sizeOf() {
		return box_size;
	}
	

}
