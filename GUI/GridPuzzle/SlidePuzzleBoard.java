package GridPuzzle;

public class SlidePuzzleBoard {
	private PuzzlePiece[][] board;
	int size;
	int empty_row;
	int empty_col;
	int row;
	int col;
	
	public SlidePuzzleBoard(int size) {
		this.size = size;
		board = new PuzzlePiece[size][size];
		
		for(int i=0 ; i <size ; i++) {
			for(int j=0;j<size ; j++) {
				board[i][j] = new PuzzlePiece(i*size  + j);
			}
		}
		empty_row = 0;
		empty_col = 0;
		
		board[empty_row][empty_col] = null;
	}
	
	public PuzzlePiece[][] contents(){
		return board;
	}
	
	public boolean move(int w) {
		
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size ; j++) {
				
				if(board[i][j] != null && board[i][j].getValue() == w) {
					row = i;
					col = j;
					
				} 
			}
		}
		if(Math.abs(empty_row-row) + Math.abs(empty_col-col) == 1) {
			board[empty_row][empty_col] = board[row][col];
			board[row][col] = null;
			empty_row = row; empty_col = col;
			return true;
		}
		else {
			return false;
		}
	}
}
