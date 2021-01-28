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
		String s = getText();				// ��ư�����ִ� ���ڸ� �о String ������ s �� �����ص�
		if(!s.equals("")) {
			boolean ok = puzzle.move(new Integer(s).intValue());			// ��ĭ�̾ƴϰ� ����ڰ��������� ��μ� �̵�
			if(ok) {	
				view.update();
			}
		}
		
	}

}
