package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberer2 {

	private static Scanner word;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Deck.java");
		Scanner scanner = new Scanner(file);
		int total = 0;

		while (scanner.hasNextLine()) {
			String value = scanner.nextLine();
			word = new Scanner(value);

			System.out.println(value);

			while (word.hasNext()) {
				total = total + 1;
				word.next();
			}

			System.out.println(total);

			total = 0;
		}

		while (scanner.hasNextLine()) {
			System.out.println(total);
		}
		scanner.close();

	}

}