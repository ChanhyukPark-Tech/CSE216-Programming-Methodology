package GridPuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PuzzleButton extends JButton implements ActionListener{
	private SlidePuzzleBoard puzzle;
	private PuzzleFrame view;
	
	public PuzzleButton(SlidePuzzleBoard p , PuzzleFrame f) {
		puzzle = p;
		view = f;
		addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = getText();				// 버튼에써있는 숫자를 읽어서 String 변수인 s 에 저장해둠
		if(!s.equals("")) {
			boolean ok = puzzle.move(new Integer(s).intValue());			// 빈칸이아니고 어떤숫자가써있으면 비로소 이동
			if(ok) {	
				view.update();
			}
		}
		
	}

}
