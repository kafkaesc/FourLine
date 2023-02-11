public class Board {
	private String[][] fourBoard;
	private static final int DEFAULT_BOARD_WIDTH = 7;
	private static final int DEFAULT_BOARD_HEIGHT = 6;
	
	
	Board() {
		fourBoard = new String[DEFAULT_BOARD_HEIGHT][DEFAULT_BOARD_WIDTH];
		for (int i = 0; i < fourBoard.length; i++) {
			for (int j = 0; j < fourBoard[i].length; j++) {
				fourBoard[i][j] = " ";
			}
		}
	}

	/* Checks the board state if anyone has four in a row. */
	public boolean checkForWin() {
		// Not yet implemented
		return false;
	}

	/*
	 * column: The column the user wants to drop their piece into. Limits: 0-6,
	 * representing the 7 columns zero-indexed. Trying to drop a piece into a
	 * full column should return false.
	 */
	public boolean dropPiece(Player player, int column) {
		if (player == null) {
			throw new IllegalArgumentException("null Player object passed to the dropPiece function");
		}
		if (column > fourBoard[0].length) {
			throw new IllegalArgumentException("column provided to dropPiece is larger than the board width");
		}
		System.out.println("fourBoard[0].length: " + fourBoard[0].length);
		// Not yet implemented
		return false;
	}

	/* Converts the board state into a string for output. */
	public String toString() {
		StringBuilder boardString = new StringBuilder(" 1 2 3 4 5 6 7\n");
		for (int i = 0; i < fourBoard.length; i++) {
			for (int j = 0; j < fourBoard[i].length; j++) {
				if (j == 0) {
					boardString.append("|");
				}
				boardString.append(fourBoard[i][j] + "|");
			}
			boardString.append("\n");
		}
		return boardString.toString();
	}
}
