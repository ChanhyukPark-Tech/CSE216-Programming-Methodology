package ClickPaintBall;

import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame {
	
	private Counter count;
	private JLabel label = new JLabel("Count = 0");
	private Drawing draw;
	
	
	public Frame(Counter count , Drawing draw) {
		this.count = count;
		this.draw = draw;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		p1.add(label);
		
		p2.add(new CountButton("Count" , count , this));
		p2.add(new ExitButton("Exit"));
		
		cp.add(p1 , BorderLayout.NORTH);
		cp.add(draw);
		cp.add(p2 ,BorderLayout.SOUTH);
		
		setTitle("make ball ");
		setSize(500,500);
		setVisible(true);
		
		
	}
	
	public void update() {
		label.setText("Count = " + count.countOf()); 
		draw.repaint();
	}
}
