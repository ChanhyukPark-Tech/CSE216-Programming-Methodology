package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Frame2a extends JFrame implements ActionListener { // JFrame ��ü�� ��ӹ޾Ƽ� Frame2a�� window �μ� ����� �Ѵ�. �� ���ÿ� Actionlistner interface�� ����
	private Counter count;								 //
	JLabel label = new JLabel(" count = 0 ");
	
	public Frame2a(Counter c) {
		count  = c;
		Container cp = getContentPane();		// ������ �����´� Frame2a�� getContentPane() method �� �����ִ� �̰��� ������� Container type variable �� ����
		cp.setLayout(new FlowLayout());
		JButton button = new JButton("OK");
		cp.add(label); cp.add(button);			// label & button add to container
		button.addActionListener(this);
		setSize(200,200	);
		setTitle("Frame2a"); 
		setVisible(true);		
		
	}
	
	public void actionPerformed(ActionEvent e ) {
		count.increment();
		label.setText("count = " + count.countOf());
	}
}

public class Example2a {
	public static void main(String[] args) {
		Counter model = new Counter(0);
		Frame2a f2 = new Frame2a(model);
		
	}
}
