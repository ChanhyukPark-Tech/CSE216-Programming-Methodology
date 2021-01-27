package NewPuzzle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleWriter extends JPanel{
	private SlidePuzzleBoard board; // the board that is displayed  SlidePuzzleBoard ��ü
	private int size; 				// the board's size
	private int piece_size = 60; 	// ���� �� ������ ������
	private int panel_width;  		// ��ȭ���� ��
	private int panel_height;		// ��ȭ���� ����
	
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
	
	public void paintPiece(Graphics g , PuzzlePiece p ,int i ,int j) { //�ϴ� �������� �׸��� paintCompontent ���� �̰� ȣ������!!
																	   // ������ �׸��� �������� , i j �� 
																	   // �����ϳ��� �׸��� �»�� ��ǥ
		int initial_offset = piece_size;                               // ó�� 0,0 ���� ���۵Ǵ� ��ġ offset���ζ����
		int x_pos = initial_offset + piece_size*i;
		int y_pos = initial_offset + piece_size*j;
		
		if(p != null) {												// �Ϲ����� puzzle �� ��쿡
			g.setColor(Color.white);  								// ������������ ����
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
			g.setColor(Color.black);								// ������������ �׵θ�
			g.drawRect(x_pos, y_pos, piece_size, piece_size);
			g.drawString(p.getValue() + "", x_pos + 10, y_pos + 10);	//getValue �� return int �̹Ƿ� use Skill
		
		} else {													//this is empty puzzle piece paint
			g.setColor(Color.black);
			g.fillRect(x_pos, y_pos, piece_size, piece_size);
		}
		
	}
	
	public void paintComponent(Graphics g) {						//���� �� ���������ؼ��� paintpiece ���� ���
																	// ���⼭�� ��ü���� ���׸����� + paintpiece ȣ��
		g.setColor(Color.yellow);
		g.fillRect(0, 0, panel_width, panel_height);
		PuzzlePiece[][] r = board.contents();      	// �� �۾� �ָŸ�ȣ ??????????????????????????
		//���� board �� SlidePuzzleBoard board; <<�� ���� �ű⼭ contents ���� return board 
//		PuzzlePiece[][] r = new PuzzlePiece[][]		//Puzzleboard �� 2 ���� �����ǽ������޾Ƽ� �׸����׷��ش�
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


































