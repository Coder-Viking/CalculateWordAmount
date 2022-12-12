package calculateWordAmount;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor().checkAndprocessGivenArguments(args);
		StringBuilder stringBuilder = new LoadTextFromFile().loadTextFromFile(argumentInputOutputHolder.getInputPath());
		HashMap<String, Integer> hashmap = new WordStatisticsCalculator()
				.countWordsAndReturnHashmap(stringBuilder.toString());
		String resultingXmlString; // CreateXmlFromHashmap
	}

}
