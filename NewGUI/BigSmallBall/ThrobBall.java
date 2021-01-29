package BigSmallBall;

public class ThrobBall {
	boolean is_Large;
	
	public ThrobBall() {
		is_Large = true;
	}
	
	public boolean islarge() {
		return is_Large;
	}
	
	public void throb() {
		is_Large = !is_Large;
	}
}

