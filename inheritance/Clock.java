import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock {

	public static void main(String[] args) {
		my_Panel iwanttodraw = new my_Panel();
		while(true) {
			
			iwanttodraw.repaint();
		}
		
		
	}

}

class my_Panel extends JPanel{
	int width = 100;

	public my_Panel() {
		
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setVisible(true);
		f.setTitle("clock");
		f.setSize(width, width);
	}
	
	public void paintComponent(Graphics g) {
		int width = 200;
		int gap = 50;
		int d = 100;
		
		g.setColor(Color.white);
		g.drawRect(0, 0, width, width);
		g.setColor(Color.black);
		g.fillRect(0, 0, width, width);
		g.setColor(Color.white);
		
		g.drawOval(gap,gap,d,d);
		
		GregorianCalendar c = new GregorianCalendar();
		
		int s_angle = 90 - c.get(Calendar.SECOND) * 6;
		int m_angle = 90 - c.get(Calendar.MINUTE) * 6;
		int h_angle = 90 - c.get(Calendar.HOUR) * 30;
		
		 g.setColor(Color.blue);         // 시침, 분침, 초침 그리기
		  g.fillArc(gap+25, gap+25, d-50, d-50, h_angle, 8);
		  g.setColor(Color.red);
		  g.fillArc(gap+ 5, gap+ 5, d-10, d-10, m_angle, 5);
		  g.setColor(Color.white);
		  g.fillArc(gap+10, gap+10, d-20, d-20, s_angle, -3); 
		
	}
}