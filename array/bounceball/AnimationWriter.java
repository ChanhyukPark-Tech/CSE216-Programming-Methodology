import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationWriter extends JPanel {
	private BoxWriter box_writer; // the output-view of the box
	private BallWriter ball_writer; // the output-view of the ball in the box
	
	public AnimationWriter(BoxWriter b, BallWriter l, int size) {
		box_writer = b;
		ball_writer = l;
		JFrame my_frame = new JFrame();
		my_frame.getContentPane().add(this);
		my_frame.setTitle("Bounce");
		my_frame.setSize(size,size);
		my_frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		box_writer.paint(g);
		ball_writer.paint(g);
	}
}
