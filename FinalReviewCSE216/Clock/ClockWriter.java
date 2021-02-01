package Clock;

import java.awt.Color;
import java.awt.Graphics;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClockWriter extends JPanel {
	
	public ClockWriter() {
		int width = 200 ;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Clock");
		f.setSize(width, width);
		
		f.setVisible(true);
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		GregorianCalendar calandar = new GregorianCalendar();
		
		
		int s_angle = 90 - (calandar.get(calandar.SECOND) * 6 );
		int m_angle = 90 - (calandar.get(calandar.MINUTE) * 6 );
		int h_angle = 90 - (calandar.get(calandar.HOUR) * 30 );
		
		int width = 200 ;
		int gap = 50 ;
		int d = 100 ;
		g.setColor(Color.black);
		g.drawRect(0, 0, width, width);
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		g.setColor(Color.black);
		
		g.drawOval(gap,gap,d,d);
		
		 g.setColor(Color.blue);        
		  g.fillArc(gap+25, gap+25, d-50, d-50, h_angle, 8);
		  g.setColor(Color.red);
		  g.fillArc(gap+ 5, gap+ 5, d-10, d-10, m_angle, 5);
		  g.setColor(Color.orange);
		  g.fillArc(gap+10, gap+10, d-20, d-20, s_angle, -3); 
	}
	
	public static void main(String[] args ) {
		ClockWriter clock = new ClockWriter();
		
		while(true) {
			clock.repaint();
		}
	}

}
