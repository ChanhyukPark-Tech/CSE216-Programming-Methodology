package NewPuzzle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleWriter extends JPanel{
	private SlidePuzzleBoard board; // the board that is displayed  SlidePuzzleBoard 객체
	private int size; 				// the board's size
	private int piece_size = 60; 	// 퍼즐 한 조각의 사이즈
	private int panel_width;  		// 도화지의 폭
	private int panel_height;		// 도화지의 높이
	
	/** Constructor PuzzleWriter builds the graphics window.
	    * @param b - the slide puzzle that is displayed
	    * @param s - the size of the slide puzzle, e.g., 4 means  4 x 4  */
	public PuzzleWriter(SlidePuzzleBoard b , int s) {
	
		board = b ;
		size = s ;
		
		panel_width = piece_size * size + 100;
		panel_height = piece_size * size + 100;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setSize(panel_width,panel_height);
		f.setTitle("Slide Puzzle game! ");
		f.setVisible(true);
		
	}
	
	public void paintPiece(Graphics g , PuzzlePiece p ,int i ,int j) { //일단 조각부터 그리고 paintCompontent 에서 이걸 호출하자!!
																	   // 조각을 그릴땐 퍼즐조각 , i j 는 
																	   // 퍼즐하나의 네모의 좌상단 좌표
		int initial_offset = piece_size;                               // 처음 0,0 놈이 시작되는 위치 offset으로띄어줌
		int x_pos = initial_offset + piece_size*i;
		int y_pos = initial_offset + piece_size*j;
		
		if(p != null) {												// 일반적인 puzzle 일 경우에
			g.setColor(Color.white);  								// 퍼즐한조각의 배경색
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
			g.setColor(Color.black);								// 퍼즐한조각의 테두리
			g.drawRect(x_pos, y_pos, piece_size, piece_size);
			g.drawString(p.getValue() + "", x_pos + 10, y_pos + 10);	//getValue 는 return int 이므로 use Skill
		
		} else {													//this is empty puzzle piece paint
			g.setColor(Color.black);
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
		}
		
	}
	
	public void paintComponent(Graphics g) {						//퍼즐 한 조각에대해서는 paintpiece 에서 기술
																	// 여기서는 전체적인 배경그림느낌 + paintpiece 호출
		g.setColor(Color.yellow);
		g.fillRect(0, 0, panel_width, panel_height);
		PuzzlePiece[][] r = board.contents();      	// 이 작업 애매모호 ??????????????????????????
		//지금 board 는 SlidePuzzleBoard board; <<로 선언 거기서 contents 쓰면 return board 
//		PuzzlePiece[][] r = new PuzzlePiece[][]		//Puzzleboard 의 2 차원 퍼즐피스값을받아서 그림을그려준다
		for(int i=0; i < size; i++) {
			for (int j=0; j< size ; j++) {
				paintPiece(g, r[i][j] , i ,j );
				
			}
		}	
	}
	
	public void displayPuzzle() {
		this.repaint();
	}
	
	public void printError(String s) {
		JOptionPane.showMessageDialog(null, "PuzzleWriter error "  + s);
	}
}


































