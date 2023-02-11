public class Setup {
	private Setup() {
	}

	public static void run() {
		char[] selectedChars = {};

		char p1Char = scanNextChar(1, selectedChars);
		selectedChars = addCharToArray(p1Char, selectedChars);

		char p2Char = scanNextChar(2, selectedChars);
		selectedChars = addCharToArray(p2Char, selectedChars);

		System.out.print("Player 1 is " + p1Char);
		System.out.println(", Player 2 is " + p2Char + "\n");
		new Game(p1Char, p2Char);
	}

	private static char[] addCharToArray(char newChar, char[] array) {
		char[] newArray = new char[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[array.length] = newChar;
		return newArray;
	}

	private static boolean charInArray(char _char, char[] _arr) {
		for (int i = 0; i < _arr.length; i++) {
			if (_arr[i] == _char) {
				return true;
			}
		}
		return false;
	}
	
	private static char scanNextChar(int playerNumber, char[] selectedChars) {
		char nextChar = ' ';
		boolean isAlreadySelected = false;
		do {
			System.out.println("Enter a character for Player " + playerNumber + ":");
			nextChar = MyScanner.nextLine().toUpperCase().charAt(0);
			isAlreadySelected = charInArray(nextChar, selectedChars);
			if (isAlreadySelected) {
				System.out.println("That character has already been selected,");
				System.out.println("please select another character");
			}
		} while (isAlreadySelected);
		return nextChar;
	}
}
