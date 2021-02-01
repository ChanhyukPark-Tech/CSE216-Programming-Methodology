package Puzzle;

public class Puzzle {
	public static void main(String[] args) {
		SlidePuzzleBoard board = new SlidePuzzleBoard(10);
		PuzzleWriter writer = new PuzzleWriter(board, 10);
		writer.displayPuzzle();
	}
}
