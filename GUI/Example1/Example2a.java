package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Frame2a extends JFrame implements ActionListener { // JFrame 객체를 상속받아서 Frame2a는 window 로서 기능을 한다. 그 동시에 Actionlistner interface를 구현
	private Counter count;								 //
	JLabel label = new JLabel(" count = 0 ");
	
	public Frame2a(Counter c) {
		count  = c;
		Container cp = getContentPane();		// 속지를 꺼내온다 Frame2a는 getContentPane() method 를 갖고있다 이것을 실행시켜 Container type variable 에 저장
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
