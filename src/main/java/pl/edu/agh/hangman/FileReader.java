package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	public static List<String> readInputFile() throws FileNotFoundException {

		File file = new File("src/main/resources/slowa.txt");
		Scanner scanner = new Scanner(file);
		
		List<String> words = new ArrayList<>();
		
		while (scanner.hasNext()) {
			String token = scanner.nextLine();

			words.add(token);
		}
		scanner.close();
		return words;

	}
}
