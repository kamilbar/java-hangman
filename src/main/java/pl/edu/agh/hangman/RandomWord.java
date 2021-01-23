package pl.edu.agh.hangman;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;

public class RandomWord {
	
public static String generateWord() throws FileNotFoundException {
		
		Random generator = new Random(); 
		List<String> wordList = FileReader.readInputFile();
		
		int randomNumber = generator.nextInt(wordList.size());
		
		
		return wordList.get(randomNumber);
		
	}
}