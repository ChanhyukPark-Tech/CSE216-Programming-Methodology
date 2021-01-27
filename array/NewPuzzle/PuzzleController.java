package NewPuzzle;

import javax.swing.JOptionPane;

public class PuzzleController {
	private SlidePuzzleBoard board;
	private PuzzleWriter writer;
	
	public PuzzleController(SlidePuzzleBoard b , PuzzleWriter w ) {
		board = b;
		writer = w;
	}
	
	public void play()
	  { while ( true )
	          { writer.displayPuzzle();
	            int i = new Integer
	                     (JOptionPane.showInputDialog("Your move:")).intValue();
	            boolean good_outcome = board.move(i);
	            if ( !good_outcome )
	                 { writer.printError("Bad move--puzzle remains the same."); }
	          }
	  }
}
