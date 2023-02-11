import java.util.Scanner;

public class MyScanner {
	static Scanner sc = new Scanner(System.in);

	private MyScanner() {
	}

	public static String nextLine() {
		return sc.nextLine();
	}

	public static void close() {
		sc.close();
	}
}
