package PuzzleFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PuzzleButton extends JButton implements ActionListener {

	private SlidePuzzleBoard puzzleSet; 
	private PuzzleFrame view; 
	
	public PuzzleButton(SlidePuzzleBoard puzzleSet , PuzzleFrame view) {
		super("");
		this.puzzleSet = puzzleSet;
		this.view = view;
		addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = getText(); // 	String javax.swing.AbstractButton.getText()
		if(!s.equals(" ")) {   // this equals 필요하냐 ? 
			boolean ok = puzzleSet.move(new Integer(s).intValue());
			if(ok) {
				view.update();
				
		}
		}
	}

}
