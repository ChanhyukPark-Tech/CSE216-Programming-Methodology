package NewGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SimpleCountincrement extends JFrame implements ActionListener {
	
	public Counter count;
	public JLabel text;
	public SimpleCountincrement(Counter count) {
		this.count = count;
		JButton ok = new JButton("OK");
		text = new JLabel("count = " + count);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(text); cp.add(ok); 
		ok.addActionListener(this);
		setTitle("Frame");
		setSize(200,200);
		
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		count.increment();
		text.setText("count = " + count);
	}

	
		
	public static void main(String[] args) {
		Counter c = new Counter(0);
		new SimpleCountincrement(c);
	}

}
