package PuzzleFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class PuzzleFrame extends JFrame{
	
	private SlidePuzzleBoard board; // the model; 
	private int size;
	private int button_size = 60;  // this is pixel
	private PuzzleButton[][] button;  // the buttons on the face of the view
	
	public PuzzleFrame(int board_size , SlidePuzzleBoard board) {
		this.size = board_size; 
		this.board = board;
		
		button = new PuzzleButton[size][size];
		
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(size , size));
		
		for(int i=0; i < size ; i++) {
			for (int j=0 ; j<size ; j ++ ) {
				button[i][j] = new PuzzleButton(board , this);
				cp.add(button[i][j]);							// skill puzzlebutton 2차원배열에 하나하나씩값채우고 그걸 cp에
																// 하나하나씩 밖아넣는다 
			}
		}
		
		update();
		addWindowListener(new ExitController());
		setTitle("PuzzleFrame");
		setSize(size * button_size + 10,  size * button_size + 20);
		setVisible(true);
		
		}
	
	public void update() {
		PuzzlePiece[][] r = board.contents();
		for(int i=0; i < size ; i++) {
			for (int j=0 ; j<size ; j ++ ) {
				if(r[i][j] == null) {
					button[i][j].setBackground(Color.black);
					button[i][j].setText(" ");
				} else {
					button[i][j].setBackground(Color.white);
					button[i][j].setText(r[i][j].valueOf() + "");
				}
			}
		
	}
	
	
	
	

}

}