package NewEditor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReplaceFrame extends JFrame implements ActionListener {
	private EditModel model;
	private JButton replace = new JButton("Replace");
	private JButton clear = new JButton("Clear");
	private JButton close = new JButton("Close");
	private JTextField find_text = new JTextField("",20);
	private JTextField replace_text = new JTextField("", 20);
	public ReplaceFrame(EditModel model) {
		this.model = model;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		JPanel p = new JPanel(new GridLayout(2,1));
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("From caret . replace"));
		p1.add(find_text);
		
		p.add(p1);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("by "));
		p2.add(replace_text);
		
		p.add(p2);
		
		cp.add(p,BorderLayout.CENTER);
		JPanel p3 = new JPanel(new FlowLayout());
		p3.add(replace); p3.add(clear); p3.add(close);
		
		cp.add(p3 , BorderLayout.SOUTH);
		
		
		replace.addActionListener(this);
		clear.addActionListener(this);
		close.addActionListener(this);
		
		setTitle("Frame");
		pack();
		setVisible(false);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		int index = 0;
		
		if(e.getSource() == replace) {
			index = 0 ; 
		} else if(e.getSource() == clear) {
			index = 1 ;
		} else if(e.getSource() == close) {
			index = 2; 
		}
		
		switch(index) {
		
		case 0: 
			String find = find_text.getText();
			int location = model.findFromCaret(find);
			if(location == -1) {
				JOptionPane.showMessageDialog(this, "String" + find + "not found. ");
			}
			
				else {
					model.replaceRange(replace_text.getText(), location, location + find.length());
				}
			break;
			
		case 1: {
			find_text.setText("");
			replace_text.setText("");
			break;
		}
		
		case 2: {
			System.exit(0);
		}
			
		
			}
		}
		
	}
	
