package NewPuzzle;

public class PuzzlePiece {				// ���������� ���� class
										// ���� ���ִ� ���ڸ� ��Ÿ���� face_value

	private int face_value; // the value written on the piece;s face
	
	public PuzzlePiece(int value) {
		face_value = value;
	}
	
	public int getValue() {
		return face_value;
	}
}
