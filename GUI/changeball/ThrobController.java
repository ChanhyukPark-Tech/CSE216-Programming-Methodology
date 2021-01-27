package GUI;

public class ThrobController {
	ThrobPanel writer;
	ThrobbingBall ball; 
	int time;
	
	
	public ThrobController(ThrobPanel w , ThrobbingBall b, int delay_time) {
		writer = w;
		ball = b;
		time = delay_time;
		
	}	
	
	public void run() {
		while(true) {
			ball.throb();
			writer.repaint();
			delay();
			
		}
		
	}

	public void delay() {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
