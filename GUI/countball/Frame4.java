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
		
		cp.setLayout(new BorderLayout()); 					//Container �� borderlayout ���� �ϰڽ��ϴ�. �����̳ʴ� ���۳�Ʈ�� ���� �� ���� �� �ִ� ���۳�Ʈ
															// �г��� flowlayout���� container �� boarderlayout���� ������
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		
		lab = new JLabel("count = " + count.countOf());
		p1.add(lab);										// ���ʿ� ��ġ�� p1 �� label �����մϴ�
		
		p2.add(new CountButton("Count ",count ,this));	 			//CountButton(string label, Counter m , Frame4 v) 
		p2.add(new ExitButton());
		
		
		cp.add(p1,BorderLayout.NORTH);
		cp.add(drawing); 										// ������ ? cp.add(JPanel);
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
