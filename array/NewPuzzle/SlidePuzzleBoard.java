package NewPuzzle;

public class SlidePuzzleBoard {
	private int size; // the board's size
	private PuzzlePiece[][] board; // the array that holds the pieces 퍼즐 piece 가 array of array 로 board 를나타냄
	
	// one position on the board must be an empty space:
	
	private int empty_row;
	private int empty_col;
	
	// representation invatiant -- > board[empty_row][empty_col] == null;
	
	
	// Constructor SlidePuzzleBoard constructs the initial puzzle, which has

	public SlidePuzzleBoard(int s ) {
		size = s;
		board = new PuzzlePiece[s][s];
		 // create the individual pieces and place on the board in reverse order:
		
		for(int i=0; i<s; i++) {
			for(int j=0; j<s; j++) {
				board[i][j] = new PuzzlePiece(i*s+j);
			}
		}
		
		empty_row = 0;
		empty_col = 0;
		board[empty_row][empty_col] = null;
	}
	
	public PuzzlePiece[][] contents(){
		return board;
	}
	
//	 public PuzzlePiece[][] contents()					// board 에 박혀있는걸 answer 한테알ㄹ려줌
//	  { PuzzlePiece[][] answer = new PuzzlePiece[size][size];
//	    for ( int i = 0;  i <  size;  i = i + 1 )
//	        { for ( int j = 0;  j < size;  j = j + 1 )
//	              { answer[i][j] = board[i][j]; }
//	        }
//	    return answer;
//	  }
	 
	public boolean move(int w) {
		int row = 0; // w를 값으로 갖는 피스의 행
		int col = 0; // w를 값으로 갖는 피스의 열
		
		for(int i=0 ; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j] != null && board[i][j].getValue() == w  ) {
					row = i;
					col = j;
				}
			}
		}
		// 지금 있는 row 랑 col 을 empty 로바꿔야한다 . 그다음 기존 empty 자리에 지금있는 w (표시되는값 ) 값을넣어줘야한다
		if(Math.abs(empty_row - row) + Math.abs(empty_col - col) == 1) { 		// 인접해 있다면 
			board[empty_row][empty_col] = board[row][col];
			board[row][col] = null;
			empty_row = row; empty_col = col;
			return true;
		} else {
			return false;
		}
	}
}
