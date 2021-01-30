package NewScrollingList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class ListButton extends JButton implements ActionListener {
	private ListFrame view ;
	private Counter[] model ;
	
	
	public ListButton(String label , Counter[] model , ListFrame view) {
		super(label);
		this.view = view; 
		this.model = model; 
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e ) {
		int index = view.getSelection();
		if(index != -1 ) {
			
			model[index].increment();
			view.update();
		}
	}
}
