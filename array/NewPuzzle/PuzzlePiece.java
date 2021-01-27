package NewPuzzle;

public class PuzzlePiece {				// 퍼즐조각에 대한 class
										// 퍼즐에 써있는 숫자를 나타내는 face_value

	private int face_value; // the value written on the piece;s face
	
	public PuzzlePiece(int value) {
		face_value = value;
	}
	
	public int getValue() {
		return face_value;
	}
}
