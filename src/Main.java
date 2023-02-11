public class Main {

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			printMenu();
			String input = MyScanner.nextLine();
			if (input != null) {
				char parsedInput = input.toUpperCase().charAt(0);
				switch (parsedInput) {
				case 'S':
					Setup.run();
					break;
				case 'A':
					System.out.println("Built by Jared Hettinger");
					break;
				case 'Q':
					System.out.println("Exiting...");
					run = false;
					break;
				default:
					System.out.println(parsedInput + " did not correspond to a command.");
					break;
				}
			}
		}
		MyScanner.close();
	}

	public static void printMenu() {
		System.out.println("Enter a command:\n" + "S: Start Game\n" + "A: About this project\n" + "Q: Quit\n");
	}

}
