package NewThrobBall;

public class ThrobbingBall {
	private boolean is_Large ;
	
	public ThrobbingBall() {
		is_Large = true;
	}
	
	public boolean isLarge() {
		return is_Large;
	}
	
	public void throb() {
		is_Large = !is_Large;
	}
}
