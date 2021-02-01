package BounceBall;


public class Controller {
	private Ball ball; // model object
	private AnimationWriter writer; // output-view object
	public Controller(Ball b, AnimationWriter w) {
		ball = b;
		writer = w;
	}
	
	public void runAnimation() {
		int time_unit = 1;
//		int painting_delay = 20;
		while(true) {
			delay();
			ball.move(time_unit);
			System.out.println(ball.getXpos() + ", " + ball.getYpos());
			writer.repaint();
			
		}
	}
	private void delay()
	  { try { Thread.sleep(20); }
	    catch (InterruptedException e) { }
	  }
}


