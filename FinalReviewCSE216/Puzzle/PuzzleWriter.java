package Puzzle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PuzzleWriter extends JPanel {

		private int size ;
		private int piece_size = 60;
		private int panel_width;
		private int panel_height;
		
		SlidePuzzleBoard board ;
		
		
		
		
		
		public PuzzleWriter ( SlidePuzzleBoard board , int s) {
			this.board = board;
			this.size = s; 
			
			JFrame f = new JFrame();
			panel_width = piece_size * size +100;
			panel_height = piece_size * size +100;
			
			f.getContentPane().add(this);
			f.setSize(panel_width , panel_height );
			f.setTitle("Slide Puzzle");
			f.setVisible(true);
			
			
		}
		
		public void paintPiece(Graphics g , PuzzlePiece p , int i , int j ) {
			int initial_offset = piece_size;
			int x_pos = initial_offset + (piece_size * j);
			int y_pos = initial_offset + (piece_size * i);
			
			if( p != null ) {
				 g.setColor(Color.white);
		           g.fillRect(x_pos, y_pos, piece_size, piece_size);
		           g.setColor(Color.black);
		           g.drawRect(x_pos, y_pos, piece_size, piece_size);
		           g.drawString(p.getValue() + "", x_pos + 10, y_pos + 20);
			} else {
				g.setColor(Color.black);
				g.fillRect(x_pos, y_pos, piece_size, piece_size);
				
			}
			
		}
		
		public void paintComponent(Graphics g) {
			g.setColor(Color.yellow);
		    g.fillRect(0, 0, panel_width, panel_height);
		    PuzzlePiece[][] r = board.contents();
		    for ( int i = 0;  i != size;  i= i+1 )
		        { for ( int j = 0;  j != size;  j = j+1 )
		              { paintPiece(g, r[i][j], i, j); }
		        }
		}
		
		public void displayPuzzle() {
			this.repaint();
		}
		
		
}
