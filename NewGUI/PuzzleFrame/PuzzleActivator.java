package PuzzleFrame;

public class PuzzleActivator {


	public static void main(String[] args) {
		int board_size = 4;
		SlidePuzzleBoard board = new SlidePuzzleBoard(board_size);
		PuzzleFrame view = new PuzzleFrame(board_size , board );
	}
}
