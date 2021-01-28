package Edit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ReplaceFrame extends JFrame implements ActionListener {
	private EditModel model;
	private JButton replace = new JButton("replace");
	private JButton clear = new JButton("clear");
	private JButton close = new JButton("close");
	private JTextField find_text = new JTextField("" , 20);
	private JTextField replace_text = new JTextField("" , 20);
	
	public ReplaceFrame(EditModel model) {
		this.model = model;
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(2,1));
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,1));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("you want to find"));
		p1.add(find_text);
	
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("by "));
		p2.add(replace_text);
		
		
		p.add(p1); p.add(p2); cp.add(p);
		
		JPanel button = new JPanel();
		button.setLayout(new FlowLayout());
		button.add(replace);
		button.add(clear);
		button.add(close);
		
		cp.add(button);
		
		replace.addActionListener(this);
		clear.addActionListener(this);
		close.addActionListener(this);
		
		setTitle("Replace Frame");
		pack();
		setVisible(false);
		
		
		
		
//		this.model = model;
//	    Container cp = getContentPane();
//	    cp.setLayout(new BorderLayout());
//	    JPanel p1 = new JPanel(new GridLayout(2, 1));
//	      JPanel p11 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//	        p11.add(new JLabel("From caret, replace "));
//	        p11.add(find_text);
//	      p1.add(p11);
//	      JPanel p12 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//	        p12.add(new JLabel("by "));
//	        p12.add(replace_text);
//	      p1.add(p12);
//	    cp.add(p1, BorderLayout.CENTER);
//	    JPanel p2 = new JPanel(new FlowLayout());
//	      p2.add(replace);
//	      p2.add(clear);
//	      p2.add(close);
//	    cp.add(p2, BorderLayout.SOUTH);
//	    replace.addActionListener(this);
//	    clear.addActionListener(this);
//	    close.addActionListener(this);
//	    setTitle("ReplaceFrame"); 
//	    pack();
//	    setVisible(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		int number = 0; 				// 1 > replace 2 > clear 3 > close
		if(e.getSource() == replace) {
			number = 1;
			System.out.println(number);
		} else if (e.getSource() == clear) {
			number = 2;
			System.out.println(number);
		} else if (e.getSource() == close) {
			number = 3;
			System.out.println(number);
		}
		
		switch(number) {
		case 1 : {
			String find = find_text.getText();
			int index = model.find(find, model.getCaretPosition());
			if(index == -1) {
				JOptionPane.showMessageDialog(this, "not found");
			} else {
				model.replaceRange(replace_text.getText(), index, index + find.length());
			}
			break;
		}
		case 2 : {
			find_text.setText("");
	         replace_text.setText("");
	         break;
			
		}
		case 3 : {
			setVisible(false);
		}
		}
		
//		
//		 if ( e.getSource() == close )         // was it the Close button?
//	       { setVisible(false); }
//	    else if ( e.getSource() == clear )    // the Clear button?
//	       { find_text.setText("");
//	         replace_text.setText("");
//	       }
//	    else if ( e.getSource() == replace )  // the Replace button?
//	       { String find = find_text.getText();
//	         int location = model.findFromCaret(find); 
//	         if ( location == -1 )            // string not found?
//	              { JOptionPane.showMessageDialog(this,
//	                         "String " + find + " not found");
//	              }
//	         else { model.replaceRange(replace_text.getText(),
//	                                   location, location + find.length()); 
//	              }
//	       }
//	  }
		
		
		
		
		
		
		
		
	}	
	}
