package GridPuzzle;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class PuzzleFrame extends JFrame {
	private SlidePuzzleBoard board; //the model 퍼즐 보드! 모델 !
	private int size;				//board_size ! 
	private int button_size = 60 ;  // butotn_size is initialized in here!
	private PuzzleButton[][] button ; 	// 퍼즐버튼을 double array 로 button 이라는 변수 선언
	
	public PuzzleFrame(int board_size , SlidePuzzleBoard b) {
		size = board_size;						// this size is not pixel!
		board = b;
		button = new PuzzleButton[board_size][board_size];
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(size , size));
		// create the button-controllers and insert them into the layout
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				button[i][j] = new PuzzleButton(board , this);  // button 2차원배열 한자리한자리에 puzzlebutton 넣기
				cp.add(button[i][j]);
			}
		}
		update();
		addWindowListener(new ExitController()); // x 버튼을 누르면 종료가됌 
		setTitle("puzzle game! ");
		setSize(size * button_size + 10 , size * button_size +20);
		setVisible(true);
		
		
		
	}
	public void update()
	  { PuzzlePiece[][] r = board.contents();  //  get contents of the puzzle
	    for ( int i = 0; i != size; i = i+1 )  // redraw all the buttons
	        { for ( int j = 0; j != size; j = j+1 )
	              { if ( r[i][j] != null )
	                     { button[i][j].setBackground(Color.white);
	                       button[i][j].setText("" + r[i][j].getValue());}
	                else { button[i][j].setBackground(Color.black); // null 이라면!
	                       button[i][j].setText( "" );
	                       System.out.println(i + ", " + j);
	                     }
	              }
	        }
	
}
}

