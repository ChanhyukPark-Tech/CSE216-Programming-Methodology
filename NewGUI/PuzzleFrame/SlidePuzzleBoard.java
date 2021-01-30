package PuzzleFrame;

public class SlidePuzzleBoard {
	PuzzlePiece[][] puzzle;
	int size;
	int empty_row;
	int empty_col;
	int row;
	int col;
	// -----------------------------------------------------
	
	
	public SlidePuzzleBoard(int size) {
		this.size = size; 
		puzzle = new PuzzlePiece[size][size];
		
		for(int i=0 ; i < size ; i ++) {
			for(int j=0 ; j < size ; j++) {
				puzzle[i][j] = new PuzzlePiece(i*size + j);
			}
		}
		
		puzzle[empty_row][empty_col] = null;	
	}
	
	
	// ---------------------------------------------------------------------------
	
	
	
	public PuzzlePiece[][] contents(){
		return puzzle;
	}
	
	public boolean move(int w) {
		for(int i=0 ; i < size ; i ++) {
			for(int j=0 ; j < size ; j++) {
				if(puzzle[i][j] != null && puzzle[i][j].valueOf() == w) {
					row = i;
					col = j;
					
				}
			}
		
	}
		if(Math.abs(empty_row - row) + Math.abs(empty_col - col ) == 1 ) {
			
			puzzle[empty_row][empty_col] = puzzle[row][col];
			puzzle[row][col] = null;
			empty_row = row ; 
			empty_col = col ;
			return true ;
		} else {
			return false ;
		}
		
}
}
