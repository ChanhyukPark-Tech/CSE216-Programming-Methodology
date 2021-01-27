package GUI;

public class ThrobbingBall {
	boolean is_it_currently_large;
	
	public ThrobbingBall(){
		is_it_currently_large = true;
	}
	
	public boolean isLarge() {
		return is_it_currently_large;
	}
	
	public void throb() {
		is_it_currently_large = !is_it_currently_large;
	}
}

