package BounceBall;

import java.awt.Color;

public class BounceBall {

	public static void main(String[] args) {
		
		int size = 500; 
		Box box = new Box(size );
		Ball ball = new Ball(box , 250 , 250 , 20);
		BallWriter ballwriter = new BallWriter(ball, Color.red);
		BoxWriter boxwriter = new BoxWriter(box);
		AnimationWriter writer = new AnimationWriter(ballwriter , boxwriter);
		
		
		while(true) {
			int painting_delay = 20;
			delay(painting_delay);
			ball.move(1);
			System.out.println(ball.getXpos() + " " + ball.getYpos());
			writer.repaint();
		}
	}
	
	private static void delay(int how_long)
	  { try { Thread.sleep(how_long); }
	    catch (InterruptedException e) { }
	  }
	}

