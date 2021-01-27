package NewPuzzle;

public class SlidePuzzleBoard {
	private int size; // the board's size
	private PuzzlePiece[][] board; // the array that holds the pieces ���� piece �� array of array �� board ����Ÿ��
	
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
	
//	 public PuzzlePiece[][] contents()					// board �� �����ִ°� answer ���׾ˤ�����
//	  { PuzzlePiece[][] answer = new PuzzlePiece[size][size];
//	    for ( int i = 0;  i <  size;  i = i + 1 )
//	        { for ( int j = 0;  j < size;  j = j + 1 )
//	              { answer[i][j] = board[i][j]; }
//	        }
//	    return answer;
//	  }
	 
	public boolean move(int w) {
		int row = 0; // w�� ������ ���� �ǽ��� ��
		int col = 0; // w�� ������ ���� �ǽ��� ��
		
		for(int i=0 ; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(board[i][j] != null && board[i][j].getValue() == w  ) {
					row = i;
					col = j;
				}
			}
		}
		// ���� �ִ� row �� col �� empty �ιٲ���Ѵ� . �״��� ���� empty �ڸ��� �����ִ� w (ǥ�õǴ°� ) �����־�����Ѵ�
		if(Math.abs(empty_row - row) + Math.abs(empty_col - col) == 1) { 		// ������ �ִٸ� 
			board[empty_row][empty_col] = board[row][col];
			board[row][col] = null;
			empty_row = row; empty_col = col;
			return true;
		} else {
			return false;
		}
	}
}
