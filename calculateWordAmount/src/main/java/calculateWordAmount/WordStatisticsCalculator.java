package calculateWordAmount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class WordStatisticsCalculator {

	public HashMap<String, Integer> countWordsAndReturnHashmap(String string) {
		string = removeCharactersThatShouldNotBeIncluded(string);
		String[] arrayOfWordsAfterSplit = string.split(" ");
		ArrayList<String> arrayListForEasierIteration = new ArrayList<String>(Arrays.asList(arrayOfWordsAfterSplit));
		HashMap<String, Integer> resultsOfCounting = new HashMap<>();
		for (String currentWord : arrayListForEasierIteration) {
			resultsOfCounting.put(currentWord, Collections.frequency(arrayListForEasierIteration, currentWord));
		}
		return resultsOfCounting;
	}

	private String removeCharactersThatShouldNotBeIncluded(String stringToPurify) {
		stringToPurify = stringToPurify.replace(",", "");
		stringToPurify = stringToPurify.replace(".", "");
		stringToPurify = stringToPurify.replace("-", "");
		stringToPurify = stringToPurify.replace(":", "");
		stringToPurify = stringToPurify.replace(";", "");
		return stringToPurify = stringToPurify.replaceAll("^[0-9,.;]+$", stringToPurify);
	}

}
