package GridPuzzle;

public class GridPuzzleRun {

	public static void main(String[] args) {
		int number_of_puzzle = 4;
		SlidePuzzleBoard board = new SlidePuzzleBoard(number_of_puzzle);
		PuzzleFrame f = new PuzzleFrame(number_of_puzzle , board);
	}

}
