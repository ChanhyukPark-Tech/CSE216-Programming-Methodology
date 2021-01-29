package BigSmallBall;

public class ThrobController {
	private ThrobPanel writer;
	private ThrobBall ball;
	private int time;
	
	public ThrobController(ThrobPanel w , ThrobBall b , int time ) {
		writer = w;
		ball = b;
		this.time = time;
	}
	
	public void run() {
//		boolean processing = true;
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
