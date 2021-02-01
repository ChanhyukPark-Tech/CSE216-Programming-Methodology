package ChessApp;

import java.awt.*;
import javax.swing.*;

public class ChessApp extends JPanel {
	
	private int size ;
	private int number_of_line;
	int initial_offset ;
	int length;
	private Color c = Color.yellow;
	
	public ChessApp(int panel_size , int number_of_line) {
		this.number_of_line = number_of_line;
		size = panel_size ;
		length = panel_size / (number_of_line + 2);
		initial_offset = length;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setSize(size , size);
//		f.pack();
		
		f.setTitle("Chess Board");
		f.setVisible(true);	
	}
	
	public void paintComponent(Graphics g) {
		
		g.setColor(c);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.red);
		g.fillRect(initial_offset, initial_offset, size - 2*initial_offset, size - 2*initial_offset);
		
		
//		for(int i=0 ; i < 8 ; i++) {
//			for(int j=0; j< 8 ; j ++ ) {
//				g.setColor(Color.red);
//				g.fillRect(initial_offset + red_size * i, initial_offset + red_size *j, 50, 50);
//			}
//		}
		
		for(int i=0 ; i < number_of_line/2 ; i++) {
			for(int j=0; j< number_of_line/2 ; j ++ ) {
				g.setColor(Color.white);
				g.fillRect(initial_offset + length * (2*i), initial_offset*2 + length *(2*j), length, length);
				g.fillRect(initial_offset*2 + length * (2*i), initial_offset + length *(2*j), length, length);
			}
		}
		
			
	}
	
//	public void paint_redPiece(Graphics g , int red_size ) {
//		int initial_offset = 50 ;
//		int number_of_red = (size / red_size - 2 ) /2 ;
//		for(int i=0; i < number_of_red; i++) {
//		g.setColor(Color.red);
//			g.fillRect(initial_offset * red_size, 50, red_size, red_size);
//			
			

		}
	


