package GUI;

import java.awt.*;
import javax.swing.*;


public class Frame4 extends JFrame{
	private Counter count;
	private JLabel lab = new JLabel("count = 0");
	private JPanel drawing;
	
	public Frame4(Counter c , JPanel panel) {
		count = c ; drawing = panel;
		Container cp = getContentPane();
		
		cp.setLayout(new BorderLayout()); 					//Container 는 borderlayout 으로 하겠습니다. 컨테이너는 컴퍼넌트를 여러 개 담을 수 있는 컴퍼넌트
															// 패널은 flowlayout으로 container 는 boarderlayout으로 설정중
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		
		lab = new JLabel("count = " + count.countOf());
		p1.add(lab);										// 위쪽에 위치할 p1 에 label 부착합니다
		
		p2.add(new CountButton("Count ",count ,this));	 			//CountButton(string label, Counter m , Frame4 v) 
		p2.add(new ExitButton());
		
		
		cp.add(p1,BorderLayout.NORTH);
		cp.add(drawing); 										// 순서는 ? cp.add(JPanel);
		cp.add(p2,BorderLayout.SOUTH);
		setTitle("Example4");
		setSize(200,150);
		setVisible(true);

		
	}
	
	public void update() {
		lab.setText("count = "  + count.countOf() );
		drawing.repaint();
	}
	
}
