package GUI;

public class StartThrob {

	public static void main(String[] args) {
		int frame_size = 180;
		int pause_size = 200;
		
		ThrobbingBall b  = new ThrobbingBall();
		ThrobPanel p = new ThrobPanel(frame_size , b);
		ColorButton c = new ColorButton(p);
		ThrobFrame f = new ThrobFrame(frame_size,p,c);
		ThrobController controller = new ThrobController(p,b,pause_size);
		
		controller.run();
		
	}

}
