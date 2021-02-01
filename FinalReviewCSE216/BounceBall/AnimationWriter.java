package BounceBall;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationWriter extends JPanel {
	
	private BallWriter ballwriter ;
	private BoxWriter boxwriter;
	
	public AnimationWriter(BallWriter ball , BoxWriter box)
	{
//		ballwriter = ball;
//		boxwriter = box ;
//		JFrame f = new JFrame();
//		
//		f.repaint();
//		
//		f.getContentPane().add(this);
//		f.setTitle("Æ¨±â´Â °ø");
//		f.setSize(500,500);
//		f.setVisible(true);
		
		ballwriter  = ball;
		boxwriter = box;
		JFrame my_frame = new JFrame();
		my_frame.getContentPane().add(this);
		my_frame.setTitle("Bounce");
		my_frame.setSize(500,500);
		my_frame.setVisible(true);
//		
	}
	
	public void paintComponent(Graphics g) {
		ballwriter.paint(g);
		boxwriter.paint(g);
		
		
	}

}

	
