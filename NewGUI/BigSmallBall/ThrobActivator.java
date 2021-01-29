package BigSmallBall;

public class ThrobActivator {
	public static int panel_size = 500;

	public static void main(String[] args) {
		
		ThrobBall ball = new ThrobBall();
		ThrobPanel view = new ThrobPanel(panel_size , ball );
		ColorButton button = new ColorButton(view , "my_button");
		ThrobFrame f = new ThrobFrame(panel_size , view , button);
		ThrobController control = new ThrobController(view , ball , 500);
		
		control.run();
		
		
		
	}

}
