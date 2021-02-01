package Puzzle;

public class SlidePuzzleBoard {

		PuzzlePiece[][] puzzle;
		int row ;
		int col ;
		int empty_row = 0 ; 
		int empty_col = 0 ; 
		int size ;
		
		
		public SlidePuzzleBoard(int size) {
			this.size = size; 
			
			for(int i = 0; i < size ; i++) {
				for(int j =0 ; j < size ; j++) {
					puzzle = new PuzzlePiece[size][size];
					puzzle[i][j] = new PuzzlePiece(i * size + j );
				
					puzzle[empty_row][empty_col] = null;
				}
			}
			
			
		}
		
		public PuzzlePiece[][] contents(){
			return puzzle;
		}
		
		public boolean move(int w ) {
			int row = 0 ; int col = 0;
			for(int i = 0; i < size ; i++) {
				for(int j =0 ; j < size ; j++) {
					if(puzzle[i][j] != null && puzzle[i][j].getValue() == w) {
						row = i ; col = j;	
				}
				}
				
			
			if(Math.abs(row - empty_row) + Math.abs(col - empty_col) == 1) {
				puzzle[empty_row][empty_col] = puzzle[row][col];
				puzzle[row][col] = null;
				empty_row = row; 
				empty_col = col;
				return true; 
				
			}
		}
			return false;	
}
}
