import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClockWriter extends JPanel {
	
	int width = 200;
	GregorianCalendar time = new GregorianCalendar();
	public ClockWriter() {
		JFrame f = new JFrame();  	// Frame »ý¼º
		f.getContentPane().add(this);
		f.setTitle("Clock");
		f.setSize(width, width);
		f.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		int width = 200;
		int gap = 50;
		int d = 100;
		// GregorianCalander time = new GregorianCalendar();
		
		int s_angle = 90 - (time.get(Calendar.SECOND) * 6);
		int m_angle = 90 - (time.get(Calendar.MINUTE) * 6);
		int h_angle = 90 - (time.get(Calendar.HOUR) * 30);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		g.setColor(Color.black);
		g.drawOval(gap, gap, d, d);
		g.setColor(Color.blue);
		g.fillArc(gap+25, gap+25, d-50, d-50, h_angle, 8);
		g.setColor(Color.red);
		g.fillArc(gap+5, gap+5, d-10, d-10, m_angle, 5);
		g.setColor(Color.black);
		g.fillArc(gap+10, gap+10, d-20, d-20, s_angle, -3);
	}
	
	public static void main(String[] args) {
		ClockWriter writer = new ClockWriter();
		while(true) {	
//			delay(10);
			writer.repaint();
		}
	}
	
//	public static void delay(int how_long) {
//		try {
//			Thread.sleep(how_long);
//		}	catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}

}
