
public class Game {
	int activePlayer;
	Board gameBoard;
	boolean gameOver;
	int playerCount;
	Player[] players;

	@SuppressWarnings("unused")
	private Game() {
	}

	public Game(char player1, char player2) {
		activePlayer = 0;
		gameBoard = new Board();
		gameOver = false;
		playerCount = 2;

		initPlayersFromChars(player1, player2);
		System.out.println("Game Start:\n" + gameBoard);
		while (!gameOver) {
			takeTurn(players[activePlayer]);
		}
	}

	private void nextTurn() {
		activePlayer = ++activePlayer % 2;
	}

	private void initPlayersFromChars(char player1, char player2) {
		players = new Player[2];
		players[0] = new Player(player1);
		players[1] = new Player(player2);
	}

	private void takeTurn(Player player) {
		if (player == null) {
			throw new IllegalArgumentException("null Player object passed into startTurn");
		}
		int col = scanColumnChoice(player);
		nextTurn();
	}

	private void printVictory(Player player) {
		if (player == null) {
			throw new IllegalArgumentException("null Player object passed into printVictory");
		}
		System.out.println(player.playerChar + " wins!!");
	}

	private int scanColumnChoice(Player player) {
		int col = 0;
		boolean isInt = false;
		do {
			System.out.println("Player " + player.playerChar + " choose a column");
			String line = MyScanner.nextLine();
			try {
				col = Integer.parseInt(line);
				isInt = true;
			} catch (NumberFormatException ex) {
				System.out.println("Please enter a number (ex.: 2)");
				continue;
			}
		} while (!isInt);
		return col;
	}
}
