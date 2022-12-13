package calculateWordAmount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class WordStatisticsCalculator {

	public HashMap<String, Integer> countWordsAndReturnHashmap(String string) {
		string = removeCharactersThatShouldNotBeIncluded(string);

		String[] arrayOfWordsAfterSplit = string.split(" ");

		ArrayList<String> arrayListForEasierIteration = convertArrayToArrayList(arrayOfWordsAfterSplit);

		HashMap<String, Integer> resultsOfCounting = putArrayListOfWordsIntoHashMap(arrayListForEasierIteration);

		return resultsOfCounting;
	}

	private String removeCharactersThatShouldNotBeIncluded(String stringToPurify) {
		stringToPurify = stringToPurify.replace(",", "").replace(".", "").replace("-", "").replace(":", "").replace(";",
				"").replace("?", "").replace("!", "");
		// TODO Replace this with working Regex function, much shorter and takes ALL
		// extra Symbols
		return stringToPurify;
	}

	private ArrayList<String> convertArrayToArrayList(String[] stringArray) {
		return new ArrayList<String>(Arrays.asList(stringArray));
	}

	private HashMap<String, Integer> putArrayListOfWordsIntoHashMap(ArrayList<String> arrayListOfWords) {
			HashMap<String,Integer> wordAndCountHolder = new HashMap<>();
			for (String currentWord : arrayListOfWords) {
				wordAndCountHolder.put(currentWord, Collections.frequency(arrayListOfWords, currentWord));
			}
			return wordAndCountHolder;
		
	}

}
