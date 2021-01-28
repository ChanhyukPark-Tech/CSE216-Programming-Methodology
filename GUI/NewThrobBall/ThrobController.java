package NewThrobBall;

public class ThrobController {
	private ThrobbingBall ball;
	private ThrobPanel view ;
	int delay_time;
	public boolean processing = true;
	
	public ThrobController(ThrobbingBall ball , ThrobPanel view , int delay_time) {
		this.ball = ball;
		this.view = view;
		this.delay_time = delay_time;
		
	}
	
	public void run() {
		
		while(processing) {
			
			ball.throb();
			view.repaint();
			delay();
		}
		
	}
	
	public void delay() {
		try {
			Thread.sleep(delay_time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
