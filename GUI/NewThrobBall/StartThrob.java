package NewThrobBall;

public class StartThrob {
	
	public static void main(String[] args) {
		
	
	int frame_size = 180;
	int pause_time = 200;
	ThrobbingBall b = new ThrobbingBall();
	ThrobPanel p = new ThrobPanel(b,frame_size);
	ThrobFrame f = new ThrobFrame(frame_size , p , new ColorButton(p));
	ThrobController ct= new ThrobController(b,p,pause_time);
	ct.run();
	}
	
}
